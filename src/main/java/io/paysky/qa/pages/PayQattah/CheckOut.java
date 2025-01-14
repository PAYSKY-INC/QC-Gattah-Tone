package io.paysky.qa.pages.PayQattah;

import io.appium.java_client.AppiumBy;
import io.paysky.qa.pages.CreateQattah.AbstractClass;
import org.openqa.selenium.By;

public class CheckOut extends AbstractClass
{
    private final By PayButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Pay\"]\n");

    public void ClickOnPayButton() throws Exception {
        clickOnElement(PayButton, 20);
    }
}
