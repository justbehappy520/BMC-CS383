Partner: Rebecca

Part 1:
    The program was supposed to check if a CategoryDataset called dataset was null before trying to call a method on it. However, the
    program does not return when dataset is null and instead lets it pass through, which would have led to a NullPointerException. As it
    might have caused a NullPointerException, this bug is a safety property violation.
Part 2:
    1. Randoop generated 74 tests.
    2. Yes, some of the bugs trigger the tests because the generated tests failed on the buggy version, all 74 of them, but only 56 tests
    failed on the fixed version, indicating that 18 tests passed. I don't think I should be too surprised by the results. I know that
    Randoop generated a lot of assertions for expected behavior, mostly checking if the object is equal to itself. Since the buggy version
    throws an AssertionFailedException, I think it is within expectation that it violates a lot of what Randoop expects. Fixing the bug does
    not necessarily mean there will not be other issues, because the test might have failed due to the bug, but it could have also failed 
    due to unrelated reasons like Randoop making false assumptions.
    3. Line coverage: 23.5% | Condition coverage: 17.4%
Randoop generated tests seem to just aim for a general scope. It's like tossing a net over a large area and hoping that you'll catch fish?
The manually written tests target the specific issue and don't make extraneous assumptions that do not apply to the current bug.
