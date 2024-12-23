package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import net.datafaker.App;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OnboardingPage extends AbstractClass {

    private final By StartButton = AppiumBy.id("com.paysky.qattah:id/button3");

    public void clickOnStartButton() throws Exception {
        clickOnElement(StartButton,20);
    }
    private final By NewQattah = AppiumBy.xpath("(//android.view.View[@content-desc=\"Circle\"])[1]\n");
    public void ClickOnNewQattah() throws Exception{
        clickOnElement(NewQattah,60);
    }
/*private final By QattahTypeFull = AppiumBy.xpath("//android.widget.TextView[contains(@text, 'Full Qattah')]");
    public void ClickOnQattahTypeFull() throws Exception{
        clickOnElement(QattahTypeFull,20);
    }*/
    private final By QattahTypeDivided = AppiumBy.xpath("//android.widget.TextView[@text=\"Divided Qattah\"]\n");
    public void ClickOnQattahTypeDivided() throws Exception{
        clickOnElement(QattahTypeDivided,20);
    }

}
