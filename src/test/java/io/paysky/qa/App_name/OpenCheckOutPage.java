package io.paysky.qa.App_name;

import io.paysky.qa.pages.CheckOut;

public class OpenCheckOutPage
{
    CheckOut checkOut= new CheckOut();
    @org.testng.annotations.Test(priority = 1)
    public void OpenCheckOut() throws Exception {

        checkOut.ClickOnPayButton();
    }
}
