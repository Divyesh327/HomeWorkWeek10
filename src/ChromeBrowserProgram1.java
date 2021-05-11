import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserProgram1

{

    public static void main(String[] args)
    {
        String baseurl = "https://www.nopcommerce.com/demo";

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(baseurl);
        driver.close();

    }

}
