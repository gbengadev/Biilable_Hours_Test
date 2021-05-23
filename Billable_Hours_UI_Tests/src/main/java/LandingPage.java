import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
    private AndroidDriver<MobileElement> driver;
    private By filePathField= MobileBy.className("android.widget.EditText");
    private  By getInvoiceButton= MobileBy.className("android.view.View");

    public LandingPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void parsebase64file_checkIfFileIsParsedSuccessfully(String filePath) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(filePathField));
        driver.findElement(filePathField).click();
        Actions action = new Actions(driver);
        action.sendKeys(filePath).perform();
        driver.findElement(getInvoiceButton).click();
    }
    public boolean homepage_checkIfPageElementsAreVisible() {
       if (driver.findElement(filePathField).isDisplayed()&&driver.findElement(getInvoiceButton).isDisplayed()&&driver.findElement(getInvoiceButton).isEnabled()){
           return true;
       }
       return false;
    }
}
