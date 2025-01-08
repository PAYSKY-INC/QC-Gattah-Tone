package io.paysky.qa.pages.PayQattah;

import io.appium.java_client.AppiumBy;
import io.paysky.qa.pages.AbstractClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ClickOnSelectReasons extends AbstractClass {
    private final By SelectFirstReasons = AppiumBy.xpath("//android.widget.TextView[@text=\"-- Select reason --\"]\n");
    public void OpenReasonsFirstDropdownList() throws Exception {
        clickOnElement(SelectFirstReasons, 20);
    }

    public void selectFirstRandomReasonByClass() {
        try {
            // Maximum scroll attempts to find an element
            int maxScrollAttempts = 5;
            int scrollAttempts = 0;

            while (scrollAttempts < maxScrollAttempts) {
                // Perform the swipe action to bring items into view
                swipeWithinPopup();

                // Locate all elements with the class "android.view.View"
                List<WebElement> reasons = driver.findElements(By.className("android.view.View"));

                System.out.println("Attempting to find reasons...");

                if (!reasons.isEmpty()) {
                    System.out.println("Found " + reasons.size() + " reasons to select from.");

                    // Ensure there are more than one reason (exclude last reason)
                    if (reasons.size() > 1) {
                        Random random = new Random();

                        // Create a sublist excluding the last item from the original list
                        List<WebElement> validReasons = new ArrayList<>(reasons.subList(0, reasons.size() - 1));

                        // Select a random index from the sublist
                        int randomIndex = random.nextInt(validReasons.size()); // Random index from 0 to size-2

                        // Select the random reason from the validReasons sublist
                        WebElement randomReason = validReasons.get(randomIndex);

                        // Retrieve and log its attributes
                        String reasonText = randomReason.getAttribute("text");
                        System.out.println("Attempting to select reason with text: " +
                                (reasonText != null ? reasonText : "Unknown"));

                        try {
                            // Wait until the element is clickable
                            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
                            WebElement visibleElement = wait.until(ExpectedConditions.elementToBeClickable(randomReason));

                            if (visibleElement.isDisplayed() && visibleElement.isEnabled()) {
                                visibleElement.click();  // Click on the selected reason
                                System.out.println("Successfully selected the reason: " +
                                        (reasonText != null ? reasonText : "Unknown"));
                                return;  // Exit loop if successfully clicked
                            } else {
                                System.err.println("Element is not clickable or interactable.");
                            }
                        } catch (Exception e) {
                            System.err.println("Failed to interact with reason. Scrolling...");
                            e.printStackTrace();  // Print the stack trace for better debugging
                        }
                    } else {
                        System.out.println("No valid reasons to select (only the last reason).");
                    }
                } else {
                    System.out.println("No reasons found. Scrolling to retry...");
                }

                // Log the scroll attempt and wait
                System.out.println("Scroll attempt " + (scrollAttempts + 1) + " of " + maxScrollAttempts);
                Thread.sleep(1000);  // Adjust the sleep duration if needed

                scrollAttempts++;
            }

            System.err.println("Failed to select a reason after " + maxScrollAttempts + " attempts.");
        } catch (Exception e) {
            System.err.println("Error while selecting a reason: " + e.getMessage());
            e.printStackTrace();  // Print the stack trace for better debugging
        }
    }

    public static void swipeWithinPopup() {
        try {
            // Get screen dimensions
            Dimension screenSize = driver.manage().window().getSize();
            int screenWidth = screenSize.getWidth();
            int screenHeight = screenSize.getHeight();
            System.out.println("Screen dimensions: Width = " + screenWidth + ", Height = " + screenHeight);
//After get dimension of screen use it in scroll
            // Define swipe start and end points based on screen dimensions
            int startX = screenWidth / 2;  // Center of the screen horizontally
            int startY = (int)(screenHeight * 0.7);  // Start the swipe 70% down the screen (start of the scroll area)
            int endY = (int)(screenHeight * 0.2);    // End the swipe 20% down the screen (end of the scroll area)

            // Log the swipe coordinates to debug
            System.out.println("Swipe coordinates: StartX = " + startX + ", StartY = " + startY + ", EndY = " + endY);

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
            Thread.sleep(1000);  // Adjust the sleep duration if needed

            System.out.println("Successfully performed swipe within popup.");

        } catch (Exception e) {
            System.err.println("Error during swipe within popup: " + e.getMessage());
            e.printStackTrace();  // Print the stack trace for better debugging
        }
    }




    private final By SelectSecondReasons = AppiumBy.xpath("//android.widget.TextView[@text=\"-- Select reason --\"]\n");

    public void OpenReasonsSecondDropdownList() throws Exception {
        clickOnElement(SelectSecondReasons, 40);
    }
    public void selectSecondRandomReasonByClass() {
        try {
            // Maximum scroll attempts to find an element
            int maxScrollAttempts = 5;
            int scrollAttempts = 0;

            while (scrollAttempts < maxScrollAttempts) {
                // Perform the swipe action to bring items into view
                swipeWithinPopup();

                // Locate all elements with the class "android.view.View"
                List<WebElement> reasons = driver.findElements(By.className("android.view.View"));

                System.out.println("Attempting to find reasons...");

                if (!reasons.isEmpty()) {
                    System.out.println("Found " + reasons.size() + " reasons to select from.");

                    // Select a random element
                    Random random = new Random();
                    int randomIndex = random.nextInt(reasons.size());
                    WebElement randomReason = reasons.get(randomIndex);

                    // Retrieve and log its attributes
                    String reasonText = randomReason.getAttribute("text");
                    System.out.println("Attempting to select reason with text: " +
                            (reasonText != null ? reasonText : "Unknown"));

                    try {
                        // Wait until the element is clickable
                        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
                        WebElement visibleElement = wait.until(ExpectedConditions.elementToBeClickable(randomReason));

                        if (visibleElement.isDisplayed() && visibleElement.isEnabled()) {
                            visibleElement.click();  // Click on the selected reason
                            System.out.println("Successfully selected the reason: " +
                                    (reasonText != null ? reasonText : "Unknown"));
                            return;  // Exit loop if successfully clicked
                        } else {
                            System.err.println("Element is not clickable or interactable.");
                        }
                    } catch (Exception e) {
                        System.err.println("Failed to interact with reason. Scrolling...");
                        e.printStackTrace();  // Print the stack trace for better debugging
                    }
                } else {
                    System.out.println("No reasons found. Scrolling to retry...");
                }

                // Log the scroll attempt and wait
                System.out.println("Scroll attempt " + (scrollAttempts + 1) + " of " + maxScrollAttempts);
                Thread.sleep(1000);  // Adjust the sleep duration if needed

                scrollAttempts++;
            }

            System.err.println("Failed to select a reason after " + maxScrollAttempts + " attempts.");
        } catch (Exception e) {
            System.err.println("Error while selecting a reason: " + e.getMessage());
            e.printStackTrace();  // Print the stack trace for better debugging
        }
    }
    private final By NextButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]\n");

    public void ClickOnNextButton() throws Exception {

        clickOnElement(NextButton, 20);
    }
}