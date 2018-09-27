package com.automationpractice.tests;

import com.automationpractice.base.TestBase;
import com.automationpractice.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    private HomePage homePage;

    @BeforeMethod
    public void SetUp() {
        initialisation();
        homePage = new HomePage();
    }

    @Test(priority = 1)
    public void homePageTitleTest() {
        String title = homePage.getHomePageTitle();

        // Verifies if the page getPageTitle is correct
        Assert.assertEquals(title, "My Store");
    }

    @AfterMethod
    // Runs after every test method in the class
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }

}
