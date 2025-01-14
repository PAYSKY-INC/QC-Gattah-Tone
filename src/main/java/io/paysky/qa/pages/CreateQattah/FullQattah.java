package io.paysky.qa.pages.CreateQattah;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.Random;

public class FullQattah extends AbstractClass
{
    private final By QattahTypeFull = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"android:id/content\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]\n");
    public void ClickOnQattahTypeFull() throws Exception {
        clickOnElement(QattahTypeFull, 20);
    }
    private final By Amount = AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView\n");

    public void EnterAmount() throws Exception {

        Random random = new Random();
        int randomAmount = 100 + random.nextInt(200000 - 100 + 1); // (200000 - 100 + 1) ensures the range is inclusive

        // Wait for the element to be visible before interacting
        WebElement element = waitForVisibilityOf(Amount, 10);

        // Clear any existing text in the field (optional but recommended)
        element.clear();

        // Use JavascriptExecutor to input the random amount without opening the keyboard
        ((JavascriptExecutor) driver).executeScript("mobile: type", ImmutableMap.of("text", String.valueOf(randomAmount)));

        System.out.println("Entered random amount: " + randomAmount);
    }

    private final By CreateButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Create Qattah\"]\n");
    public void ClickOnCreateButton() throws Exception{
        clickOnElement(CreateButton,20);
    }

}
