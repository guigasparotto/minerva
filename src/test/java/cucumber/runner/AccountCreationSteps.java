package cucumber.runner;

import com.automationpractice.BaseTest;
import com.automationpractice.pages.CreateAccountPage;
import com.automationpractice.pages.DashboardPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.LoginPage;
import com.automationpractice.util.TestUtil;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class AccountCreationSteps extends BaseTest {

    private LoginPage loginPage;
    private HomePage homePage;
    private DashboardPage dashboardPage;
    private CreateAccountPage createAccountPage;
    private String userEmail;

    private final String sheetName = "account_creation";

    @Before("@AccountCreation")
    public void SetUp() {
        initialisation();
        homePage = new HomePage(driver);
        loginPage = homePage.clickSignInLink();

        userEmail = TestUtil.createRandomEmail();
        createAccountPage = loginPage.createAccount(userEmail);
    }

    @After("@AccountCreation")
    public void tearDown() {
        userEmail = null;

        if (driver != null)
            driver.quit();
    }

    @Given("^user is on create an account page$")
    public void userIsOnCreateAnAccountPage() {
        assertEquals(createAccountPage.getPageHeading(), "CREATE AN ACCOUNT");
    }


    @When("^user enters their personal information from \"([^\"]*)\"$")
    public void userEntersTheirPersonalInformationFrom(String row) {
        createAccountPage.enterPersonalInformation(TestUtil.getSheetRow(sheetName, row));
    }

    @When("^user enters the required personal information$")
    public void userEntersTheirPersonalInformation(List<String> personalInformation) {
        String firstName = personalInformation.get(0);
        String lastName = personalInformation.get(1);
        String password = personalInformation.get(2);

        createAccountPage.enterRequiredPersonalInformation(firstName, lastName, password);
    }

    @When("^user enters their address information$")
    public void user_enters_their_address_information(DataTable addressInformation) {
        List<List<String>> data = addressInformation.raw();

        createAccountPage.enterAddressInformation(
                data.get(1).get(1), data.get(2).get(1), data.get(3).get(1), data.get(4).get(1),
                data.get(5).get(1), data.get(6).get(1), data.get(7).get(1), data.get(8).get(1),
                data.get(9).get(1), data.get(10).get(1), data.get(11).get(1), data.get(12).get(1),
                data.get(13).get(1));
    }

    @When("^user clicks in the register button$")
    public void user_clicks_in_the_register_button() {
        dashboardPage = createAccountPage.clickRegisterButton();
    }

    @Then("^registration is complete$")
    public void registration_is_complete() {
        assertEquals(dashboardPage.getPageHeading(), "My account");
    }

}
