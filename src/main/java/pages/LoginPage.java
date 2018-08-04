package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //Define web elements at class level
    private WebDriver driver;

    @FindBy(id="email")
    private WebElement emailBox;

    @FindBy(id="passwd")
    private WebElement passwordBox;

    @FindBy(id="SubmitLogin")
    private WebElement loginButton;

    @FindBy(xpath = "//a[@title='Recover your forgotten password']")
    private WebElement forgotButton;

    @FindBy(id = "email_create")
    private WebElement newAccountEmail;

    @FindBy(id = "SumbitCreate")
    private WebElement createAccButton;

    // Constructor initialises the state of the driver
    public LoginPage(WebDriver driver) {
        this.driver = driver;

        // Initialises the web elements
        PageFactory.initElements(driver, this);
    }

    // Steps
    public String title() {
        return driver.getTitle();
    }

    public void setLoginEmail(String email) {
        emailBox.sendKeys(email);
    }

    public void setLoginPassword(String password) {
        passwordBox.sendKeys(password);
    }

    public void clickSignIn() {
        loginButton.click();
    }

    public void clickForgotPassword() {
        forgotButton.click();
    }

    public void setNewAccountEmail(String email) {
        newAccountEmail.sendKeys(email);
    }

    public void clickCreate() {
        createAccButton.click();
    }

    public String errorAlert() {
        return driver.findElement(By.xpath("//p[contains(text(),'There is 1 error')]")).getText();
    }

    public String invalidUserMsg() {
        return driver.findElement(By.xpath("//li[contains(text(),'Authentication failed.')]")).getText();
    }

    public String invalidPasswordMsg() {
        return driver.findElement(By.xpath("//li[contains(text(),'Invalid password.')]")).getText();
    }

    // Actions
    public void login(String email, String password) {
        setLoginEmail(email);
        setLoginPassword(password);
        clickSignIn();
    }

}
