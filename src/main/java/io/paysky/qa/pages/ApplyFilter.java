package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class ApplyFilter extends AbstractClass
{

    public void swipeWithinPopup() {

// Define coordinates based on updated popup bounds
        int startX = (96 + 1248) / 2; // Center of the popup's width = 672
        int startY = 2572 - 50; // Slightly above the bottom = 2522
        int endY = 1534 + 50; // Slightly below the top = 1584

        // Create a pointer input for touch actions
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        // Define the swipe action as a sequence
        Sequence swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), startX, endY));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        // Perform the swipe action
        driver.perform(Arrays.asList(swipe));

        // Add a small wait after the swipe to give time for the UI to settle
        try {
            Thread.sleep(1000); // Adjust the sleep duration as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Wait and swipe until the button is visible and clickable
    public void swipeUntilButtonIsVisible() {
        boolean isButtonVisible = false;
        int swipeAttempts = 0;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        while (!isButtonVisible && swipeAttempts < 5) { // Limit to 5 swipe attempts
            try {
                System.out.println("Attempting to locate the button...");

                // Wait for the button to be visible and clickable using className + text
                WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//android.widget.TextView[@class='android.widget.TextView' and @text='Apply']")
                ));

                // Wait until the element is clickable
                wait.until(ExpectedConditions.elementToBeClickable(button));

                // Additional check for visibility
                if (button.isDisplayed()) {
                    System.out.println("Button is visible and clickable, clicking it...");
                    button.click(); // Click the button if visible
                    isButtonVisible = true;
                    break;
                } else {
                    System.out.println("Button is not displayed, retrying...");
                }
            } catch (Exception e) {
                System.out.println("Button not found or not clickable, performing swipe...");

                // Print detailed exception message to debug
                e.printStackTrace();

                swipeWithinPopup(); // Perform swipe if the button is not visible
                swipeAttempts++; // Increase the swipe attempt counter

                // Wait for a short period before attempting again
                try {
                    Thread.sleep(1000); // Wait for 1 second before trying again
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        }

        if (!isButtonVisible) {
            System.out.println("Button not found after multiple swipes.");
        }
    }


}