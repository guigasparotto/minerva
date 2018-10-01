package cucumber.runner;

import com.automationpractice.base.TestBase;
import com.automationpractice.enums.Title;
import com.automationpractice.pages.CreateAccountPage;
import com.automationpractice.pages.DashboardPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.LoginPage;
import com.automationpractice.util.TestUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class CreateAccountPageSteps extends TestBase {

    private LoginPage loginPage;
    private HomePage homePage;
    private DashboardPage dashboardPage;
    private CreateAccountPage createAccountPage;
    private String userEmail;

    public CreateAccountPageSteps() {
        super();
    }

    @BeforeMethod
    public void SetUp() {
        initialisation();
        homePage = new HomePage();
        loginPage = homePage.clickSignInLink();

        userEmail = TestUtil.createRandomEmail();
        createAccountPage = loginPage.createAccount(userEmail);
    }

    @AfterMethod
    // Runs after every test method in the class
    public void tearDown() {
        userEmail = null;

        if (driver != null)
            driver.quit();
    }

    @When("^user enters their personal information$")
    public void user_enters_their_personal_information(DataTable personalInfo) {
        List<List<String>> data = personalInfo.raw();
        Title title;

        if(data.get(0).get(0).equalsIgnoreCase("Mr")) {
            title = Title.MR;
        } else {
            title = Title.MRS;
        }

        createAccountPage.enterPersonalInformation(title, data.get(0).get(1), data.get(0).get(2), data.get(0).get(3),
                Integer.valueOf(data.get(0).get(4)), Integer.valueOf(data.get(0).get(5)), Integer.valueOf(data.get(0).get(6)),
                Boolean.valueOf(data.get(0).get(7)), Boolean.valueOf(data.get(0).get(8)));
    }

    @When("^user enters their address information$")
    public void user_enters_their_address_information(DataTable addressInformation) {
        List<List<String>> data = addressInformation.raw();

        createAccountPage.enterAddressInformation(data.get(1).get(1), data.get(2).get(1), data.get(3).get(1), data.get(4).get(1),
                data.get(5).get(1), data.get(6).get(1), data.get(7).get(1), data.get(8).get(1), data.get(9).get(1), data.get(10).get(1),
                data.get(11).get(1), data.get(12).get(1), data.get(13).get(1));
    }

    @When("^user clicks in the register button$")
    public void user_clicks_in_the_register_button() {
        dashboardPage = createAccountPage.clickRegisterButton();
    }

    @Then("^registration is complete$")
    public void registration_is_complete() {
        assertEquals(dashboardPage.getPageHeading(), "MY ACCOUNT");
    }

}
