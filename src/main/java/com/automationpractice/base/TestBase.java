package com.automationpractice.base;

import com.automationpractice.util.DriverFactory;
import com.automationpractice.util.TestUtil;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;

//    @Before
//    // Runs before every test method in the class
//    public void setUp() {
//        // Creates a DriverFactory object and opens the chrome browser
//        driver = DriverFactory.open("chrome");
//    }

    public TestBase() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(
                    "src/main/java/com/automationpractice/config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }

    public static void initialisation() {
        String browserName = prop.getProperty("browser");
        driver = DriverFactory.open(browserName);

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));
    }
}
