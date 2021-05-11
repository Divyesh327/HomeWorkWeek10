import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerBrowserProgram5
{
    public static void main(String[] args)
    {

        String baseurl = "https://www.x-cart.com/";

        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");

        WebDriver driver = new InternetExplorerDriver();

        driver.get(baseurl);
        driver.close();


    }


}
