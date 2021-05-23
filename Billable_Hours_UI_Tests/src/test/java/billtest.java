import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Util.PageUtility;


import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.assertTrue;

public class billtest {
    public AndroidDriver<MobileElement> driver;
    protected LandingPage landingPage;
    PageUtility util= new PageUtility(driver);

    //Create data provider object
    @DataProvider(name = "data")
    public static Object[][] base64File() {
        return new Object[][] { { "RW1wbG95ZWUgSUQsQmlsbGFibGUgUmF0ZSAocGVyIGhvdXIpLFByb2plY3QsRGF0ZSxTdGFydCBUaW1lLEVuZCBUaW1l" +
                "CjEsMzAwLEdvb2dsZSwyMDE5LTA3LTAxLDA5OjAwLDE3OjAwCjIsMTAwLEZhY2Vib29rLDIwMTktMDctMDEsMTE6MDAsMTY6MDA=" },
                { "RW1wbG95ZWUgSUQsQmlsbGFibGUgUmF0ZSAocGVyIGhvdXIpLFByb2plY3QsRGF0ZSxTdGFydCBUaW1lLEVuZCBUaW1lCjEsMzAwLEdvb2dsZSwyMDE5LTA3LTAx" +
                        "LDk6MDAsMTc6MDAKMSwzMDAsQ0JOLDIwMTktMDctMDIsMTA6MDAsMTc6MDAKMiwxMDAsRmFjZWJvb2ssMjAxOS0wNy0wMSwxMTowMCwxNjowMAoyLDEwMCxGYWNlYm9vay" +
                        "wyMDE5LTA4LTAxLDEwOjAwLDE2OjAwCjIsMTAwLEZhY2Vib29rLDIwMTktMDktMDEsMTE6MDAsMTQ6MDAKMiwxMDAs" +
                        "RmFjZWJvb2ssMjAxOS0xMC0wMSwxMTowMCwxMzowMAozLDIwMCxGYWNlYm9vaywyMDE5LTEwLTAxLDExOjAwLDEzOjAwCg=="}};
    }

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("platformVersion", "$Android os version");
        dc.setCapability("app", "$apk path");
        dc.setCapability("deviceName", "Android Device");
        dc.setCapability("udid", "$Device Id");
        dc.setCapability("noReset", "true");
        dc.setCapability("autoGrantPermissions", "true");
        dc.setCapability("automationName", "UiAutomator2");
        dc.setCapability("appWaitForLaunch", "true");
        dc.setCapability("unicodeKeyboard", false);
        dc.setCapability("resetKeyboard", false);
        URL appiumServerURL = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appiumServerURL,
                dc);
        landingPage= new LandingPage(driver);
        //util.dismissPermissionPopUp(driver);
    }

    @Test(dataProvider = "data")
    public void hompage_parseBase64File(String base64FilePath) throws InterruptedException {
        landingPage.parsebase64file_checkIfFileIsParsedSuccessfully(base64FilePath);
    }
    @Test
    public void homepage_checkPageElements(){
        assertTrue(landingPage.homepage_checkIfPageElementsAreVisible(),"Elements are not visible on the page");
    }
    @AfterTest
    public void closeSession(){
        driver.quit();
    }
}
