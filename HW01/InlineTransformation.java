import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

import java.io.*;
import java.util.*;

public class InlineTransformation {
    public static void main(String[] args) throws Exception {
        // handle empty command-line
        if (args.length == 0) {
            System.out.println("Please provide a .class file as a command-line argument."); // log for debugging
            return;
        }

        // get the class file
        String inputClassFile = args[0]; // takes in first command line argument, assumed to be .class file
        FileInputStream fis = new FileInputStream(inputClassFile); // opens .class file to read data

        // read the class file
        ClassReader classReader = new ClassReader(fis); // reads .class file
        ClassNode classNode = new ClassNode(); // in-memory representation of the class
        classReader.accept(classNode, 0); // store result of classReader in classNode, 0 indicates no flags
        fis.close(); // close the stream to avoid resource leaks

        // hash map to store small methods (less than 10 instructions) and their instructions
        Map<String, InsnList> smallMethods = new HashMap<>();
        Map<String, Integer> methodParam = new HashMap<>();
        String key = null; // key for smallMethods
        Integer paramCount = 0; // count the params as an Integer
        int returnOpcode = -1;

        // correctly counts the number of instructions in the methods and identifies small methods
        for (MethodNode method : classNode.methods) { // iterates through all method nodes
            if (!method.name.equals("<init>")) { // skip class constructor
                int instructionCount = method.instructions.size(); // number of instructions in method
                if (instructionCount < 10) { // make sure less than 10 instructions
                    String methodNodeName = method.name; // retrieve method name
                    String methodNodeDesc = method.desc; // retrieve method descriptor
                    key = methodNodeName + methodNodeDesc; // store name + descriptor as key
                    paramCount = Type.getArgumentTypes(method.desc).length;
                    smallMethods.put(key, method.instructions); // put into hashmap
                    methodParam.put(key, paramCount); // put into hashmap
                    returnOpcode = Type.getReturnType(method.desc).getOpcode(Opcodes.IRETURN);
                    System.out.println("key: " + key + " - insn: " + instructionCount); // log for debugging
                }
            }
        }
        // up until this point it still works
        // here on out it doesn't work
        // replace method call and inline the method
        for (MethodNode methodNode : classNode.methods) { // iterate through class to access current method
            InsnList nodeInstructions = methodNode.instructions; // retrieve instructions of current method
            InsnList inlinedInstructions = null; // list of instructions to inline
            List<AbstractInsnNode> instructionsToRemove = new ArrayList<>(); // list of instructions to remove
            // iterate through the instructions to find method calls
            for (AbstractInsnNode insn : methodNode.instructions) {
                if (insn instanceof MethodInsnNode) { // check if the instruction is a method call
                    MethodInsnNode methodInsn = (MethodInsnNode) insn;
                    key = methodInsn.name + methodInsn.desc; // retrieves information for key for inline method
                    System.out.println("key: " + key); // log for debugging
                    if (smallMethods.containsKey(key)) {
                        // inline the instructions from the small method
                        inlinedInstructions = smallMethods.get(key); // retrieve instructions of inline method
                        int paramNum = methodParam.get(key);
                        // remove aload_0 which is part of the method call
                        AbstractInsnNode prev = insn.getPrevious();
                        while (prev != null) {
                            if (prev.getOpcode() == Opcodes.ALOAD && ((VarInsnNode) prev).var == 0) {
                                instructionsToRemove.add(prev);
                                break;
                            }
                            prev = prev.getPrevious();
                        }
                        // skip over unnecessary instructions
                        boolean isStatic = (methodNode.access & Opcodes.ACC_STATIC) != 0;
                        int paramStart = isStatic ? 0 : 1;  // 0 for static methods, 1 for non-static
                        int paramEnd = paramStart + paramNum - 1;  // last slot used by method parameters
                        for (AbstractInsnNode abs : methodNode.instructions) {
                            if (abs.getOpcode() != returnOpcode) {
                                break;
                            }
                            if (abs instanceof VarInsnNode) {
                                VarInsnNode varInsn = (VarInsnNode) abs; // casting to access specific properties
                                //nt opcode = varInsn.getOpcode();
                                if (varInsn.getOpcode() == Opcodes.ILOAD) {
                                    if (varInsn.var >= paramNum && varInsn.var <= paramEnd) {
                                        System.out.println("Skipping ILOAD for parameter index: " + varInsn.var);
                                        continue;
                                    }
                                }
                            }

                        }
                        instructionsToRemove.add(insn); // add method call to removal list
                        nodeInstructions.insert(insn,inlinedInstructions);
                    }
                }
            }
            // remove instructions
            for (AbstractInsnNode toRemove : instructionsToRemove) {
                if (nodeInstructions != null) {
                    nodeInstructions.remove(toRemove);
                }
            }
        }

        // write modified bytecode to new .class file
        //ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        classNode.accept(classWriter); // convert back to bytecode and store

        // create new file with new name
        String outputClassFile = inputClassFile.replace(".class", "Transformed.class");
        FileOutputStream fos = new FileOutputStream(outputClassFile); // write to new .class file
        fos.write(classWriter.toByteArray()); // save the transformed bytecode
        fos.close(); // close the stream to avoid resource leaks
        System.out.println("Transformation complete. New class file: " + outputClassFile); // log for debugging
    }
}