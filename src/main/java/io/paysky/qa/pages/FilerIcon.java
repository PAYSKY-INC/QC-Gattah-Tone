package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class FilerIcon extends AbstractClass
{
    private final By FilterButton= AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Circle\"]\n");
    public void ClickOnFilterButton() throws Exception {
        waitForPresenceOf(FilterButton, 30);
        clickOnElement(FilterButton,20);
    }
}
