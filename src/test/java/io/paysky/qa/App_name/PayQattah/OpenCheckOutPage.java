
package io.paysky.qa.App_name.PayQattah;
import io.paysky.qa.pages.PayQattah.CheckOut;
import org.testng.annotations.Test;

public class OpenCheckOutPage
{
    CheckOut checkOut= new CheckOut();
    @Test(priority = 1)
    public void OpenCheckOut() throws Exception {

        checkOut.ClickOnPayButton();
    }
}
