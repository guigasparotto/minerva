import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main {

    public static void main(String[] args) {

        // Prints a message
        System.out.println("Test_01");

        // Creates a DriverFactory object and opens the chrome browser
        WebDriver driver = DriverFactory.open("chrome");

        // Navigates to the web app
        driver.get("https://www.lojaminerva.com.br/");

        // Maximizes the browser
        driver.manage().window().maximize();

        // Locates and clicks on "Vestidos" link
        driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/ul[1]/li[1]/a[1]/h4[1]"));

        // Closes the browser
        driver.close();

    }

}
