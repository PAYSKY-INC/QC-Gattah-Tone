package io.paysky.qa.App_name.PayQattah;

import io.paysky.qa.pages.PayQattah.PaymentSummary;

public class PaymentSummaryPage {
    PaymentSummary paymentSummary = new PaymentSummary();

    @org.testng.annotations.Test(priority = 1)
    public void ClickOnCloseButton() throws Exception {

        paymentSummary.ClickOnCloseButton();
    }
}
