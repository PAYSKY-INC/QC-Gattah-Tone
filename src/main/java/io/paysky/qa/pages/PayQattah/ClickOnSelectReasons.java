package io.paysky.qa.pages.PayQattah;

import io.appium.java_client.AppiumBy;
import io.paysky.qa.pages.CreateQattah.AbstractClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ClickOnSelectReasons extends AbstractClass {
    private final By SelectFirstReasons = AppiumBy.xpath("//android.widget.TextView[@text=\"-- Select reason --\"]\n");
    public void OpenReasonsFirstDropdownList() throws Exception {
        clickOnElement(SelectFirstReasons, 10);
    }


    public void selectFirstRandomReasonByClass() {
        // Perform the swipe action to bring items into view
        swipeWithinPopup();

        // Locate all elements with the class "android.view.View"
        List<WebElement> reasons = driver.findElements(By.className("android.view.View"));

        // Ensure there are more than one reason
        if (reasons.size() > 1) {
            Random random = new Random();
            // Select a random index from the sublist
            int randomIndex = random.nextInt(reasons.size()); // Random index from 0 to size-2

            // Select the random reason from the validReasons sublist
            WebElement randomReason = reasons.get(randomIndex);

            new WebDriverWait(driver, Duration.ofSeconds(100))
                    .until(ExpectedConditions.elementToBeClickable(randomReason))
                    .click();
        }
    }


    public static void swipeWithinPopup() {
        // Get screen dimensions
        Dimension screenSize = driver.manage().window().getSize();
        int screenWidth = screenSize.getWidth();
        int screenHeight = screenSize.getHeight();

        // Define swipe start and end points based on screen dimensions
        int startX = screenWidth / 2; // Center of the screen horizontally
        int startY = (int) (screenHeight * 0.7); // Start the swipe 70% down the screen
        int endY = (int) (screenHeight * 0.2); // End the swipe 20% down the screen

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
    }
    final By NextButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]\n");

    public void OpenReasonsSecondDropdownList() throws Exception {
        // Locate the NextButton
         By SelectSecondReasons2 = AppiumBy.xpath("//android.widget.TextView[@text=\"-- Select reason --\"]");
        WebElement nextButton = driver.findElement(NextButton);

        // Wait until the NextButton is visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(nextButton));
        // Check if the NextButton is enabled (active)
        boolean next= nextButton.isEnabled();
        if (next != true) {
            return; // Exit the method as the button is enabled
        }
        else{
            // Wait for the dropdown element to be visible and clickable
            WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(SelectSecondReasons2));

            // Click the dropdown to open the list
            dropdown.click();
        }

    }



    public void selectSecondRandomReasonByClass() {
        WebElement nextButton = driver.findElement(NextButton);

      if (nextButton.isEnabled()) {
            // Exit the method if the "Next" button is enabled
            return;
        }
        // Perform a single swipe to bring items into view
        swipeWithinPopup();

        // Locate all elements with the class "android.view.View"
        List<WebElement> reasons = new WebDriverWait(driver, Duration.ofSeconds(110))
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("android.view.View")));

        // Check if reasons are available
        if (!reasons.isEmpty()) {
            // Select a random element from the list
            Random random = new Random();
            int randomIndex = random.nextInt(reasons.size());
            WebElement randomReason = reasons.get(randomIndex);

            // Wait until the element is clickable and then click
            new WebDriverWait(driver, Duration.ofSeconds(110))
                    .until(ExpectedConditions.elementToBeClickable(randomReason))
                    .click();

        }
    }

    public void ClickOnNextButton() throws Exception {
        clickOnElement(NextButton, 20);
    }

}