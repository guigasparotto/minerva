package com.automationpractice.pages;

import com.automationpractice.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'My account')]")
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

    @FindBy(xpath = "//a[@getPageTitle='Home']//span")
    private WebElement homeButton;

    @FindBy(xpath = "//h1[@class='page-heading']")
    private WebElement myAccountText;

    @FindBy(xpath = "//p[@class='info-account']")
    private WebElement welcomeText;

    private WebDriver driver;

    // Constructor initialises the state of the driver
    public DashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() {
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
