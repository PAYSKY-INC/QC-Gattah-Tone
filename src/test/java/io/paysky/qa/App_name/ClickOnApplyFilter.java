package io.paysky.qa.App_name;

import io.paysky.qa.pages.ApplyFilter;

public class ClickOnApplyFilter
{
   final ApplyFilter applyFilter= new ApplyFilter();
    @org.testng.annotations.Test(priority = 1)
    public void ApplyFilterButton() throws Exception {
        applyFilter.swipeUntilButtonIsVisible();
    }
}
