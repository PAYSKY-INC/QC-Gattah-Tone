package io.paysky.qa.App_name;

public class FilterQattahByDate
{
    io.paysky.qa.pages.FilterQattahByDate filterQattah= new io.paysky.qa.pages.FilterQattahByDate();
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

}
