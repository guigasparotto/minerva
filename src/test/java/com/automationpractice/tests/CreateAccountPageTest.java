package com.automationpractice.tests;

import com.automationpractice.base.TestBase;
import com.automationpractice.enums.Title;
import com.automationpractice.pages.CreateAccountPage;
import com.automationpractice.pages.DashboardPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.LoginPage;
import com.automationpractice.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CreateAccountPageTest extends TestBase {

    private LoginPage loginPage;
    private HomePage homePage;
    private DashboardPage dashboardPage;
    private CreateAccountPage createAccountPage;
    private String userEmail;

    public CreateAccountPageTest() {
        super();
    }

    @BeforeMethod
    public void SetUp() {
        initialisation();
        homePage = new HomePage();
        loginPage = homePage.clickSignInLink();

        userEmail = TestUtil.createRandomEmail();
        createAccountPage = loginPage.createAccount(userEmail);
    }

    @Test(priority = 1)
    public void createNewUserTest() {
        createAccountPage.enterPersonalInformation(Title.MR, "Joe", "Doe", "12345", 14, 8, 1990, true, true);
        createAccountPage.enterAddressInformation("Joe", "Doe", null, "Road 11", "25", "New York", "New York", "18900",
                "United States", null, null, "55580025", "address001");
        dashboardPage = createAccountPage.clickRegisterButton();
        assertEquals(dashboardPage.getPageHeading(), "My account");
    }


    @AfterMethod
    // Runs after every test method in the class
    public void tearDown() {
        userEmail = null;

        if (driver != null)
            driver.quit();
    }

}
