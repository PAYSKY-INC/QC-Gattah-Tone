package io.paysky.qa.App_name.CreateQattah;
import io.paysky.qa.pages.CreateQattah.OnboardingPage;

public class OpenGattahHomepage {

    final OnboardingPage onboardingPage = new OnboardingPage();

    @org.testng.annotations.Test(priority = 2)
    final  void NewQattah() throws  Exception{
        onboardingPage.ClickOnNewQattah();
    }

}
