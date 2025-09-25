package StepDefinitions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static Driver.DriverManager.driver;

public class Hooks {

    @Before
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setDeviceName("emulator-5554")
                .setApp("C:\\Users\\Alist\\Downloads\\SauceLabs.apk")
                .ignoreHiddenApiPolicyError()
                .setNoReset(false)
                .setFullReset(false)
                .setAppPackage("com.swaglabsmobileapp")
                .setAppActivity("com.swaglabsmobileapp.SplashActivity")
                .setAutomationName("UiAutomator2")
                .autoGrantPermissions();

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("test-Username")));
    }

    @After
    public void tearDown() throws MalformedURLException {
        if (driver != null) {
            driver.quit();
        }
    }
}
