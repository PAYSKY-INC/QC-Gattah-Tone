package io.paysky.qa.pages.PayQattah;
import io.appium.java_client.MobileBy;

import io.paysky.qa.pages.AbstractClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.util.NoSuchElementException;

public class OTPPage extends AbstractClass
{
    public void EnterFirstDigit() throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

            // Ensure Samsung keyboard is set as the default
            setDefaultKeyboard();

            // Locate the TextView element to activate the OTP input field (for first digit)
            WebElement firstDigitElement = wait.until(ExpectedConditions.presenceOfElementLocated(
                    MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.TextView\").instance(2)")
            ));

            // Click to activate the OTP field and open the keyboard
            firstDigitElement.click();

            // Wait until the keyboard is displayed (if necessary)
            wait.until(ExpectedConditions.presenceOfElementLocated(
                    MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.EditText\")")
            ));

            // Optionally, if we need to type '1' directly, we can do so (use sendKeys for a direct keyboard entry)
            firstDigitElement.sendKeys("1");

            System.out.println("Entered digit '1' using the custom or system keyboard.");

            // Optional: If we are using a custom keypad (like the one with buttons), you can handle this.
            // Locate and click the keypad button for '1' if keyboard wasn't triggered
            try {
                WebElement keypadButton = driver.findElement(
                        MobileBy.AndroidUIAutomator("new UiSelector().text(\"1\")")
                );
                keypadButton.click();
                System.out.println("Entered digit '1' using the custom keypad.");
            } catch (NoSuchElementException e) {
                System.out.println("Custom keypad not found, used system keyboard instead.");
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            throw new Exception("Failed to interact with the custom keypad or input field.", e);
        }
    }


    public void setDefaultKeyboard() throws InterruptedException {
        try {
            // Check the current input method (keyboard)
            String currentIme = getCurrentIme();
            if (!currentIme.equals("com.samsung.android.inputmethod/.LatinIME")) {
                System.out.println("Changing the default keyboard to Samsung...");
                // Set Samsung keyboard as the default IME
                Runtime.getRuntime().exec("adb shell ime set com.samsung.android.inputmethod/.LatinIME");

                // Allow some time for the setting to take effect
                Thread.sleep(2000);  // Adjust the sleep duration if needed
                System.out.println("Samsung keyboard set as default.");
            } else {
                System.out.println("Samsung keyboard is already the default.");
            }
        } catch (IOException e) {
            System.err.println("Error setting default keyboard: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public String getCurrentIme() throws IOException {
        // Get the current default input method (keyboard)
        Process process = Runtime.getRuntime().exec("adb shell settings get secure default_input_method");
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        return reader.readLine().trim();
    }







}
