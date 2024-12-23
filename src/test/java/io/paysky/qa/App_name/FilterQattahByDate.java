package io.paysky.qa.App_name;

import io.paysky.qa.pages.FilterQattah;

public class FilterQattahByDate
{
    FilterQattah filterQattah= new FilterQattah();
    @org.testng.annotations.Test(priority = 1)
    public void ClickOnFilter() throws Exception {
        filterQattah.ClickOnFilterButton();
    }
    @org.testng.annotations.Test(priority = 2)
    public void ClickOnCalender() throws Exception {
        filterQattah.OpenCalender();
    }
    @org.testng.annotations.Test(priority = 3)
    public void GetAllYears() throws Exception {
        filterQattah.GetAllYears();
    }
    @org.testng.annotations.Test(priority = 4)
    public void  ClickOnOkButton() throws Exception {
        filterQattah.ClickOnoKButton();
    }

}
