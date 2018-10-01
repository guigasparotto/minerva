package cucumber.runner;

import com.automationpractice.base.TestBase;
import com.automationpractice.pages.CreateAccountPage;
import com.automationpractice.pages.DashboardPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.LoginPage;
import com.automationpractice.util.TestUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertEquals;

public class LoginPageSteps extends TestBase {

    private HomePage homePage;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private CreateAccountPage createAccountPage;

    @Before
    public void SetUp() {
        initialisation();
        homePage = new HomePage();
        loginPage = homePage.clickSignInLink();
    }

    @After
    // Runs after every test method in the class
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }

    @Given("^user is on login page$")
    public void user_is_on_login_page() {
        assertEquals(loginPage.getPageTitle(), "Login - My Store");
    }

    @When("^user enters \"([^\"]*)\" in the username field$")
    public void userEntersInTheUsernameField(String username) {
        loginPage.setLoginEmail(username);
    }

    @And("^user enters \"([^\"]*)\" in the password field$")
    public void userEntersInThePasswordField(String password) {
        loginPage.setLoginPassword(password);
    }

    @When("^user clicks in the signin button$")
    public void user_clicks_in_the_signin_button() {
        dashboardPage = loginPage.clickSignIn();
    }

    @Then("^user accesses dashboard$")
    public void user_accesses_dashboard() {
        assertEquals(dashboardPage.getPageTitle(), "My account - My Store");
    }

    @Then("^welcome message is displayed$")
    public void welcome_message_is_displayed() {
        assertEquals(dashboardPage.welcomeMessage(), "Welcome to your account. " +
                "Here you can manage all of your personal information and orders.");
    }

    @Then("^invalid password message is displayed$")
    public void invalid_password_message_is_displayed() {
        assertEquals(loginPage.errorAlert(), "There is 1 error");
        assertEquals(loginPage.authenticationFailedMsg(), "Authentication failed.");
    }

    @When("^user enters a new email in the email address field$")
    public void user_enters_a_new_email_in_the_email_address_field() {
        loginPage.setNewAccountEmail(TestUtil.createRandomEmail());
    }

    @When("^user clicks in the create an account button$")
    public void user_clicks_in_the_create_an_account_button() {
        createAccountPage = loginPage.clickCreateAccount();
    }

    @Then("^create an account page is loaded$")
    public void dashboard_page_is_loaded() {
        assertEquals(createAccountPage.getPageHeading(), "CREATE AN ACCOUNT");
    }

    @Then("^empty email message is displayed$")
    public void empty_email_message_is_displayed() {
        assertEquals(loginPage.emptyEmailMsg(), "An email address required.");
    }

    @Then("^empty password message is displayed$")
    public void emptyPasswordMessageIsDisplayed() {
        assertEquals(loginPage.emptyPasswordMsg(), "Password is required.");
    }
}
