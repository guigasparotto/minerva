package com.automationpractice;

import com.automationpractice.util.DriverFactory;
import com.automationpractice.util.TestUtil;
import com.automationpractice.util.WebEventListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;
    public static Properties prop;

    // Elements created in order to implement better logging
    public static EventFiringWebDriver e_driver;
    public static WebEventListener eventListener;

    public BaseTest() {
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

        e_driver = new EventFiringWebDriver(driver);

        // Now creating object of EventListenerHandler to register it with EventFiringWebDriver
        eventListener = new WebEventListener();
        e_driver.register(eventListener);
        driver = e_driver;

//        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));
    }

}
