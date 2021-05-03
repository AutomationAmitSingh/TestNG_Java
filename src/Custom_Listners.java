import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Custom_Listners implements ITestListener {

    public void onStart(ITestContext arg)
    {
       System.out.println("<----On initial start execution---->"+arg.getName());
    }

    public void onFinish(ITestContext arg)
    {
        System.out.println("<----On last finish execution---->"+arg.getName());
    }

    public void onTestStart(ITestResult arg)
    {
        System.out.println("<----On testcase start execution---->"+arg.getName());
    }

    public void onTestSuccess(ITestResult arg)
    {
        System.out.println("<----On testcase success execution---->"+arg.getName());
    }

    public void onTestFailure(ITestResult arg)
    {
        System.out.println("<----On testcase failure execution---->"+arg.getName());
    }

    public void onTestSkipped(ITestResult arg)
    {
        System.out.println("<----On testcase skipped execution---->"+arg.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result)
    {
        System.out.println("<----On testcase failed but with in success percentage execution---->"+result.getName());
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
        System.out.println("<----On testcase failed with timeout execution---->"+result.getName());
    }

}
