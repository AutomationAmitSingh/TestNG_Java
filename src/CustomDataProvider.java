import org.testng.annotations.DataProvider;

public class CustomDataProvider {

    @DataProvider(name = "loginData")
    public Object[][] getData()
    {
      Object[][] data = {{"Amit","Singh"},
              {"Qwerty","Asdfgh"},{"Practice","Test"}};

      return data;
    }

}
