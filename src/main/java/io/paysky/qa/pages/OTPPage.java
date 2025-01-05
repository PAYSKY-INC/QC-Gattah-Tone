package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OTPPage extends AbstractClass
{
    private final By FirstDigit = AppiumBy.xpath("(//android.widget.FrameLayout[@resource-id=\"com.paysky.qattah:id/otpView\"])[2]/android.widget.TextView\n");

    public void EnterFirstDigit() throws Exception {
        // Wait for the element to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement firstDigitElement = wait.until(ExpectedConditions.visibilityOfElementLocated(FirstDigit));

        // Enter the first digit
        firstDigitElement.sendKeys("1");
    }
}
