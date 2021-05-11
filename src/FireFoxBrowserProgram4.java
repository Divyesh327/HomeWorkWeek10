import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserProgram4
{
    public static void main(String[] args)
    {

        String baseurl = "https://www.harrow.gov.uk/";

        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get(baseurl);

        driver.close();


    }



}
