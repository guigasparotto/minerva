package com.automationpractice.tests;

import com.automationpractice.base.TestBase;
import com.automationpractice.pages.DashboardPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    private LoginPage loginPage;
    private HomePage homePage;
    private DashboardPage dashboardPage;
    private String validEmail = "gdadald3@gmail.com";
    private String invalidEmail = "gdadald4@gmail.com";
    private String validPassword = "123456";
    private String invalidPassword = "1234";
    private static int counter = 10;

    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void SetUp() {
        initialisation();
        homePage = new HomePage();
        loginPage = homePage.clickSignInLink();
    }

    @Test(priority = 1)
    public void loginPageTitleTest() {

        // Enter login information
        loginPage.login(validEmail, validPassword);

        String title = loginPage.getLoginPageTitle();

        // Verifies if the page getLoginPageTitle is correct
        Assert.assertEquals(title, "My account - My Store");
    }

    @Test(priority = 2)
    public void loginPageLogoTest() {
        boolean logoFound = loginPage.isLogoDisplayed();
        Assert.assertTrue(logoFound);
    }

    @Test(priority = 3)
    public void loginSuccessfulTest() {

        // Enter login information
        dashboardPage = loginPage.login(validEmail, validPassword);

        // The same result can be achieved through the code below
        // This line uses information from the config.properties file (need to figure it out the best way)
        // dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

        // Get confirmation once the page loads dashboardPage
        Assert.assertEquals(dashboardPage.welcomeMessage(), "Welcome to your account. " +
                "Here you can manage all of your personal information and orders.");
    }

    @Test(priority = 5)
    public void loginFailedInvalidEmailTest() {

        // Enter login information
        loginPage.login(invalidEmail, validPassword);

        // Verifies if error messages are correctly loaded
        Assert.assertTrue(loginPage.errorAlert().contains("There is 1 error"));
        Assert.assertTrue(loginPage.invalidUserMsg().contains("Authentication failed."));

        // Verifies if the page getLoginPageTitle is correct - remains the same
        Assert.assertTrue(loginPage.getLoginPageTitle().contains("Login - My Store"));
    }

    @Test(priority = 6)
    public void loginFailedInvalidPasswordTest() {

        // Enter login information
        loginPage.login(validEmail, invalidPassword);

        // Verifies if error messages are correctly loaded
        Assert.assertTrue(loginPage.errorAlert().contains("There is 1 error"));
        Assert.assertTrue(loginPage.invalidPasswordMsg().contains("Invalid password."));

        // Verifies if the page getLoginPageTitle is correct - remains the same
        Assert.assertTrue(loginPage.getLoginPageTitle().contains("Login - My Store"));
    }

    @Test
    public void createAccountSuccessfulTest() {
        loginPage.setNewAccountEmail(createEmail());
    }

    public String createEmail() {
        this.counter ++;
        return "gdadald" + counter + "@gmail.com";
    }


    @AfterMethod
    // Runs after every test method in the class
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }

}
