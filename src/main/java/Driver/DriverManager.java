package Driver;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.time.Duration;

public class DriverManager {
    public static AndroidDriver driver;

    public static void initDriver() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setDeviceName("dead23b55c8d")
                .setApp("C:\\Users\\Alist\\Downloads\\SauceLabs.apk")
                .ignoreHiddenApiPolicyError()
                .setNoReset(true)
                .setFullReset(false)
                .setAppPackage("com.swaglabsmobileapp")
                .setAppActivity("com.swaglabsmobileapp.SplashActivity")
                .autoGrantPermissions();



        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
    }

    public static void quitDriver() {
        if (driver != null) driver.quit();
    }

    public static WebElement waitForElementToBeVisible(String elementId)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId(elementId)));

    }
}
