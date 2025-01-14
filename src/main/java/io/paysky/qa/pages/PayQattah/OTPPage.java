package io.paysky.qa.pages.PayQattah;
import com.google.common.collect.ImmutableMap;
import io.paysky.qa.pages.CreateQattah.AbstractClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class OTPPage extends AbstractClass {

        // Method to enter the first digit of the OTP
        public void EnterFirstDigit() throws Exception {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

                // Locate the OTP input field
                By otpFieldXPath = By.xpath("(//android.widget.FrameLayout[@resource-id='com.paysky.qattah:id/otpView'])[2]/android.widget.TextView");
                WebElement firstDigitElement = wait.until(ExpectedConditions.presenceOfElementLocated(otpFieldXPath));


                // Click to activate the OTP input field
                firstDigitElement.click();
                // Option 1: Type digit '1' using mobile automation input script
                ((JavascriptExecutor) driver).executeScript("mobile: type", ImmutableMap.of("text", "1"));

        }
    public void EnterSecondDigit() throws Exception {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

            // Locate the OTP input field
            By otpField2 = By.xpath("(//android.widget.FrameLayout[@resource-id=\"com.paysky.qattah:id/otpView\"])[3]/android.widget.TextView\n");
            WebElement firstDigitElement = wait.until(ExpectedConditions.presenceOfElementLocated(otpField2));

            // Click to activate the OTP input field
            firstDigitElement.click();
            // Option 1: Type digit '1' using mobile automation input script
            ((JavascriptExecutor) driver).executeScript("mobile: type", ImmutableMap.of("text", "2"));
    }
    public void EnterThirdDigit() throws Exception {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

            // Locate the OTP input field
            By otpField3 = By.xpath("(//android.widget.FrameLayout[@resource-id=\"com.paysky.qattah:id/otpView\"])[4]/android.widget.TextView\n");
            WebElement firstDigitElement = wait.until(ExpectedConditions.presenceOfElementLocated(otpField3));
            // Click to activate the OTP input field
            firstDigitElement.click();
            // Option 1: Type digit '1' using mobile automation input script
            ((JavascriptExecutor) driver).executeScript("mobile: type", ImmutableMap.of("text", "3"));

    }
    public void EnterlastDigit() throws Exception {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

            // Locate the OTP input field
            By otpField4 = By.xpath("(//android.widget.FrameLayout[@resource-id=\"com.paysky.qattah:id/otpView\"])[5]/android.widget.TextView\n");
            WebElement firstDigitElement = wait.until(ExpectedConditions.presenceOfElementLocated(otpField4));

            // Click to activate the OTP input field
            firstDigitElement.click();
            // Option 1: Type digit '1' using mobile automation input script
            ((JavascriptExecutor) driver).executeScript("mobile: type", ImmutableMap.of("text", "4"));

    }

    }


