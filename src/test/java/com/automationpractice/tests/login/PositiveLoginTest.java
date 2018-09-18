package com.automationpractice.tests.login;

import com.automationpractice.util.TestUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.automationpractice.constants.UserCredentialsConstants.PASSWORD_VALID;
import static com.automationpractice.constants.UserCredentialsConstants.USERNAME_VALID;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PositiveLoginTest extends LoginPageSetup {


    @Test
    public void loginPageTitleTest() {
        loginPage.doLogin(USERNAME_VALID, PASSWORD_VALID);
        assertEquals(loginPage.getLoginPageTitle(), "My account - My Store");
    }

    @Test
    public void loginPageLogoTest() {
        boolean logoFound = loginPage.isLogoDisplayed();

        assertTrue(logoFound);
    }

    @Test
    public void loginSuccessfulTest() {
        dashboardPage = loginPage.doLogin(USERNAME_VALID, PASSWORD_VALID);
        assertEquals(dashboardPage.welcomeMessage(), "Welcome to your account. " +
                "Here you can manage all of your personal information and orders.");
    }

    @Test
    // Failing - gets heading from previous page
    public void navigateToCreateAccountPageTest() {
        loginPage.setNewAccountEmail(TestUtil.createRandomEmail());
        createAccountPage = loginPage.clickCreateAccount();
        assertEquals(createAccountPage.getPageHeading(), "CREATE AN ACCOUNT");
    }

//    @DataProvider
//    public Object[][] getTestData() {
//        Object data[][] = TestUtil.getTestData(sheetName);
//        return data;
//    }
//
//    @Test(dataProvider = "getTestData")
//    public void loginSuccessfulTestWithDataProvider(String email, String password) {
//        dashboardPage = loginPage.doLogin(email, password);
//        assertEquals(dashboardPage.welcomeMessage(), "Welcome to your account. " +
//                "Here you can manage all of your personal information and orders.");
//    }
}
