package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class OnboardingPage extends AbstractClass {

    private final By StartButton = AppiumBy.id("com.paysky.qattah:id/button3");

    public void clickOnStartButton() throws Exception {
        clickOnElement(StartButton,20);
    }
}
