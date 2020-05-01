package com.automationpractice.pages;

import com.automationpractice.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

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

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
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

    public CreateAccountPage clickCreateAccountButton() {
        createAccButton.click();
        return new CreateAccountPage(driver);
    }

    public DashboardPage clickSignIn() {
        loginButton.click();
        return new DashboardPage(driver);
    }

    public void clickForgotPasswordButton() {
        forgotButton.click();
    }

    public String getErrorAlert() {
        return driver.findElement(By.xpath("//p[contains(text(),'There is 1 error')]")).getText();
    }

    public String getAuthenticationFailedMsg() {
        String message = wait.until(x ->
                x.findElement(By.xpath("//li[contains(text(),'Authentication failed.')]")).getText());

        return message;
    }

    public String getEmptyEmailMsg() {
        return driver.findElement(By.xpath("//li[contains(text(),'An email address required.')]")).getText();
    }

    public String getEmptyPasswordMsg() {
        return driver.findElement(By.xpath("//li[contains(text(),'Password is required.')]")).getText();
    }

    // Actions
    public DashboardPage doLogin(String email, String password) {
        setLoginEmail(email);
        setLoginPassword(password);
        clickSignIn();
        return new DashboardPage(driver);
    }

    public CreateAccountPage createAccount(String newEmail) {
        setNewAccountEmail(newEmail);
        clickCreateAccountButton();
        return new CreateAccountPage(driver);
    }

}
