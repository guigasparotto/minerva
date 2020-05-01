package com.automationpractice.pages;

import com.automationpractice.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "//img[@class='img-responsive']")
    WebElement banner;

    @FindBy(xpath = "//img[@class='logo img-responsive']")
    private WebElement pageLogo;

    @FindBy(xpath = "//a[@title='Contact Us']")
    WebElement contactUsLink;

    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    WebElement signInLink;

    @FindBy(id = "search_query_top")
    WebElement searchField;

    @FindBy(name = "submit_search")
    WebElement submitSearchButton;

    @FindBy(xpath = "//a[@title='View my shopping cart']")
    WebElement shoppingCartLink;

    @FindBy(xpath = "//a[@title='Women']")
    WebElement womenLink;

    @FindBy(xpath = "//a[@title='Tops']")
    WebElement topsLink;

    @FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
    WebElement dressesLink;

    @FindBy(css = "#block_top_menu > ul > li:nth-child(3) > a")
    WebElement tshirtsLink;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Clicks in the Sign In button and navigates to the login page
    public LoginPage clickSignInLink() {
        signInLink.click();
        return new LoginPage(driver);
    }

    public SearchPage searchText(String searchItem) {
        searchField.sendKeys(searchItem);
        submitSearchButton.click();
        return new SearchPage(driver);
    }

    public ContactUsPage clickContactUsLink() {
        contactUsLink.click();
        return new ContactUsPage(driver);
    }

    public WomenPage clickWomenLink() {
        womenLink.click();
        return new WomenPage(driver);
    }

    public DressesPage clickDressesLink() {
        dressesLink.click();
        return new DressesPage(driver);
    }

    public TshirtsPage clickTshirtsLink() {
        tshirtsLink.click();
        return new TshirtsPage(driver);
    }

    public void clickTopsLink() {
        Actions action = new Actions(driver);
        action.moveToElement(womenLink).build().perform();
        topsLink.click();
    }


}