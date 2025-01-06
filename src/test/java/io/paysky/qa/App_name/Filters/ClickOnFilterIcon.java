package io.paysky.qa.App_name.Filters;

import io.paysky.qa.pages.Filters.FilterQattahByDate;

public class ClickOnFilterIcon
{
    FilterQattahByDate filterQattah= new FilterQattahByDate();
    @org.testng.annotations.Test(priority = 1)
    public void ClickOnFilter() throws Exception {
        filterQattah.ClickOnFilterButton();
    }
}
