import org.testng.annotations.*;

public class Priority_TestNG {

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println(" <--------Before Method---------> ");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println(" <--------After Method---------> ");
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println(" <--------Before Class---------> ");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println(" <--------After Class---------> ");
    }

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println(" <--------Before Suit---------> ");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println(" <--------After Suit---------> ");
    }

    @Test(priority = 1)
    public void setUp()
    {
        System.out.println(" This is a set up method should execute first ");
    }

    @Test(priority = 2)
    public void login()
    {
        System.out.println(" This is a login method should execute after set up ");
    }

    @Test(priority = 3)
    public void tearDown()
    {
        System.out.println(" This is a tear down method should execute at last ");
    }
}
