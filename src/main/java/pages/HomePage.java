package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignIn() {
        driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
    }

//    @Test
//    // Simple example - tests should be simple, objective and easy to read
//    public void verify_home_page_title() {
//
//        // Verifies the page title and returns an error message in case it is not correct
//        Assert.assertEquals("Title check failed", "LOJA MINERVA | Moda Alternativa do Petit ao Plus Size", driver.getTitle());
//    }


}
