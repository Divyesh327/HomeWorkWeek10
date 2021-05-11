import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserProgram2
{
    public static void main(String[] args)
    {

        String baseurl = "https://www.barclays.co.uk/";

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get(baseurl);

        driver.close();

    }


}
