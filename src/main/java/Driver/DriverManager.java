package Driver;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverManager {
    public static AndroidDriver driver;

    public static WebElement waitForElementToBeVisible(WebElement webElement)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        return wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void waitForElementToBeVisible(String elementId)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId(elementId)));
    }

    public static void waitForElementToNotBeVisible(WebElement webElement)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    public static WebElement waitForElementToBeClickable(WebElement webElement)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }
}
