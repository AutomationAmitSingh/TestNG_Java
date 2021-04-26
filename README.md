#TestNG
- If we are executing simple testNG tests with @Test annotation then execution of the test cases will happen alphabetically
For example: login method execute first then set up method and at last tear down method.
- @Priority set the execution sequence for the test methods in a test case, For example we want set up to run first then login
and at last tear down so we can set priority for them as we want them to execute.
- @BeforeMethod @AfterMethod they have to be created separately inside each java class and they
always execute before and after of each @Test method
- @BeforeClass @AfterClass they also created for each java class separately and always execute before and after of a
java class level
- @BeforeTest @AfterTest they can be declared in any java class once and they execute at the test case level
- @BeforeSuite @AfterSuite they also can be declared in any java class once and they execute at test suite level
which contains many test cases in side it