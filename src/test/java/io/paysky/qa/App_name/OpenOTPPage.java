package io.paysky.qa.App_name;
import io.paysky.qa.pages.OTPPage;

public class OpenOTPPage
{
    OTPPage otpPage= new OTPPage();
    @org.testng.annotations.Test(priority = 1)
    public void EnterFirstOTPDigit() throws Exception {

otpPage.EnterFirstDigit();

    }
}
