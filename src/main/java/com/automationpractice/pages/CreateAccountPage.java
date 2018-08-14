package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {

    WebDriver driver;

    @FindBy(xpath = "//h1[@class='page-heading']")
    private WebElement pageHeading;

    @FindBy(xpath = "//h3[contains(text(),'Your personal information')]")
    private WebElement pageSubheading;

    @FindBy(id="id_gender1")
    private WebElement maleRadioButton;

    @FindBy(id="id_gender2")
    private WebElement femaleRadioButton;

    @FindBy(id="customer_firstname")
    private WebElement firstNameField;

    @FindBy(id="customer_lastname")
    private WebElement lastNameField;

    @FindBy(id="email")
    private WebElement emailField;

    @FindBy(id="passwd")
    private WebElement passwordField;

    @FindBy(id="days")
    private WebElement daysDropDown;

    @FindBy(id="months")
    private WebElement monthsDropDown;

    @FindBy(id="years")
    private WebElement yearsDropDown;

    @FindBy(id="newsletter")
    private WebElement newsletterCheckbox;

    @FindBy(id="optin")
    private WebElement receiveOffersCheckbox;

    @FindBy(id="years")
    private WebElement years;

    @FindBy(id="firstname")
    private WebElement addressFirstName;

    @FindBy(id="lastname")
    private WebElement addressLastName;

    @FindBy(id="company")
    private WebElement companyField;

    @FindBy(id="address1")
    private WebElement addressField;

    @FindBy(id="address2")
    private WebElement addressCompField;

    @FindBy(id="city")
    private WebElement cityField;

    @FindBy(id="id_state")
    private WebElement stateDropDown;

    @FindBy(id="postcode")
    private WebElement postCodeField;

    @FindBy(id="id_country")
    private WebElement countryDropDown;

    @FindBy(id="other")
    private WebElement additionalInfoField;

    @FindBy(id="phone")
    private WebElement homePhoneField;

    @FindBy(id="phone_mobile")
    private WebElement mobilePhoneField;

    @FindBy(id="alias")
    private WebElement addressAliasField;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[4]/button[1]/span[1]")
    private WebElement registerButton;

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setGenderMale() {
        maleRadioButton.click();
    }

    public void setGenderFemale() {
        femaleRadioButton.click();
    }

    public void setFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void setlastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void setEmail(String email) {
        emailField.sendKeys(email);
    }

    public void setPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void setBirthDay(String day) {
        Select select = new Select(daysDropDown);
        select.selectByVisibleText(day);
    }

    public void setBirthMonth(String month) {
        Select select = new Select(monthsDropDown);
        select.selectByVisibleText(month);
    }

    public void setBirthYear(String year) {
        Select select = new Select(yearsDropDown);
        select.selectByVisibleText(year);
    }

}
