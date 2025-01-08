package io.paysky.qa.App_name.Filters;

import io.paysky.qa.pages.Filters.ApplyFilter;

public class ClickOnApplyFilter
{
   final ApplyFilter applyFilter= new ApplyFilter();
    @org.testng.annotations.Test(priority = 1)
    public void ApplyFilterButton() throws Exception {
     applyFilter.ClickOnApply();
    }
}
