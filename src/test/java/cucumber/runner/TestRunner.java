package cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "/Users/guigasparotto/Documents/selenium_webdriver/minerva/src/test/java/resources/features",
//        glue = "/Users/guigasparotto/Documents/selenium_webdriver/minerva/src/test/java/cucumber/LoginStepDefiniton.java",
        format = {"pretty", "html:test-outout"},
        monochrome = true, // display the console output in a proper readable format
        strict = true, // it will check if any step is not defined in step definition file
        dryRun = false // to check the mapping is proper between feature file and step def file
        // tags = {"~@SmokeTest", "~@RegressionTest", "~@End2End"}
)

@Test
public class TestRunner extends AbstractTestNGCucumberTests {

}
