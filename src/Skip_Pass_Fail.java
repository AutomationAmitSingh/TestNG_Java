import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Skip_Pass_Fail {

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

    @BeforeTest
    public void beforeTest()
    {
        System.out.println(" <--------Before Test---------> ");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println(" <--------After Test---------> ");
    }

    // Skip Test
    @Test
    public void skipTestMethod() {
        throw new SkipException("Skipped Test");
    }

    // Pass Test
    @Test
    public void passTestMethod() {
        Assert.assertTrue(true);
    }

    // Fail Test
    @Test
    public void failTestMethod() {
        Assert.assertTrue(false);
    }
}
