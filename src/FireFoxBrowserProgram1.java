import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserProgram1
{

    public static void main(String[] args)
    {
        String baseurl = "https://www.nopcommerce.com/demo";

        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get(baseurl);
        driver.close();



    }



}
