import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.expr.BinaryExpr.Operator;

import java.io.*;
import java.util.*;

public class ASTMutation {
    public static void main(String[] args) throws Exception {
        // Ensure the user has provided a filename
        if (args.length < 1) {
            System.out.println("Please provide a Java source file.");
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

        mutate(cu);

        // write transformed source to a new file
        String outputFileName = filename.replace(".java", "Transformed.java");
        try (FileWriter writer = new FileWriter(outputFileName)) { // write transformed source code to new file
            // convert cu back to string and write to new file
            writer.write(cu.toString());
        }
        System.out.println("Transformation complete. Output written to " + outputFileName); // log for debugging
    }

    // manually traverse the AST and mutate conditionals
    private static void mutate(CompilationUnit cu) {
        cu.findAll(BinaryExpr.class).forEach(n -> {
            // change < to <=
            if (n.getOperator() == Operator.LESS) {
                n.setOperator(Operator.LESS_EQUALS);  // mutant: change < to <=
            }
            // change > to >=
            if (n.getOperator() == Operator.GREATER) {
                n.setOperator(Operator.GREATER_EQUALS); // mutant: change > to >=
            }
        });
    }
}
