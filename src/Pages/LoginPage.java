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
        return driver.findElement(By.id("user-name"));
    }

    private WebElement passwordField() {
        return driver.findElement(By.className("test-Password"));
    }
    private WebElement loginButton() {
        return driver.findElement(By.className("password"));
    }

    private String errorMessage(String msg) {
        return driver.findElement(By.xpath("//*[@data-test='error']"))
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
