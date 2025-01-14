package io.paysky.qa.pages.CreateQattah;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class OnboardingPage extends AbstractClass {

    private final By NewQattah = AppiumBy.xpath("//android.widget.TextView[@text=\"New Qattah\"]\n");
    public void ClickOnNewQattah() throws Exception{
        clickOnElement(NewQattah,60);
    }


}
