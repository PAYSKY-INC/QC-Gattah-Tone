package io.paysky.qa.App_name;


import io.paysky.qa.pages.OnboardingPage;

public class OpenGattahHomepage {

    final OnboardingPage onboardingPage = new OnboardingPage();

    @org.testng.annotations.Test(priority = 1)
    public void OpenGattah() throws Exception {
        onboardingPage.clickOnStartButton();
    }

}
