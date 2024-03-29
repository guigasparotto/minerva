package com.automationpractice.tests;

import com.automationpractice.BaseTest;
import com.automationpractice.pages.CreateAccountPage;
import com.automationpractice.pages.DashboardPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.LoginPage;
import com.automationpractice.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.automationpractice.constants.UserCredentialsConstants.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginPageTest extends BaseTest {

    private LoginPage loginPage;
    private HomePage homePage;
    private DashboardPage dashboardPage;
    private CreateAccountPage createAccountPage;

    String sheetName = "credentials";

    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialisation();
        homePage = new HomePage(driver);
        loginPage = homePage.clickSignInLink();
    }

    @Test(priority = 1)
    public void loginPageTitleTest() {
        loginPage.doLogin(USERNAME_VALID, PASSWORD_VALID);
        assertEquals(loginPage.getPageTitle(), "My account - My Store");
    }

    @Test(priority = 2)
    public void loginPageLogoTest() {
        boolean logoFound = loginPage.isLogoDisplayed();

        assertTrue(logoFound);
    }

    @Test(priority = 3)
    public void loginSuccessfulTest() {
        dashboardPage = loginPage.doLogin(USERNAME_VALID, PASSWORD_VALID);

        assertEquals(dashboardPage.getWelcomeMessage(), "Welcome to your account. " +
                "Here you can manage all of your personal information and orders.");
    }

    @Test(priority = 5)
    public void loginFailedInvalidEmailTest() {
        loginPage.doLogin(USERNAME_INVALID, PASSWORD_VALID);

        assertTrue(loginPage.getErrorAlert().contains("There is 1 error"));
        assertTrue(loginPage.getAuthenticationFailedMsg().contains("Authentication failed."));
        assertTrue(loginPage.getPageTitle().contains("Login - My Store"));
    }

    @Test(priority = 6)
    public void loginFailedInvalidPasswordTest() {
        loginPage.doLogin(USERNAME_VALID, PASSWORD_INVALID);

        assertTrue(loginPage.getErrorAlert().contains("There is 1 error"));
        assertTrue(loginPage.getAuthenticationFailedMsg().contains("Authentication failed."));
        assertTrue(loginPage.getPageTitle().contains("Login - My Store"));
    }

    @Test(priority = 7)
    // Failing - gets heading from previous page
    public void navigateToCreateAccountPageTest() {
        loginPage.setNewAccountEmail(TestUtil.createRandomEmail());
        createAccountPage = loginPage.clickCreateAccountButton();
    }



    @DataProvider
    public Object[][] getTestData() {
        Object[][] data = TestUtil.getTestData(sheetName);
        return data;
    }

    @Test(priority = 10, dataProvider = "getTestData")
    public void loginSuccessfulTestWithDataProvider(String email, String password) {
        dashboardPage = loginPage.doLogin(email, password);

        assertEquals(dashboardPage.getWelcomeMessage(), "Welcome to your account. " +
                "Here you can manage all of your personal information and orders.");
    }


    @AfterMethod
    // Runs after every test method in the class
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }

}
