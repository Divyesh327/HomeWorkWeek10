import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerBrowserProgram2
{
    public static void main(String[] args)

    {
        String baseurl = "https://www.barclays.co.uk/";

        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");

        WebDriver driver = new InternetExplorerDriver();

        driver.get(baseurl);

        driver.close();



    }



}
