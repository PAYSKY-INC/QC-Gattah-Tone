package io.paysky.qa.pages.PayQattah;

import io.appium.java_client.AppiumBy;
import io.paysky.qa.pages.CreateQattah.AbstractClass;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PayQattah extends AbstractClass {
    private final By PayQattah = AppiumBy.xpath("(//android.view.View[@content-desc=\"Circle\"])[2]\n");

    public void ClickOnPayQattaht() throws Exception {
        waitForPresenceOf(PayQattah, 20);
        clickOnElement(PayQattah, 20);
    }

    private final By HearTone = AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"Circle\"])[1]\n");
    private final By ToneConfirmationElement = AppiumBy.xpath("//android.widget.TextView[@text=\"-- Select reason --\"]\n"); // Replace with actual locator

    public void PressToHearTone() throws Exception {
        clickOnElement(HearTone, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ToneConfirmationElement));
    }
}

