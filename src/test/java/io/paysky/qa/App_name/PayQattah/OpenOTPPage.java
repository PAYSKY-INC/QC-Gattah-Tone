
package io.paysky.qa.App_name.PayQattah;
import io.paysky.qa.pages.PayQattah.OTPPage;

public class OpenOTPPage
{
    OTPPage otpPage= new OTPPage();
    @org.testng.annotations.Test(priority = 1)
    public void EnterFirstOTPDigit() throws Exception {

otpPage.EnterFirstDigit();

    }
    @org.testng.annotations.Test(priority = 2)
    public void EnterSecondOTPDigit() throws Exception {

        otpPage.EnterSecondDigit();

    }
    @org.testng.annotations.Test(priority = 3)
    public void EntertThirdOTPDigit() throws Exception {

        otpPage.EnterThirdDigit();

    }
    @org.testng.annotations.Test(priority = 4)
    public void EnterLastOTPDigit() throws Exception {

        otpPage.EnterlastDigit();
    }
}
