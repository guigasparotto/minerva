package com.automationpractice.tests;

import com.automationpractice.BaseTest;
import com.automationpractice.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    private HomePage homePage;

    @BeforeMethod
    public void setUp() {
        initialisation();
        homePage = new HomePage(driver);
    }

    @Test(priority = 1)
    public void homePageTitleTest() {
        String title = homePage.getPageTitle();

        Assert.assertEquals(title, "My Store");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }

}
