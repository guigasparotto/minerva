import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by guigasparotto on 03/12/2017.
 */
public class DriverFactory {

    // This method returns a WebDriver object
    public static WebDriver open(String browserType) {
        if (browserType.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver");
            return new ChromeDriver();
        }
        else {
            System.setProperty("webdriver.gecko.driver", "firefoxdriver/geckodriver");
            return new FirefoxDriver();
        }
    }

}