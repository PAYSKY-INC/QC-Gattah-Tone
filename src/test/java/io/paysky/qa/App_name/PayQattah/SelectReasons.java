package io.paysky.qa.App_name.PayQattah;

import io.paysky.qa.pages.PayQattah.ClickOnSelectReasons;

public class SelectReasons
{
    ClickOnSelectReasons clickOnSelectReasons=new ClickOnSelectReasons();
    @org.testng.annotations.Test(priority = 1)
    public void OpenFirstList() throws Exception {

       clickOnSelectReasons.OpenReasonsFirstDropdownList();
    }
    @org.testng.annotations.Test(priority = 2)
    public void SelectFirstRandomReason() throws Exception {

        clickOnSelectReasons.selectFirstRandomReasonByClass();
    }
    @org.testng.annotations.Test(priority = 3)
    public void OpenSecondList() throws Exception {

        clickOnSelectReasons.OpenReasonsSecondDropdownList();
    }
    @org.testng.annotations.Test(priority = 4)
    public void SelectSecondRandomReason() throws Exception {

        clickOnSelectReasons.selectSecondRandomReasonByClass();
    }
    @org.testng.annotations.Test(priority = 5)
    public void ClickOnNextButton() throws Exception {
        clickOnSelectReasons.ClickOnNextButton();
    }
}
