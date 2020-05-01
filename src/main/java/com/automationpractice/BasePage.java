package com.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.wait = new WebDriverWait(driver, 5);
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
