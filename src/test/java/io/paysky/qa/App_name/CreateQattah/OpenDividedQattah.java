package io.paysky.qa.App_name.CreateQattah;

import io.paysky.qa.pages.CreateQattah.DividedQattah;

public class OpenDividedQattah
{
   final DividedQattah dividedQattah= new DividedQattah();
    @org.testng.annotations.Test(priority = 1)
    public void DividedGattahButton() throws Exception {

        dividedQattah.ClickOnQattahTypeDivided();
    }
    @org.testng.annotations.Test(priority = 2)
    public void DividedGattahAmount() throws Exception {

        dividedQattah.EnterAmount();
    }
    @org.testng.annotations.Test(priority = 3)
    public void DividedButton() throws Exception {

        dividedQattah.ClickOnDividedButton();
    }

   /* @org.testng.annotations.Test(priority = 8)
    public void RestartButton() throws Exception {

        dividedQattah.ClickOnRestarButton();
    }*/

}
