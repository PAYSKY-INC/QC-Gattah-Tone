package io.paysky.qa.pages.Filters;

import io.appium.java_client.AppiumBy;
import io.paysky.qa.pages.CreateQattah.AbstractClass;
import org.openqa.selenium.By;

public class ApplyFilter extends AbstractClass
{
    private final By ClickOnApply= AppiumBy.xpath("//android.widget.TextView[@class='android.widget.TextView' and @text='Apply']");
    public void ClickOnApply() throws Exception {
        waitForPresenceOf(ClickOnApply, 30);
        clickOnElement(ClickOnApply,20);
    }

}