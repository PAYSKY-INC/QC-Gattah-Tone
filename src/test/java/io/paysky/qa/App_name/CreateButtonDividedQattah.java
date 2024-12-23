package io.paysky.qa.App_name;

import io.paysky.qa.pages.DividedQattah;
import io.paysky.qa.pages.PayQattah;

public class CreateButtonDividedQattah
{
    final DividedQattah dividedQattah= new DividedQattah();
    @org.testng.annotations.Test(priority = 1)
    public void CreateButton() throws Exception {
        // Start PayQattah execution in a new thread

        dividedQattah.ClickOnCreateButton();
        System.out.println("Finished executing RestartButton method...");
    }
}
