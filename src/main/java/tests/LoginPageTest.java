package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.Dashboard;
import pages.LoginPage;
import util.DriverFactory;

public class LoginPageTest {

    private WebDriver driver;
    private LoginPage loginPage;
    private String validEmail = "gdadald3@gmail.com";
    private String invalidEmail = "gdadald4@gmail.com";
    private String validPassword = "123456";
    private String invalidPassword = "1234";

    @Before
    // Runs before every test method in the class
    public void setUp() {
        // Creates a DriverFactory object and opens the chrome browser
        driver = DriverFactory.open("chrome");
        loginPage = new LoginPage(driver);

        // Navigates to the web app
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @Test
    public void login_successful_test() {

        // Enter login information
        loginPage.login(validEmail, validPassword);

        // Get confirmation once the page loads dashboard
        Dashboard dashboard = new Dashboard(driver);
        String confirmation = dashboard.welcomeMessage();
        Assert.assertTrue(confirmation.contains("Welcome to your account."));

        // Verifies if the page title is correct
        Assert.assertTrue(dashboard.title().contains("My account - My Store"));
    }

    @Test
    public void login_failed_invalid_email_test() {

        // Enter login information
        loginPage.login(invalidEmail, validPassword);

        // Verifies if error messages are correctly loaded
        Assert.assertTrue(loginPage.errorAlert().contains("There is 1 error"));
        Assert.assertTrue(loginPage.invalidUserMsg().contains("Authentication failed."));

        // Verifies if the page title is correct - remains the same
        Assert.assertTrue(loginPage.title().contains("Login - My Store"));
    }

    @Test
    public void login_failed_invalid_password_test() {

        // Enter login information
        loginPage.login(validEmail, invalidPassword);

        // Verifies if error messages are correctly loaded
        Assert.assertTrue(loginPage.errorAlert().contains("There is 1 error"));
        Assert.assertTrue(loginPage.invalidPasswordMsg().contains("Invalid password."));

        // Verifies if the page title is correct - remains the same
        Assert.assertTrue(loginPage.title().contains("Login - My Store"));
    }

    @After
    // Runs after every test method in the class
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }

}
