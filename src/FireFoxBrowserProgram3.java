import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserProgram3
{
    public static void main(String[] args)
    {

        String baseurl = "https://www.wcht.org.uk/";

        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get(baseurl);
        driver.close();


    }


}
