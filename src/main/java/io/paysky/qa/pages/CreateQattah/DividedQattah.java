package io.paysky.qa.pages.CreateQattah;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class DividedQattah extends AbstractClass
{
    private final By QattahTypeDivided = AppiumBy.xpath("//android.widget.TextView[@text=\"Divided Qattah\"]\n");
    public void ClickOnQattahTypeDivided() throws Exception{
        clickOnElement(QattahTypeDivided,20);
    }
    private final By Amount = AppiumBy.xpath("//android.widget.EditText[contains(@text, \".00\")]");
    public void EnterAmount() throws Exception {
        Random random = new Random();
        int randomAmount = 100 + random.nextInt(200000 - 100 + 1); // (200000 - 100 + 1) ensures the range is inclusive
        // Wait for the element to be visible before interacting
        WebElement element = waitForVisibilityOf(Amount, 30);
        // Clear any existing text in the field (optional but recommended)
        element.clear();
        element.sendKeys(String.valueOf(randomAmount)); // Convert integer to String
    }
    private final By DividedButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Divide the Qattah\"]\n");
    public void ClickOnDividedButton() throws Exception{
        clickOnElement(DividedButton,10);
    }
    private final By CreateButton= AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[4]\n");
   public void ClickOnCreateButton() throws Exception{
       clickOnElement(CreateButton,10);
   }
   private final By RestartTone=AppiumBy.accessibilityId("Circle");
   public void ClickOnRestarButton() throws  Exception{
       clickOnElement(RestartTone,20);
   }
}
