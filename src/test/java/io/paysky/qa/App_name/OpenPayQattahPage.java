package io.paysky.qa.App_name;

import io.paysky.qa.pages.PayQattah;

public class OpenPayQattahPage
{
    PayQattah payQattah= new PayQattah();
    @org.testng.annotations.Test(priority = 1)
    public void PayButton() throws Exception {

            payQattah.ClickOnPayQattaht();
    }
    @org.testng.annotations.Test(priority = 2)
    public void PressToneButton() throws Exception {

        payQattah.PressToHearTone();

    }

}
