package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PayQattah extends AbstractClass {
    private final By PayQattah = AppiumBy.xpath("(//android.view.View[@content-desc=\"Circle\"])[2]\n");

    public void ClickOnPayQattaht() throws Exception {
        waitForPresenceOf(PayQattah, 30);
        System.out.println("Clicking on PayQattah button...");

        clickOnElement(PayQattah, 20);
    }

    private final By HearTone = AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Circle\"]");
    private final By ToneConfirmationElement = AppiumBy.xpath("//android.widget.TextView[@text=\"-- Select reason --\"]\n"); // Replace with actual locator

    public void PressToHearTone() throws Exception {
        System.out.println("Clicking HearTone button...");
        clickOnElement(HearTone, 20);

        // Wait for tone confirmation or timeout
        System.out.println("Waiting for tone confirmation...");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Wait up to 20 seconds
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(ToneConfirmationElement));
            System.out.println("Tone confirmation detected.");
        } catch (TimeoutException e) {
            System.out.println("Tone confirmation not detected within 20 seconds.");
            throw e;
        }
    }
}

