package com.automationpractice.pages;

import com.automationpractice.base.TestBase;
import com.automationpractice.enums.Title;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage extends TestBase {

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/h1[1]")
    private WebElement pageHeading;

    @FindBy(xpath = "//h3[contains(text(),'Your personal information')]")
    private WebElement pageSubheading;

    @FindBy(id="id_gender1")
    private WebElement mrRadioButton;

    @FindBy(id="id_gender2")
    private WebElement mrsRadioButton;

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
    private WebElement postalCodeField;

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

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    private WebElement registerButton;

    // Constructor
    public CreateAccountPage() {
        // Initialises the web elements
        PageFactory.initElements(driver, this);
    }

    public String getPageHeading() {
        return this.pageHeading.getText();
    }

    public String getPageSubheading() {
        return pageSubheading.getText();
    }

    public void setGenderMale() {
        mrRadioButton.click();
    }

    public void setGenderFemale() {
        mrsRadioButton.click();
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

    public void setBirthDay(int day) {
        Select select = new Select(daysDropDown);
        select.selectByIndex(day);
    }

    public void setBirthMonth(int month) {
        Select select = new Select(monthsDropDown);
        select.selectByValue(Integer.toString(month));
    }

    public void setBirthYear(int year) {
        Select select = new Select(yearsDropDown);
        select.selectByValue(Integer.toString(year));
    }

    public void clickSignUpForNewsletterBox() {
        newsletterCheckbox.click();
    }

    public void clickReceiveSpecialOffersBox() {
        receiveOffersCheckbox.click();
    }

    public void setAddressFirstName(String firstName) {
        addressFirstName.clear();
        addressFirstName.sendKeys(firstName);
    }

    public void setAddressLastName(String lastName) {
        addressLastName.clear();
        addressLastName.sendKeys(lastName);
    }

    public void setCompanyField(String company) {
        if(company != null) {
            companyField.sendKeys(company);
        }
    }

    public void setAddressField(String address) {
        addressField.sendKeys(address);
    }

    public void setAddressCompField(String complement) {
        if (complement != null) {
            addressCompField.sendKeys(complement);

        }
    }

    public void setCityField(String city) {
        cityField.sendKeys(city);
    }

    public void setStateDropDown(String state) {
        Select select = new Select(stateDropDown);
        select.selectByVisibleText(state);
    }

    public void setPostalCodeField(String postalCode) {
        postalCodeField.sendKeys(postalCode);
    }

    public void setCountryDropDown(String country) {
        Select select = new Select(countryDropDown);
        select.selectByVisibleText(country);
    }

    public void setAdditionalInfoField(String info) {
        if (info != null) {
            additionalInfoField.sendKeys(info);
        }
    }

    public void setHomePhoneField(String homePhone) {
        if(homePhone != null) {
            homePhoneField.sendKeys(homePhone);
        }
    }

    public void setMobilePhoneField(String mobile) {
        mobilePhoneField.sendKeys(mobile);
    }

    public void setAddressAliasField(String alias) {
        addressAliasField.clear();
        addressAliasField.sendKeys(alias);
    }

    public DashboardPage clickRegisterButton() {
        registerButton.click();
        return new DashboardPage();
    }

    // Actions

    public void enterPersonalInformation(Title title, String firstName, String lastName, String password,
                                        int birthDay, int birthMonth, int birthYear, boolean receiveNewsletter, boolean receiveOffers) {
        if(title == Title.MR) {
            setGenderMale();
        } else {
            setGenderFemale();
        }

        setFirstName(firstName);
        setlastName(lastName);
//        setEmail(email);
        setPassword(password);
        setBirthDay(birthDay);
        setBirthMonth(birthMonth);
        setBirthYear(birthYear);

        if(receiveNewsletter == true) {
            clickSignUpForNewsletterBox();
        }

        if(receiveOffers == true) {
            clickReceiveSpecialOffersBox();
        }
    }

    public void enterAddressInformation(String firstName, String lastName, String company, String address, String addressComp,
                                        String city, String state, String postalCode, String country, String additionalInfo,
                                        String homePhone, String mobile, String addressAlias) {
        setAddressFirstName(firstName);
        setAddressLastName(lastName);
        setCompanyField(company);
        setAddressField(address);
        setAddressCompField(addressComp);
        setCityField(city);
        setStateDropDown(state);
        setPostalCodeField(postalCode);
        setCountryDropDown(country);
        setAdditionalInfoField(additionalInfo);
        setHomePhoneField(homePhone);
        setMobilePhoneField(mobile);
        setAddressAliasField(addressAlias);
    }

 }
