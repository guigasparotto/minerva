package com.automationpractice.pages;

import com.automationpractice.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    private WebDriver driver;

    @FindBy(xpath = "//a[@loginPageTitle='Log in to your customer account']")
    private WebElement signInButton;

    public HomePage() {
        // Initialises the web elements
        PageFactory.initElements(driver, this);
    }

    public void clickSignIn() {
        driver.findElement(By.xpath("//a[@loginPageTitle='Log in to your customer account']")).click();
    }

    // Clicks in the Sign In button and navigates to the doLogin page
    public LoginPage signIn() {
        signInButton.click();
        return new LoginPage();
    }


}
