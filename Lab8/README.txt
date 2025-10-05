Partners: Rebecca Lassman, Megan Louie :3

Part 1: Deductive Reasoning
    Problem 1: Condition Strength
        1. { -1 ≤ x ≤ 1 }
        2. None.
        3. None.
        4. { x > 0 ∧ y ≥ 0 }
        5. { x is int }
    Problem 2: Hoare Triplets
        1. Valid. 
        2. Invalid. Since z is greater than x, the difference between z and x will always be positive. To make it valid, I would change the postcondition to { y > 0}
            { z > x }
            y = z - x;
            { y > 0 }
    Problem 3: Forward Reasoning with Assignment Statements
        1. 
            { y > z }
            y = y - z;
            { y > 0 }
            y = y + 2;
            { y > 2 }
        2. 
            { z*z < 64 }
            z = -z;
            { |z| < 8 }
            z = z / 2;
            { |z| < 4 }
            z = z + 4;
            { 0 < x < 8 }
        3. 
            { x is odd }
            y = x * x;
            { y is odd && x is odd }
            w = y mod 4;
            { w = 1 && y is odd && x is odd }
    Problem 4: Backward Reasoning with Assignment Statements
        1. 
            { x <= 2 }
            z = x - 4;
            { z + x ≤ 0 }
            y = z + x;
            { y ≤ 0 }
        2. 
            { z > w + 4 }
            x = 2 * w + 8;
            { x / 2 < z }
            z = 2 * z;
            { z > x }
    Problem 5: Backward Reasoning with If/Else Statements
        1.
            { true }
            if (x ≤ 0)
                { x ≠ 0 }
                x = x * x;
                { x ≠ 0 }
            else
                { x ≠ -1 }
                x = x + 1;
                { x ≠ 0 }
            { x ≠ 0 }
    Problem 6: Verifying Correctness
        1. 
            { z > 1 }
            y = z - 1;
            { y > 0 }
            w = 2 * y;
            { w > 0 }
            w = w + 1;
            { w > 1 }
        2. 
            { x ≥ w }
            w = w / 2;
            { x ≥ 2 * w }
            z = 2 * w + 2;
            { x ≥ z - 2 }
            x = x + 2;
            { x ≥ z }
            y = x;
            { y ≥ z }
        3. 
            { y > 0 }
            if (x == y)
                { y ≥ -1 }
                x = -1;
                { x < y }
            else
                { x ≠ y }
                x = y - 1;
                { x < y }
            { x < y }
    Problem 7: Loops
        1. State a suitable loop invariant.
            { x ≥ 0 }
            int i = x;
            int p = 0;
            while (i != 0) {
                p = p + y;
                i = i - 1; 
            }
            { p = x * y }

            Loop Invariant: i ≥ 0 && p = (x - i) * y
        2. Write a loop that computes the minimal value in a non-empty array of integers. State a suitable loop invariant.
            { arr != null ∧ arr.Length > 0 }
            i = 0;
            z = arr[0];
            while ( i < arr.Length ) {
                if (arr[i] < z) {
                    z = arr[i];
                }
                i = i + 1;
            }
            { forall k :: 0 <= k < arr.Length ==> arr[k] >= z }

            Loop Invariant: forall k :: 0 <= k < i ==> arr[k] >= z
Part 2: Dafny
    
