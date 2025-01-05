package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ClickOnSelectReasons extends AbstractClass {
    private final By SelectFirstReasons = AppiumBy.xpath("//android.widget.TextView[@text=\"-- Select reason --\"]\n");

    public void OpenReasonsFirstDropdownList() throws Exception {
        clickOnElement(SelectFirstReasons, 20);
    }

    public void selectFirstRandomReasonByClass() {
        try {
            // Locate all elements with the class "android.view.View"
            List<WebElement> reasons = driver.findElements(By.className("android.view.View"));

            if (reasons.isEmpty()) {
                System.err.println("No reasons found to select from.");
                return;
            }

            // Generate a random index within the list size
            Random random = new Random();
            int randomIndex = random.nextInt(reasons.size());

            // Select a random element
            WebElement randomReason = reasons.get(randomIndex);

            // Retrieve and log an alternative attribute like "text" or "content-desc"
            String reasonText = randomReason.getAttribute("text");
            System.out.println("Selecting random reason with text: " + (reasonText != null ? reasonText : "Unknown"));

            // Click the selected element
            randomReason.click();

        } catch (Exception e) {
            System.err.println("Error while selecting a random reason: " + e.getMessage());
        }
    }
    private final By SelectSecondReasons = AppiumBy.xpath("//android.widget.TextView[@text=\"-- Select reason --\"]\n");

    public void OpenReasonsSecondDropdownList() throws Exception {
        clickOnElement(SelectSecondReasons, 20);
    }
    public void selectSecondRandomReasonByClass() {
        try {
            // Locate all elements with the class "android.view.View"
            List<WebElement> reasons = driver.findElements(By.className("android.view.View"));

            if (reasons.isEmpty()) {
                System.err.println("No reasons found to select from.");
                return;
            }

            // Generate a random index within the list size
            Random random = new Random();
            int randomIndex = random.nextInt(reasons.size());

            // Select a random element
            WebElement randomReason = reasons.get(randomIndex);

            // Retrieve and log an alternative attribute like "text" or "content-desc"
            String reasonText = randomReason.getAttribute("text");
            System.out.println("Selecting random reason with text: " + (reasonText != null ? reasonText : "Unknown"));
    System.out.println("wwerewr");
            // Click the selected element
            randomReason.click();

        } catch (Exception e) {
            System.err.println("Error while selecting a random reason: " + e.getMessage());
        }
    }
    private final By NextButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]\n");

    public void ClickOnNextButton() throws Exception {

        clickOnElement(NextButton, 20);
    }
}