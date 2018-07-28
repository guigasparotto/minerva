import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {

        // 1. Open the web browser
        Webdriver driver = DriverFactory.open("chrome");

        // 2. Navigate to the web app
        driver.get("https://www.lojaminerva.com.br/");

    }

}
