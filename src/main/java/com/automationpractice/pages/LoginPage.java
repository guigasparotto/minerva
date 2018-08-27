package com.automationpractice.pages;

import com.automationpractice.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    // Define web elements at class level

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/h1[1]")
    private WebElement pageHeading;

    @FindBy(id="email")
    private WebElement emailBox;

    @FindBy(id="passwd")
    private WebElement passwordBox;

    @FindBy(id="SubmitLogin")
    private WebElement loginButton;

    @FindBy(xpath = "//a[@getLoginPageTitle='Recover your forgotten password']")
    private WebElement forgotButton;

    @FindBy(id = "email_create")
    private WebElement newAccountEmail;

    @FindBy(id = "SubmitCreate")
    private WebElement createAccButton;

    @FindBy(xpath = "//img[@class='logo img-responsive']")
    private WebElement pageLogo;

    // Constructor
    public LoginPage() {
        // Initialises the web elements
        PageFactory.initElements(driver, this);
    }

    public String getPageHeading() {
        return pageHeading.getText();
    }

    public String getLoginPageTitle() {
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

    public void clickSignIn() {
        loginButton.click();
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
