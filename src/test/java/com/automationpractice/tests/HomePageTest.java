package com.automationpractice.tests;

import com.automationpractice.base.TestBase;
import com.automationpractice.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    private HomePage homePage;

    public HomePageTest() {
        super();
        homePage = new HomePage();
    }


    @Test(priority = 1)
    public void loginPageTitleTest() {

        String title = homePage.getHomePageTitle();

        // Verifies if the page getLoginPageTitle is correct
        Assert.assertEquals(title, "My Store");
    }

}
