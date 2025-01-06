package io.paysky.qa.App_name;

import io.paysky.qa.pages.DividedQattah;

public class OpenDividedQattah
{
   final DividedQattah dividedQattah= new DividedQattah();
    @org.testng.annotations.Test(priority = 4)
    public void DividedGattahAmount() throws Exception {

        dividedQattah.EnterAmount();
    }
    @org.testng.annotations.Test(priority = 5)
    public void DividedButton() throws Exception {

        dividedQattah.ClickOnDividedButton();
    }

   /* @org.testng.annotations.Test(priority = 8)
    public void RestartButton() throws Exception {

        dividedQattah.ClickOnRestarButton();
    }*/

}
