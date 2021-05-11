import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerBrowserProgram3
{

    public static void main(String[] args)
    {
        String baseurl = "https://www.wcht.org.uk/";

        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");

        WebDriver driver = new InternetExplorerDriver();

        driver.get(baseurl);
        driver.close();


    }


}
