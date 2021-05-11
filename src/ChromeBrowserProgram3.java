import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserProgram3
{
    public static void main(String[] args)
    {

        String baseurl = "https://www.wcht.org.uk/";

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get(baseurl);
        driver.close();

    }


}
