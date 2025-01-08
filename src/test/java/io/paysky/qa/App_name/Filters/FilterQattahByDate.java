package io.paysky.qa.App_name.Filters;

import io.paysky.qa.pages.PayQattah.ClickOnSelectReasons;

public class FilterQattahByDate
{
    io.paysky.qa.pages.Filters.FilterQattahByDate filterQattah= new io.paysky.qa.pages.Filters.FilterQattahByDate();
    @org.testng.annotations.Test(priority = 1)
    public void ClickOnCalender() throws Exception {
        filterQattah.OpenCalender();
    }
    @org.testng.annotations.Test(priority = 2)
    public void GetAllYears() throws Exception {
        filterQattah.GetAllYears();
    }
    @org.testng.annotations.Test(priority = 3)
    public void  ClickOnOkButton() throws Exception {
        filterQattah.ClickOnoKButton();
    }
    @org.testng.annotations.Test(priority = 4)
    public void  ScrollToGetApplyButton() throws Exception {
       ClickOnSelectReasons.swipeWithinPopup();
    }

}
