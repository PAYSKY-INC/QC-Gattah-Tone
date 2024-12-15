package io.paysky.qa.utilities.sharedComponent;

import io.paysky.qa.pages.*;
import io.paysky.qa.utilities.DataFaker;
import io.paysky.qa.utilities.testdata.Constant;

public class SharedComponent {

    final DataFaker dataFaker = new DataFaker();

    public void loginToMainMenu(String mobileNum, String[] pin) throws Exception {
        // Use default values if none are provided
        if (mobileNum == null) {
            mobileNum = Constant.EG_MOBILE_NUMBER;
        }
        if (pin == null) {
            pin = Constant.DEFAULT_PIN;
        }
    }
    public void loginToMainMenu() throws Exception {
        loginToMainMenu(null, null);  // Calls the main method with default values
    }

    public void registerUsingNewNumber(String mobileNum, String[] pin) throws Exception {
        // Use default values if none are provided
        if (mobileNum == null) {
            mobileNum = dataFaker.egyMobileNumber(); ;
        }
        if (pin == null) {
            pin = Constant.REGISTER_DEFAULT_PIN;
        }
    }
    public void registerUsingNewNumber() throws Exception {
        registerUsingNewNumber(null, null);  // Calls the main method with default values
    }

}
