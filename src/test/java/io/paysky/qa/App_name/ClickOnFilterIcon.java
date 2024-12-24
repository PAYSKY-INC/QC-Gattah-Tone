package io.paysky.qa.App_name;

import io.paysky.qa.pages.FilterQattahByDate;

public class ClickOnFilterIcon
{
    FilterQattahByDate filterQattah= new FilterQattahByDate();
    @org.testng.annotations.Test(priority = 1)
    public void ClickOnFilter() throws Exception {
        filterQattah.ClickOnFilterButton();
    }
}
