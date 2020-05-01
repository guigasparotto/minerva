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

    public DashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void clickOrderHistoryButton() {
        historyButton.click();
    }

    public void clickMyCreditSlipsButton() {
        creditSlipsButton.click();
    }

    public void clickMyAdressesButton() {
        addressesButton.click();
    }

    public void clickMyPersonalInfoButton() {
        personalInfoButton.click();
    }

    public void clickMyWishlistsButton() {
        wishlistsButton.click();
    }

    public void clickHomeButton() {
        homeButton.click();
    }

    public String getMyAccountText() {
        return myAccountText.getText();
    }

    public String getWelcomeMessage() {
        return welcomeText.getText();
    }

    public String getPageHeading() {
        return pageHeading.getText();
    }
}
