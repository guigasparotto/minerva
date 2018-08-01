package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Authentication {

    private WebDriver driver;

    // Constructor initialises the state of the driver
    public Authentication(WebDriver driver) {
        this.driver = driver;
    }

    public void setLoginEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    public void setLoginPassword(String password) {
        driver.findElement(By.id("passwd")).sendKeys(password);
    }

    public void clickSignIn() {
        driver.findElement(By.id("SubmitLogin")).click();
    }

    public void clickForgotPassword() {
        driver.findElement(By.xpath("//a[@title='Recover your forgotten password']")).click();
    }

    public void setNewAccountEmail(String email) {
        driver.findElement(By.id("email_create")).sendKeys(email);
    }

    public void clickCreate() {
        driver.findElement(By.id("SubmitCreate")).click();
    }

}
