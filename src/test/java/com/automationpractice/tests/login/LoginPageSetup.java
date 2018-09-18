package com.automationpractice.tests.login;

import com.automationpractice.base.TestBase;
import com.automationpractice.pages.CreateAccountPage;
import com.automationpractice.pages.DashboardPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginPageSetup extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    DashboardPage dashboardPage;
    CreateAccountPage createAccountPage;

    String sheetName = "credentials";

    @BeforeMethod
    public void SetUp() {
        initialisation();
        homePage = new HomePage();
        loginPage = homePage.clickSignInLink();
    }
    @AfterMethod
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }
}
