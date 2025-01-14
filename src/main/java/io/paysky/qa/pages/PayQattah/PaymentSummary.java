package io.paysky.qa.pages.PayQattah;

import io.appium.java_client.AppiumBy;
import io.paysky.qa.pages.CreateQattah.AbstractClass;
import org.openqa.selenium.By;

public class PaymentSummary extends AbstractClass
{
    private final By CloseButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Close\"]\n");
    public void ClickOnCloseButton() throws Exception {
        clickOnElement(CloseButton, 20);
    }
}
