package com.automationpractice.pages;

import com.automationpractice.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends TestBase {

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/h1[1]")
    private WebElement pageHeading;

    @FindBy(xpath = "//span[contains(text(),'Order history and details')]")
    private WebElement historyButton;

    @FindBy(xpath = "//span[contains(text(),'My credit slips')]")
    private WebElement creditSlipsButton;

    @FindBy(xpath = "//span[contains(text(),'My addresses')]")
    private WebElement addressesButton;

    @FindBy(xpath = "//span[contains(text(),'My personal information')]")
    private WebElement personalInfoButton;

    @FindBy(xpath = "//span[contains(text(),'My wishlists')]")
    private WebElement wishlistsButton;

    @FindBy(xpath = "//a[@getLoginPageTitle='Home']//span")
    private WebElement homeButton;

    @FindBy(xpath = "//h1[@class='page-heading']")
    private WebElement myAccountText;

    @FindBy(xpath = "//p[@class='info-account']")
    private WebElement welcomeText;

    // Constructor initialises the state of the driver
    public DashboardPage() {
        // Initialise the web elements
        PageFactory.initElements(driver, this);
    }

    public String title() {
        return driver.getTitle();
    }

    public void orderHistory() {
        historyButton.click();
    }

    public void myCreditSlips() {
        creditSlipsButton.click();
    }

    public void myAdresses() {
        addressesButton.click();
    }

    public void myPersonalInfo() {
        personalInfoButton.click();
    }

    public void myWishlists() {
        wishlistsButton.click();
    }

    public void home() {
        homeButton.click();
    }

    public String myAccount() {
        return myAccountText.getText();
    }

    public String welcomeMessage() {
        return welcomeText.getText();
    }

    public String getPageHeading() {
        return pageHeading.getText();
    }
}
