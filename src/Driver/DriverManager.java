package Driver;

import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;

import java.net.URL;

public class DriverManager {
    public static AndroidDriver driver;

    public static void initDriver() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setDeviceName("dead23b55c8d")
                .setApp("C:\\Users\\Alist\\CrossDevice\\POCO X4 Pro 5G\\storage\\Download");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
    }

    public static void quitDriver() {
        if (driver != null) driver.quit();
    }
}
