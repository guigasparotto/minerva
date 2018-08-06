package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage {

    WebDriver driver;

    @FindBy(xpath = "//h1[@class='page-heading']")
    WebElement pageHeading;

    @FindBy(xpath = "//h3[contains(text(),'Your personal information')]")
    WebElement pageSubheading;



    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }


}
