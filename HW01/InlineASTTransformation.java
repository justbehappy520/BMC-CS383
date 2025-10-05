import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.stmt.Statement;

import java.io.*;
import java.util.*;

public class InlineASTTransformation {
    public static void main(String[] args) throws Exception {
        // handle command line argument issues
        if (args.length != 1) {
            System.out.println("Usage: java InlineASTTransformation <source-file>"); // log for debugging
            return;
        }

        // read and parse Java source file
        String filename = args[0];
        JavaParser parser = new JavaParser(); // made to parse files
        FileInputStream inputStream = new FileInputStream(filename);

        // parse program into an AST
        CompilationUnit cu = parser.parse(inputStream).getResult().get();
        // cu parses Java source file into CompilationUnit object, represents root node of AST
        // .getResult().get() extracts parsed result

        // create an inliner visitor
        MethodInliner inliner = new MethodInliner(); // modifies AST by inlining small methods
        inliner.collectSmallMethods(cu); // find small methods
        inliner.findMethodCalls(cu); // find method calls

        // write transformed source to a new file
        String outputFileName = filename.replace(".java", "Transformed.java");
        try (FileWriter writer = new FileWriter(outputFileName)) { // write transformed source code to new file
            // convert cu back to string and write to new file
            writer.write(cu.toString());
        }
        System.out.println("Transformation complete. Output written to " + outputFileName); // log for debugging
    }

    /*
     * ModifierVisitor - modifies the underlying tree.
     * return type is a Node
     * checks if the method has less than five lines   
     */
    private static class MethodInliner extends ModifierVisitor<String> {
        // hashmap to store methods to be inlined
        private final Map<String, MethodDeclaration> methods = new HashMap<>();

        // find and store small methods
        public void collectSmallMethods(CompilationUnit cu) {
            // traverse all methods in AST
            cu.findAll(MethodDeclaration.class).forEach(method -> {
                // check if methods have fewer than 5 statements
                if (method.getBody().isPresent()) {
                    BlockStmt body = method.getBody().get();
                    if (body.getStatements().size() < 5) {
                        // put small method in hashmap
                        methods.put(method.getNameAsString(), method);
                    }
                }
            });
        }

        // find method calls
        public void findMethodCalls(CompilationUnit cu) {
            // traverse method for method calls
            cu.findAll(MethodCallExpr.class).forEach(methodCall -> {
                // check the hashmap for method
                String methodName = methodCall.getNameAsString();
                if (methods.containsKey(methodName)) {
                    MethodDeclaration methodDec = methods.get(methodName);
                    BlockStmt body = methodDec.getBody().get(); // why clone?
                    NodeList<Parameter> params = methodDec.getParameters(); // params in method declaration
                    NodeList<Expression> args = methodCall.getArguments(); // args from method call

                    // map param to arg
                    Map<String, Expression> paramToArg = new HashMap<>();
                    for (int i = 0; i < params.size() && i < args.size(); i++) {
                        String paramName = params.get(i).getNameAsString();
                        Expression argVal = args.get(i);
                        if (i < args.size()) {
                            paramToArg.put(paramName, argVal);
                        }
                    }

                    // replace params with corresponding arguments in method body
                    body.findAll(NameExpr.class).forEach(nameExpr -> { // find NameExpr nodes, representing variable references
                        String name = nameExpr.getNameAsString();
                        if (paramToArg.containsKey(name)) {
                            // replace with corresponding args
                            nameExpr.replace(paramToArg.get(name));
                        }
                    });

                    // determine how to inline method body
                    Node parent = methodCall.getParentNode().orElse(null);
                    if (parent instanceof VariableDeclarator) { // inside assignment
                        VariableDeclarator varDec = (VariableDeclarator) parent;
                        body.findAll(ReturnStmt.class).forEach(returnStmt -> {
                            returnStmt.getExpression().ifPresent(varDec::setInitializer);
                        });
                        methodCall.remove(); // remove after inlining
                    } else if (parent instanceof ExpressionStmt) { // replace ExpressionStmt with extracted block
                        Statement parentStmt = (Statement) parent;
                        NodeList<Statement> newStmts = extractStmt(body);

                        if (!newStmts.isEmpty()) {
                            parentStmt.replace(new BlockStmt(newStmts));
                        } else {
                            parentStmt.remove();
                        }
                    } else {
                        Statement parentStatement = findParentStatment(methodCall);
                        if (parentStatement != null) {
                            NodeList<Statement> newStatements = new NodeList<>();
                            body.getStatements().forEach(newStatements::add);  // No cloning here
                            parentStatement.replace(new BlockStmt(newStatements));
                        }
                    }
                }
            });
        }
    }
    
    // find parent node that is a Statement
    private static Statement findParentStatment(Node node) {
        while (node != null && !(node instanceof Statement)) {
            node = node.getParentNode().orElse(null);
        }
        return (Statement) node;
    }

    // extract statements from body, ignoring return statements
    private static NodeList<Statement> extractStmt(BlockStmt body) {
        // list for extracted statments
        NodeList<Statement> newStmts = new NodeList<>();
        for (Statement stmt : body.getStatements()) {
            if (!(stmt instanceof ReturnStmt)) {
                // add the statement if is not return statment
                newStmts.add(stmt);
            } else {
                // if there is an expression, convert and add
                ((ReturnStmt) stmt).getExpression().ifPresent(expr -> newStmts.add(new ExpressionStmt(expr)));
            }
        }
        return newStmts;
    }
}