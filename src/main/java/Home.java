import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class Home {

    @Test
    // Simple example - tests should be simple, objective and easy to read
    public void verify_home_page_title() {

        // Creates a DriverFactory object and opens the chrome browser
        WebDriver driver = DriverFactory.open("chrome");

        // Navigates to the web app
        driver.get("https://www.lojaminerva.com.br/");

        // Verifies the page title and returns an error message in case it is not correct
        Assert.assertEquals("Title check failed", "LOJA MINERVA | Moda Alternativa do Petit ao Plus Size", driver.getTitle());

        // Closes driver
        driver.close();

        // Quits driver
        driver.quit();
    }

}
