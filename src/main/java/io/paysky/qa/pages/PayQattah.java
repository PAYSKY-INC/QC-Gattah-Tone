package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class PayQattah extends AbstractClass
{
    private final By PayQattah= AppiumBy.xpath("(//android.view.View[@content-desc=\"Circle\"])[2]\n");
    public void ClickOnPayQattaht() throws Exception {
        waitForPresenceOf(PayQattah, 30);
        System.out.println("Clicking on PayQattah button...");

        clickOnElement(PayQattah,20);
    }
    private  final By HearTone= AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Circle\"]\n");
    public void PressToHearTone() throws  Exception{
        clickOnElement(HearTone,20);
    }
}
