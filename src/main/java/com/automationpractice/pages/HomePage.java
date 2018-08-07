package com.automationpractice.pages;

import com.automationpractice.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

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
    WebElement submitSearch;

    @FindBy(xpath = "//a[@title='View my shopping cart']")
    WebElement shoppingCartLink;

    @FindBy(xpath = "//a[@title='Women']")
    WebElement womenLink;

    @FindBy(xpath = "//body[@id='index']/div[@id='page']/div[@class='header-container']" +
            "/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']" +
            "/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]")
    WebElement dressesLink;

    @FindBy(xpath = "//body[@id='index']/div[@id='page']/div[@class='header-container']" +
            "/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']" +
            "/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]/a[1]")
    WebElement tshirtsLink;


    public HomePage() {
        // Initialises the web elements
        PageFactory.initElements(driver, this);
    }

    // Clicks in the Sign In button and navigates to the login page
    public LoginPage clickSignInLink() {
        signInLink.click();
        return new LoginPage();
    }

    public SearchPage testSearch(String searchItem) {
        searchField.sendKeys(searchItem);
        submitSearch.click();
        return new SearchPage();
    }

    public ContactUsPage clickContactUsLink() {
        contactUsLink.click();
        return new ContactUsPage();
    }

    public WomenPage clickWomenLink() {
        womenLink.click();
        return new WomenPage();
    }

    public DressesPage clickDressesLink() {
        dressesLink.click();
        return new DressesPage();
    }

    public TshirtsPage clickTshirtsLink() {
        tshirtsLink.click();
        return new TshirtsPage();
    }



}
