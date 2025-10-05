Some constructs that will cause my bytecode transformation implementation to fail:
- multiple return statements: implementation supposedly assumes one return statement
- usage of this statement: implementation hard-codes the removal of aload
- loops: implementation does not have proper handling of jumps and gotos
- try-catch blocks: implementation does not have proper handling of jumps

Some constructs that will cause my AST transformation implementation to fail:
- multiple return statements: implementation does not have proper handling
- recursive method calls: implementation doesn't handle this?
- methods with same names but different params: implementation uses method name as hashmap key

Bytecode v. AST Representation
- Bytecode:
    - performed at the JVM instruction level
- AST:
    - syntax is preserved
    - performed at the source code level

Bytecode Adv-DisAdv:
- Adv:
    - high control over performance optimizations
    - reduce method call
- DisAdv:
    - less flexible, does not have high-level structure
    - harder, ASM requires manual bytecode manipulation :(
    - may make debugging harder
    - lower level, more error prone

AST Adv-DisAdv:
- Adv:
    - more flexible, combine with source-level transformations
    - easier, JavaParser provides a structured AST :)
    - high control over method structure and readability
    - higher level, so less error prone
- DisAdv:
    - may introduce redundant code

Bytecode v. AST Scenarios
- Bytecode:
    - readability is important
    - optimize source code
    - analyze code at source level
- AST:
    - optimize runtime performance
    - modify class file without access to source