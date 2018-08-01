package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.Authentication;
import pages.Dashboard;
import util.DriverFactory;

public class AuthenticationTest {

    private WebDriver driver;

    @Before
    // Runs before every test method in the class
    public void setUp() {
        // Creates a DriverFactory object and opens the chrome browser
        driver = DriverFactory.open("chrome");

        // Navigates to the web app
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @Test
    public void loginTest() {

        // Enter login information
        Authentication login = new Authentication(driver);
        login.setLoginEmail("gdadald3@gmail.com");
        login.setLoginPassword("123456");
        login.clickSignIn();

        // Get confirmation once the page loads dashboard
        Dashboard dashboard = new Dashboard(driver);
        String confirmation = dashboard.welcomeMessage();
        Assert.assertTrue(confirmation.contains("Welcome to your account."));
    }


    @After
    // Runs after every test method in the class
    public void tearDown() {
        // Closes driver
        driver.close();

        // Quits driver
        driver.quit();
    }

}
