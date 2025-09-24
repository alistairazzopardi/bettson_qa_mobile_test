package StepDefinitions;

import Driver.DriverManager;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    private LoginPage  loginPage;

    @Given("the user is on the login page")
    public void userOnLoginPage() throws Exception {
        DriverManager.initDriver();
        loginPage = new LoginPage(DriverManager.driver);
    }

    @When("the user enters username {string} and password {string}")
    public void inputUsernameAndPassword(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("the user clicks the login CTA")
    public void clickLoginCTA() {
        loginPage.clickLogin();
        DriverManager.quitDriver();
    }

    @Then("an error message {string} should be displayed")
    public void verifyErrorMessageDisplayed(String message) {
        Assert.assertTrue(loginPage.isErrorMessageDisplayed(message));
        DriverManager.quitDriver();
    }
}
