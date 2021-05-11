import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserProgram5
{
    public static void main(String[] args)
    {
        String baseurl = "https://www.x-cart.com/";

        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get(baseurl);
        driver.close();


    }


}
