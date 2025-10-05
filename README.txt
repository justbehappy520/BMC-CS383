Partners: Rebecca Lassman, Megan Louie, :3
Target.jpf
    1. 4 paths | 4 sat | 0 unsat
    2. Yes, it found the divide by 0 error.
    3. 00:00:00
    4. input space: 1.8446744 * 10^19 | worst case: 2147483649
Target2.jpf
    1. 2 paths | 2 sat | 0 unsat
    2. No, it crashed before it could find the bug because jpf cannot run nonlinear calculations.
    3. 00:00:00
    4. input space: 2^32 - 1 | worst case: 1
Target3.jpf
    1. 6 paths | 3 sat | 3 unsat
    2. Yes, it found the bug because it threw an assertion error.
    3. 00:00:47
    4. input space: 2^32 - 1 | worst case: 1
Target4.jpf
    1. 12 paths | 7 sat | 5 unsat
    2. Yes, it found the divide by 0 error.
    3. 00:00:00
    4. input space: 2^32 - 1 | worst case: 2^32 - 2
Target5.jpf 
    1. 19608 paths | 14559 sat | 5049 unsat
    2. Yes, it found the divide by 0 error.
    3. 00:02:21
    4. input space: 2^96 | worst case: 100 * 2^31 + 4950
Target6.jpf
    1. It didn't finish running, but I think we said something like 2^39 paths in class.
    2. No, it never finished running because of path explosion.
    3. It just kept on going and going and going...
    4. input space: 2^96 | worst case: 

Discuss the pros and cons of symbolic execution vs testing. Use at least one example from the target files.
    Some pros of symbolic execution vs testing is that symbolic execution has high path coverage and seems to find any/all bugs in the program even without assertions.
    Some cons of symbolic execution vs testing is that symbolic execution doesn't scale well and struggles with larger files with lots of paths due to issues of path explosion.
    This can be seen in Target5.java when there are 19608 paths and the runtime is 2:21 long compared to the 12 paths and 00:00 runtime of Target4.java.
Discuss the pros and cons of symbolic execution vs formal verification. Use at least one example from the target files.
    Some pros of symbolic execution vs formal verification is that symbolic execution focuses on finding bugs and gives real input that triggers the issue.
    Some cons of symbolic execution vs formal verification is that symbolic execution is not guaranteed to be sound or complete, it only says "no bugs found in X paths" not "there are no bugs".
    This can be seen in Target6 where the program kind of runs on for too long to find the bug or calculate the number of paths.
Some targets in this lab did not have assertions, but the tool could still find bugs. Why? What does java path finder use for postconditions?
    The tool could still find bugs because jpf can find runtime exceptions even without explicit assertions, such as ArithmeticException, NullPointerException, and AssertionError. Essentially, jpf has built-in checks to look for things that cause the program to crash and write the postconditions. 
Compare the outputs on Target 5 and Target 6. Was there a difference? why/why not? Your answer should include a discussion involving input.txt
    Target6.java ran for way longer than Target5.java because of the last if statement in Target6.java. The condition, line.length() > 0, is not bounded, this causes Target6.java to encounter path explosion. The content of input.txt is 1, but this doesn't seem to factor into what symbolic execution uses to run the code because it runs so many more paths, including all possible lengths of line.length() and cases where line.length() == 0.