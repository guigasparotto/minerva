package com.automationpractice.tests;

import com.automationpractice.base.TestBase;
import com.automationpractice.pages.CreateAccountPage;
import com.automationpractice.pages.DashboardPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.LoginPage;
import com.automationpractice.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.automationpractice.constants.UserCredentialsConstants.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginPageTest extends TestBase {

    private LoginPage loginPage;
    private HomePage homePage;
    private DashboardPage dashboardPage;
    private CreateAccountPage createAccountPage;

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
        loginPage.doLogin(USERNAME_VALID, PASSWORD_VALID);
        assertEquals(loginPage.getLoginPageTitle(), "My account - My Store");
    }

    @Test(priority = 2)
    public void loginPageLogoTest() {
        boolean logoFound = loginPage.isLogoDisplayed();

        assertTrue(logoFound);
    }

    @Test(priority = 3)
    public void loginSuccessfulTest() {
        dashboardPage = loginPage.doLogin(USERNAME_VALID, PASSWORD_VALID);

        assertEquals(dashboardPage.welcomeMessage(), "Welcome to your account. " +
                "Here you can manage all of your personal information and orders.");
    }

    @Test(priority = 5)
    public void loginFailedInvalidEmailTest() {
        loginPage.doLogin(USERNAME_INVALID, PASSWORD_VALID);

        assertTrue(loginPage.errorAlert().contains("There is 1 error"));
        assertTrue(loginPage.authenticationFailedMsg().contains("Authentication failed."));
        assertTrue(loginPage.getLoginPageTitle().contains("Login - My Store"));
    }

    @Test(priority = 6)
    public void loginFailedInvalidPasswordTest() {
        loginPage.doLogin(USERNAME_VALID, PASSWORD_INVALID);

        assertTrue(loginPage.errorAlert().contains("There is 1 error"));
        assertTrue(loginPage.authenticationFailedMsg().contains("Authentication failed."));
        assertTrue(loginPage.getLoginPageTitle().contains("Login - My Store"));
    }

    @Test(priority = 7)
    // Failing - gets heading from previous page
    public void navigateToCreateAccountPageTest() {
        loginPage.setNewAccountEmail(TestUtil.createRandomEmail());
        createAccountPage = loginPage.clickCreateAccount();
        assertEquals(createAccountPage.getPageHeading(), "CREATE AN ACCOUNT");
    }

    @AfterMethod
    // Runs after every test method in the class
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }

}
