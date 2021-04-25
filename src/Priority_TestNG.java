import org.testng.annotations.Test;

public class Priority_TestNG {

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
