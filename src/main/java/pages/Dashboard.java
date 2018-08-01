package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {

    private WebDriver driver;

    public Dashboard(WebDriver driver) {
        this.driver = driver;
    }

    public void orderHistory() {
        driver.findElement(By.xpath("//span[contains(text(),'Order history and details')]")).click();
    }

    public void myCreditSlips() {
        driver.findElement(By.xpath("//span[contains(text(),'My credit slips')]")).click();
    }

    public void myAdresses() {
        driver.findElement(By.xpath("//span[contains(text(),'My addresses')]")).click();
    }

    public void myPersonalInfo() {
        driver.findElement(By.xpath("//span[contains(text(),'My personal information')]")).click();
    }

    public void myWishlists() {
        driver.findElement(By.xpath("//span[contains(text(),'My wishlists')]")).click();
    }

    public void homeButton() {
        driver.findElement(By.xpath("//a[@title='Home']//span")).click();
    }

    public String myAccount() {
        return driver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
    }

    public String welcomeMessage() {
        return driver.findElement(By.xpath("//p[@class='info-account']")).getText();
    }

}
