import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOn_AlwaysRun_Method {

    @Test(alwaysRun = true, priority = 0)
    public void wakeUp()
    {
        System.out.println(" Wake up method executing ... ");
        Assert.fail();
    }

    @Test(dependsOnMethods = "wakeUp", priority = 1)
    public void getFresh()
    {
        System.out.println(" Get fresh method executing ... ");
    }

    @Test(dependsOnMethods = "getFresh", priority = 2, enabled = false)
    public void work()
    {
        System.out.println(" Work method executing ... ");
    }

    @Test(dependsOnMethods = "wakeUp", priority = 3)
    public void goToBed()
    {
        System.out.println(" Go to bed method executing ... ");
    }

    @Test(dependsOnMethods = "goToBed", alwaysRun = true, priority = 4)
    public void sleep()
    {
        System.out.println(" Sleep method executing ... ");
    }
}
