package Pages;

import Driver.DriverManager;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WebElement usernameField;
    private final WebElement passwordField;
    private final WebElement loginButton;

    public LoginPage(AndroidDriver driver) {

        usernameField = driver.findElement(AppiumBy.accessibilityId("test-Username"));
        passwordField = driver.findElement(AppiumBy.accessibilityId("test-Password"));
        loginButton = driver.findElement(AppiumBy.accessibilityId("test-LOGIN"));
    }

    private WebElement usernameField() {
        return DriverManager.waitForElementToBeVisible(usernameField);
    }

    private WebElement passwordField() {
        return DriverManager.waitForElementToBeVisible(passwordField);
    }

    public void waitForErrorMessageToBeVisible() {
        DriverManager.waitForElementToBeVisible("test-Error message");
    }

    public void enterUsername(String username) {
        usernameField().sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField().sendKeys(password);
    }

    public void clickLogin() {
        DriverManager.waitForElementToBeClickable(loginButton).click();
    }

    public void loginScreenIsNotVisible()
    {
        DriverManager.waitForElementToNotBeVisible(usernameField);
        DriverManager.waitForElementToNotBeVisible(passwordField);
        DriverManager.waitForElementToNotBeVisible(loginButton);
    }
}
