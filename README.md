#TestNG
- If we are executing simple testNG tests with @Test annotation then execution of the test cases will happen alphabetically
For example: login method execute first then set up method and at last tear down method.
- @Test(priority=0) set the execution sequence for the test methods in a test case, For example we want set up to run first then login
and at last tear down so we can set priority for them as we want them to execute.
- @BeforeMethod @AfterMethod they have to be created separately inside each java class and they
always execute before and after of each @Test method
- @BeforeClass @AfterClass they also created for each java class separately and always execute before and after of a
java class level
- @BeforeTest @AfterTest they can be declared in any java class once and they execute at the test case level
- @BeforeSuite @AfterSuite they also can be declared in any java class once and they execute at test suite level
which contains many test cases in side it
- @Test(enabled = false) make test case not to execute
- @Test(dependsOnMethod = "Method Name") this method only execute when its depending method successfully executed and passed. On fail this 
method will be ignored
- @Test(alwaysRun = true) with this a method always execute irrespective of any condition
- @DataProvider(name = "loginData") given to the method having return type 2d Object[][] and then this method is called 
in test method @Test(dataProvider = "loginData",dataProviderClass = CustomDataProvider.class)
- Parameters we define in testng xml and then call that parameters values in methods by using below annotations
  @Parameters({"browser","url"})
  public void setUp(String browser, String url) {
In testng xml
  <parameter name="browser" value="firefox"/>
  <parameter name="url" value="https://opensource-demo.orangehrmlive.com/"/>  
- Parallel testing can be applied to method level class level and test level too
  <suite name="All Test Suite" parallel="classes" thread-count="2">
- Listners can be executed in two ways one applying directly on class and other in testng xml
-One : @Listeners(Custom_Listners.class) where Custom_Listners where all method implemented from Itestlistners
-Second : 
  <suite name="All Test Suite" parallel="classes" thread-count="2">
  <listeners>
  <listener class-name="Custom_Listners"></listener>
  </listeners>  