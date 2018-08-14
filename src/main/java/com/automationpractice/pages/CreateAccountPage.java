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

    @FindBy(id="id_gender1")
    WebElement maleRadioButton;

    @FindBy(id="id_gender2")
    WebElement femaleRadioButton;

    @FindBy(id="customer_firstname")
    WebElement firstNameField;

    @FindBy(id="customer_lastname")
    WebElement lastNameField;

    @FindBy(id="email")
    WebElement emailField;

    @FindBy(id="passwd")
    WebElement passwordField;

    @FindBy(id="days")
    WebElement daysDropDown;

    @FindBy(id="months")
    WebElement monthsDropDown;

    @FindBy(id="years")
    WebElement yearsDropDown;

    @FindBy(id="newsletter")
    WebElement newsletterCheckbox;

    @FindBy(id="optin")
    WebElement receiveOffersCheckbox;

    @FindBy(id="years")
    WebElement years;

    @FindBy(id="firstname")
    WebElement addressFirstName;

    @FindBy(id="lastname")
    WebElement addressLastName;

    @FindBy(id="company")
    WebElement companyField;

    @FindBy(id="address1")
    WebElement addressField;

    @FindBy(id="address2")
    WebElement addressCompField;

    @FindBy(id="city")
    WebElement cityField;

    @FindBy(id="id_state")
    WebElement stateDropDown;

    @FindBy(id="postcode")
    WebElement postCodeField;

    @FindBy(id="id_country")
    WebElement countryDropDown;

    @FindBy(id="other")
    WebElement additionalInfoField;

    @FindBy(id="phone")
    WebElement homePhoneField;

    @FindBy(id="phone_mobile")
    WebElement mobilePhoneField;

    @FindBy(id="alias")
    WebElement addressAliasField;

    @FindBy(css = "body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) " +
            "div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 " +
            "form.std.box div.submit.clearfix:nth-child(4) button.btn.btn-default.button.button-medium:" +
            "nth-child(4) > span:nth-child(1)")
    WebElement registerButton;

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }


}
