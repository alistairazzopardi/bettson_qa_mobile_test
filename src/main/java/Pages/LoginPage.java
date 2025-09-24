package Pages;

import Driver.DriverManager;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private final AndroidDriver driver;

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    private WebElement usernameField() {
        return DriverManager.waitForElementToBeVisible("test-Username");
    }

    private WebElement passwordField() {
        return DriverManager.waitForElementToBeVisible("test-Password");
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
        DriverManager.waitForElementToBeClickable("test-LOGIN").click();
    }

    public boolean isErrorMessageDisplayed(String msg) {
        return !errorMessage(msg).isEmpty();
    }
}
