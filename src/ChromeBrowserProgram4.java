import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserProgram4
{

    public static void main(String[] args)
    {

        String baseurl = "https://www.harrow.gov.uk/";

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get(baseurl);
        driver.close();



    }


}
