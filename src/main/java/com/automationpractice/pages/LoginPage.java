package com.automationpractice.pages;

import com.automationpractice.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    // Define web elements at class level

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/h1[1]")
    // In a second call of the element, looks for it in the cache instead of trying to find it again
    @CacheLookup
    private WebElement pageHeading;

    @FindBy(id="email")
    @CacheLookup
    private WebElement emailBox;

    @FindBy(id="passwd")
    @CacheLookup
    private WebElement passwordBox;

    @FindBy(id="SubmitLogin")
    @CacheLookup
    private WebElement loginButton;

    @FindBy(xpath = "//a[@getPageTitle='Recover your forgotten password']")
    @CacheLookup
    private WebElement forgotButton;

    @FindBy(id = "email_create")
    @CacheLookup
    private WebElement newAccountEmail;

    @FindBy(id = "SubmitCreate")
    @CacheLookup
    private WebElement createAccButton;

    @FindBy(xpath = "//img[@class='logo img-responsive']")
    @CacheLookup
    private WebElement pageLogo;

    // Constructor
    public LoginPage() {
        // Initialises the web elements
        PageFactory.initElements(driver, this);
    }

    public String getPageHeading() {
        return pageHeading.getText();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public boolean isLogoDisplayed() {
        return pageLogo.isDisplayed();
    }

    public void setLoginEmail(String email) {
        emailBox.sendKeys(email);
    }

    public void setLoginPassword(String password) {
        passwordBox.sendKeys(password);
    }

    public void setNewAccountEmail(String email) {
        newAccountEmail.sendKeys(email);
    }

    public CreateAccountPage clickCreateAccount() {
        createAccButton.click();
        return new CreateAccountPage();
    }

    public DashboardPage clickSignIn() {
        loginButton.click();
        return new DashboardPage();
    }

    public void clickForgotPassword() {
        forgotButton.click();
    }

    public String errorAlert() {
        return driver.findElement(By.xpath("//p[contains(text(),'There is 1 error')]")).getText();
    }

    public String authenticationFailedMsg() {
        return driver.findElement(By.xpath("//li[contains(text(),'Authentication failed.')]")).getText();
    }

    // Actions
    public DashboardPage doLogin(String email, String password) {
        setLoginEmail(email);
        setLoginPassword(password);
        clickSignIn();
        return new DashboardPage();
    }

    public CreateAccountPage createAccount(String newEmail) {
        setNewAccountEmail(newEmail);
        clickCreateAccount();
        return new CreateAccountPage();
    }

}
