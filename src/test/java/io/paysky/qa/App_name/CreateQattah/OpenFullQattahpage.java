package io.paysky.qa.App_name.CreateQattah;

import io.paysky.qa.pages.CreateQattah.FullQattah;

public class OpenFullQattahpage
{
    final FullQattah fullQattah= new FullQattah();
    @org.testng.annotations.Test(priority = 1)
    public void FullGattahButton() throws Exception {

        fullQattah.ClickOnQattahTypeFull();
    }
    @org.testng.annotations.Test(priority = 2)
    public void FullGattahAmount() throws Exception {
        Thread.sleep(20);
        fullQattah.EnterAmount();
    }
    @org.testng.annotations.Test(priority = 3)
    public void CreateButton() throws Exception {

        fullQattah.ClickOnCreateButton();
    }
}
