package io.paysky.qa.App_name;

import io.paysky.qa.pages.FullQattah;

public class OpenFullQattahpage
{
    final FullQattah fullQattah= new FullQattah();
    @org.testng.annotations.Test(priority = 4)
    public void FullGattahAmount() throws Exception {

        fullQattah.EnterAmount();
    }
    @org.testng.annotations.Test(priority = 5)
    public void CreateButton() throws Exception {

        fullQattah.ClickOnCreateButton();
    }
}
