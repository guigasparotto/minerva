package other;

import com.automationpractice.util.DriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Training {

    WebDriver driver;
    private JavascriptExecutor js;

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.open("chrome");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        js = (JavascriptExecutor) driver;
    }

    @Test
    public void testAutocomplete() throws InterruptedException, IOException {
//        driver.get("https://www.google.com/");

        // Navigate to the website with JavaScript Executor
        js.executeScript("window.location = 'https://www.google.com/';");

        WebElement searchField = driver.findElement(By.name("q"));

        searchField.sendKeys("Elon Musk");

        WebElement resultList = driver.findElement(By.xpath("//ul[@class='sbsb_b' and @role='listbox']"));

        List<WebElement> elements = resultList.findElements(By.tagName("b"));

        for (WebElement element : elements) {
            System.out.println("Element: " + element.getText());
            if (element.getText().contains("net worth")) {
                element.click();
                break;
            }
        }

        // Verify the size of the window with JS Executor
        long height = (long) js.executeScript("return window.innerHeight;");
        long width = (long) js.executeScript("return window.innerWidth;");

        System.out.println("Height: " + height);
        System.out.println("Width: " + width);

        // Scroll down and then scroll up
        js.executeScript("window.scrollBy(0, 1900);");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -1900);");

        // Scroll down until terms is seen
        WebElement terms = driver.findElement(By.xpath("//a[contains(text(),'Terms')]"));
        js.executeScript("arguments[0].scrollIntoView(true);", terms);
        // Take a screenshot at the end of the test and save it in the specified folder
        File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File("/Users/guigasparotto/Documents/selenium_webdriver/minerva/screenshots/"
                + "screenshot1" + new Timestamp(System.currentTimeMillis()) + ".png"));

    }

    @Test
    public void testHandlers() throws InterruptedException {
        driver.get("https://learn.letskodeit.com/p/practice");

        driver.findElement(By.id("openwindow")).click();

        String currentHandle = driver.getWindowHandle();

        Set<String> handles = driver.getWindowHandles();

        for (String handle : handles) {
            if (!handle.equals(currentHandle)) {
                driver.switchTo().window(handle);
                driver.findElement(By.id("search-courses")).sendKeys("Python");
            }
        }

        Thread.sleep(2000);
    }

    @Test
    public void testJavaScriptPopUpAlert() throws InterruptedException {
        driver.get("https://learn.letskodeit.com/p/practice");

        driver.findElement(By.id("name")).sendKeys("Gui");
        driver.findElement(By.id("alertbtn")).click();

        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());
        alert.accept();

        Thread.sleep(2000);
    }

    @Test
    public void testMouseHover() throws InterruptedException {
        driver.get("https://learn.letskodeit.com/p/practice");

        WebElement mHoverBtn = driver.findElement(By.id("mousehover"));
        WebElement topBtn = driver.findElement(By.xpath("//a[contains(text(),'Top')]"));

        js.executeScript("window.scrollBy(0, 1900);");

        Actions action = new Actions(driver);
        action.moveToElement(mHoverBtn).perform();

        topBtn.click();

        Thread.sleep(2000);
    }

    @Test
    public void testDragAndDropElement() throws InterruptedException {
        driver.get("http://jqueryui.com/droppable/");

        driver.switchTo().frame(0);

        WebElement fromElement = driver.findElement(By.id("draggable"));
        WebElement toElement = driver.findElement(By.id("droppable"));

        Actions action = new Actions(driver);

        // Drag and drop
//        action.dragAndDrop(fromElement, toElement).build().perform();

        // Click and hold, move to element, release, build and perform
        action.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();

        Thread.sleep(2000);
    }

    @Test
    public void testSlider() throws InterruptedException {
        driver.get("http://jqueryui.com/slider/");

        driver.switchTo().frame(0);

        WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));

        Actions action = new Actions(driver);

//        action.dragAndDropBy(slider, 100, 0).perform();
        action.clickAndHold(slider).moveByOffset(100, 0).release().build().perform();

        Thread.sleep(2000);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
