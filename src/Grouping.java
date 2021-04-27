import org.testng.annotations.Test;

public class Grouping {

    @Test(groups = {"Sanity"})
    public void test1()
    {
      System.out.println(" This is testcase Test1 ");
    }

    @Test(groups = {"Regression"})
    public void test2()
    {
        System.out.println(" This is testcase Test2 ");
    }

    @Test(groups = {"Sanity","Regression"})
    public void test3()
    {
        System.out.println(" This is testcase Test3 ");
    }
}
