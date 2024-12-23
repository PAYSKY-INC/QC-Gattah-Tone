package io.paysky.qa.App_name;
import io.paysky.qa.pages.OnboardingPage;

public class OpenGattahHomepage {

    final OnboardingPage onboardingPage = new OnboardingPage();

    @org.testng.annotations.Test(priority = 2)
    final  void NewQattah() throws  Exception{
        onboardingPage.ClickOnNewQattah();
    }
    /*@org.testng.annotations.Test(priority = 3)
final  void QattahTypeFull() throws  Exception{
        onboardingPage.ClickOnQattahTypeFull();
}*/
    @org.testng.annotations.Test(priority = 3)
    final  void QattahTypeDivided() throws  Exception{
        onboardingPage.ClickOnQattahTypeDivided();
    }

}
