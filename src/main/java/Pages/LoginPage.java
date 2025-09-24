package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final AndroidDriver driver;

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    private WebElement usernameField() {
        return By.id("user-name").findElement(driver);
    }

    private WebElement passwordField() {
        return By.className("test-Password").findElement(driver);
    }
    private WebElement loginButton() {
        return By.className("password").findElement(driver);
    }

    private String errorMessage(String msg) {
        return By.xpath("//*[@data-test='error']").findElement(driver)
                .getText();
    }

    public void enterUsername(String username) {
        usernameField().sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField().sendKeys(password);
    }

    public void clickLogin() {
        loginButton().click();
    }

    public boolean isErrorMessageDisplayed(String msg) {
        return !errorMessage(msg).isEmpty();
    }
}
