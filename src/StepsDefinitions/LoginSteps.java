package StepsDefinitions;

import Driver.DriverManager;
import Pages.LoginPage;

public class LoginSteps {
    private LoginPage  loginPage;

   // @Given("the user is on the login page")
    public void userOnLoginPage() throws Exception {
        DriverManager.initDriver();
        loginPage = new LoginPage(DriverManager.driver);
    }

}
