package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class CheckOut extends AbstractClass
{
    private final By PayButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Pay\"]\n");

    public void ClickOnPayButton() throws Exception {
        clickOnElement(PayButton, 20);
    }
}
