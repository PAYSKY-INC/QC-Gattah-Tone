package io.paysky.qa.pages.Filters;

import io.appium.java_client.AppiumBy;
import io.paysky.qa.pages.AbstractClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;

public class ApplyFilter extends AbstractClass
{
    private final By ClickOnApply= AppiumBy.xpath("//android.widget.TextView[@class='android.widget.TextView' and @text='Apply']");
    public void ClickOnApply() throws Exception {
        waitForPresenceOf(ClickOnApply, 30);
        clickOnElement(ClickOnApply,20);
    }

}