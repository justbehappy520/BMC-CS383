Question 1:
    My code created two mutants. I changed the < to <= and > to >= under the booleans isMinor and isSenior.

Question 2:
    TestBad:
        changed < to <=: survived
        changed > to >=: survived
    TestMedium:
        changed < to <=: survived
        changed > to >=: survived
    TestStrong:
        changed < to <=: survived
        changed > to >=: survived


Question 3:
    Both of my generated mutants compiled successfully.

Question 4:
    TestBad:
        0%
    TestMedium:
        0%
    TestStrong:
        0%

Question 5:
    Sort of?
    No. All three tests test for roughly the same thing and don't cover any edge cases.
    Yes. At least, I believe so. I copied some of the mutations generated from pitest.

Question 6:
    AST.
