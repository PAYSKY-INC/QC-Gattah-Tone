
package io.paysky.qa.App_name.PayQattah;
import io.paysky.qa.pages.PayQattah.OTPPage;

public class OpenOTPPage
{
    OTPPage otpPage= new OTPPage();
    @org.testng.annotations.Test(priority = 1)
    public void EnterFirstOTPDigit() throws Exception {

otpPage.EnterFirstDigit();

    }
}
