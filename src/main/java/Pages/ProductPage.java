package Pages;

import Driver.DriverManager;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

    private final WebElement productViewGroup;
    private final WebElement menuButton;
    private final WebElement shoppingCartButton;

    public ProductPage(AndroidDriver driver) {
        productViewGroup = driver.findElement(AppiumBy.accessibilityId("test-PRODUCTS"));
        menuButton = driver.findElement(AppiumBy.accessibilityId("test-Menu"));
        shoppingCartButton = driver.findElement(AppiumBy.accessibilityId("test-Cart"));
    }

   public void productScreenIsVisible()
   {
       DriverManager.waitForElementToBeVisible(productViewGroup);
       DriverManager.waitForElementToBeClickable(menuButton);
       DriverManager.waitForElementToBeClickable(shoppingCartButton);
   }
}
