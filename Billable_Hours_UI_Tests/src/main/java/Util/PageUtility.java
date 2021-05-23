package Util;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;

public class PageUtility {
    private AndroidDriver<MobileElement> driver;

    public PageUtility(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void dismissPermissionPopUp(AndroidDriver<MobileElement> driver){
            driver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_deny_button")).click();
    }
}
