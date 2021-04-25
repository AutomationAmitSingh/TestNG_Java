#TestNG
- If we are executing simple testNG tests with @Test annotation then execution of the test cases will happen alphabetically
For example: login method execute first then set up method and at last tear down method.
- @Priority set the execution sequence for the test methods in a test case, For example we want set up to run first then login
and at last tear down so we can set priority for them as we want them to execute.