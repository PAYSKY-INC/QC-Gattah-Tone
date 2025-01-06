package io.paysky.qa.pages.PayQattah;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.paysky.qa.pages.AbstractClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class OTPPage extends AbstractClass {

        // Method to tap on the '1' key using coordinates
        public void tapOnKeyboardKey(int x, int y) {
            try {
                if (x >= 0 && y >= 0) {
                    TouchAction<?> action = new TouchAction<>(driver);
                    action.tap(PointOption.point(x, y)).perform();
                    System.out.println("Tapped on '1' key at coordinates: X=" + x + ", Y=" + y);
                } else {
                    System.err.println("Invalid coordinates! Please check the pointer location.");
                }
            } catch (Exception e) {
                System.err.println("Error tapping on key '1': " + e.getMessage());
            }
        }

        // Method to enter the first digit of the OTP
        public void EnterFirstDigit() throws Exception {
            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

                // Locate the OTP input field
                By otpFieldXPath = By.xpath("(//android.widget.FrameLayout[@resource-id='com.paysky.qattah:id/otpView'])[2]/android.widget.TextView");
                WebElement firstDigitElement = wait.until(ExpectedConditions.presenceOfElementLocated(otpFieldXPath));

                // Wait for 30 seconds before clicking the input field
                System.out.println("Waiting for 30 seconds before clicking...");
                Thread.sleep(30);

                // Click to activate the OTP input field
                firstDigitElement.click();
                System.out.println("Clicked on OTP field to activate it.");

                // Wait for another 30 seconds after clicking
                System.out.println("Waiting for 30 seconds after clicking...");
                Thread.sleep(30);

                // Option 1: Type digit '1' using mobile automation input script
                ((JavascriptExecutor) driver).executeScript("mobile: type", ImmutableMap.of("text", "1"));
                System.out.println("Successfully entered digit '1' using native input.");

                // Option 2: Tap on '1' key directly (if it’s part of the on-screen keyboard)
                // Example coordinates, replace with actual values you captured (e.g., from Appium Inspector)
                int x = 203; // Replace with actual X coordinate of the '1' key
                int y = 944; // Replace with actual Y coordinate of the '1' key
                tapOnKeyboardKey(x, y);

            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
                throw new Exception("Failed to enter the digit '1'.", e);
            }
        }
    public void EnterSecondDigit() throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

            // Locate the OTP input field
            By otpField2 = By.xpath("(//android.widget.FrameLayout[@resource-id=\"com.paysky.qattah:id/otpView\"])[3]/android.widget.TextView\n");
            WebElement firstDigitElement = wait.until(ExpectedConditions.presenceOfElementLocated(otpField2));

            // Wait for 30 seconds before clicking the input field
            System.out.println("Waiting for 30 seconds before clicking...");
            Thread.sleep(30);

            // Click to activate the OTP input field
            firstDigitElement.click();
            System.out.println("Clicked on OTP field to activate it.");

            // Wait for another 30 seconds after clicking
            System.out.println("Waiting for 30 seconds after clicking...");
            Thread.sleep(30);

            // Option 1: Type digit '1' using mobile automation input script
            ((JavascriptExecutor) driver).executeScript("mobile: type", ImmutableMap.of("text", "2"));
            System.out.println("Successfully entered digit '2' using native input.");

            // Option 2: Tap on '1' key directly (if it’s part of the on-screen keyboard)
            // Example coordinates, replace with actual values you captured (e.g., from Appium Inspector)
            int x = 314; // Replace with actual X coordinate of the '1' key
            int y = 980; // Replace with actual Y coordinate of the '1' key
            tapOnKeyboardKey(x, y);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            throw new Exception("Failed to enter the digit '2'.", e);
        }
    }
    public void EnterThirdDigit() throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

            // Locate the OTP input field
            By otpField3 = By.xpath("(//android.widget.FrameLayout[@resource-id=\"com.paysky.qattah:id/otpView\"])[4]/android.widget.TextView\n");
            WebElement firstDigitElement = wait.until(ExpectedConditions.presenceOfElementLocated(otpField3));

            // Wait for 30 seconds before clicking the input field
            System.out.println("Waiting for 30 seconds before clicking...");
            Thread.sleep(30);

            // Click to activate the OTP input field
            firstDigitElement.click();
            System.out.println("Clicked on OTP field to activate it.");

            // Wait for another 30 seconds after clicking
            System.out.println("Waiting for 30 seconds after clicking...");
            Thread.sleep(30);

            // Option 1: Type digit '1' using mobile automation input script
            ((JavascriptExecutor) driver).executeScript("mobile: type", ImmutableMap.of("text", "3"));
            System.out.println("Successfully entered digit '3' using native input.");

            // Option 2: Tap on '1' key directly (if it’s part of the on-screen keyboard)
            // Example coordinates, replace with actual values you captured (e.g., from Appium Inspector)
            int x = 409; // Replace with actual X coordinate of the '1' key
            int y = 894; // Replace with actual Y coordinate of the '1' key
            tapOnKeyboardKey(x, y);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            throw new Exception("Failed to enter the digit '2'.", e);
        }
    }
    public void EnterlastDigit() throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

            // Locate the OTP input field
            By otpField4 = By.xpath("(//android.widget.FrameLayout[@resource-id=\"com.paysky.qattah:id/otpView\"])[5]/android.widget.TextView\n");
            WebElement firstDigitElement = wait.until(ExpectedConditions.presenceOfElementLocated(otpField4));

            // Wait for 30 seconds before clicking the input field
            System.out.println("Waiting for 30 seconds before clicking...");
            Thread.sleep(30);

            // Click to activate the OTP input field
            firstDigitElement.click();
            System.out.println("Clicked on OTP field to activate it.");

            // Wait for another 30 seconds after clicking
            System.out.println("Waiting for 30 seconds after clicking...");
            Thread.sleep(30);

            // Option 1: Type digit '1' using mobile automation input script
            ((JavascriptExecutor) driver).executeScript("mobile: type", ImmutableMap.of("text", "4"));
            System.out.println("Successfully entered digit '4' using native input.");

            // Option 2: Tap on '1' key directly (if it’s part of the on-screen keyboard)
            // Example coordinates, replace with actual values you captured (e.g., from Appium Inspector)
            int x = 502; // Replace with actual X coordinate of the '1' key
            int y = 906; // Replace with actual Y coordinate of the '1' key
            tapOnKeyboardKey(x, y);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            throw new Exception("Failed to enter the digit '4'.", e);
        }
    }

    }


