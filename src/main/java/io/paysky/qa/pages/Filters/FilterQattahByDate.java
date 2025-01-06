package io.paysky.qa.pages.Filters;

import io.appium.java_client.AppiumBy;
import io.paysky.qa.pages.AbstractClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.*;

public class FilterQattahByDate extends AbstractClass
{

    private final By FilterButton= AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Circle\"]\n");
    public void ClickOnFilterButton() throws Exception {
        waitForPresenceOf(FilterButton, 30);
        clickOnElement(FilterButton,20);
    }
    private final By CalenderButton=AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"android:id/content\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.widget.ImageView\n");
    public void OpenCalender() throws Exception{
        waitForPresenceOf(CalenderButton, 40);
        clickOnElement(CalenderButton,20);
    }
    private final By ClickOnOkCalender=AppiumBy.xpath("//android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.Button");
    public void ClickOnoKButton() throws Exception {
        waitForPresenceOf(ClickOnOkCalender, 30);
        clickOnElement(ClickOnOkCalender,20);
    }
    public void GetAllYears() throws Exception {
        // Locator to find the year elements
        By yearLocator = By.className("android.widget.TextView");

        Set<String> allYears = new HashSet<>(); // To store unique years and avoid duplicates

        while (true) {
            try {
                // Fetch fresh references to year elements
                List<WebElement> years = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(yearLocator));
                System.out.println("Fetched " + years.size() + " years after scrolling");

                // Add the text of each year to the set (prevents duplicates)
                for (WebElement year : years) {
                    String yearText = year.getText();
                    if (!yearText.equals("SAF") && !yearText.equals("1") && !yearText.equals("Monday")) {
                        allYears.add(yearText);
                        System.out.println("Year found: " + yearText);
                    }
                }

                // Log unique years found so far
                System.out.println("Total unique years so far: " + allYears.size());

                // Select and click a year if available
                if (!years.isEmpty()) {
                    Random rand = new Random();
                    String selectedYearText = years.get(rand.nextInt(years.size())).getText();
                    System.out.println("Randomly selected year: " + selectedYearText);

                    // Re-fetch elements and find the matching year again to avoid stale references
                    List<WebElement> refreshedYears = driver.findElements(yearLocator);
                    WebElement selectedYearElement = refreshedYears.stream()
                            .filter(e -> e.getText().equals(selectedYearText))
                            .findFirst()
                            .orElseThrow(() -> new Exception("Selected year not found after refresh"));

                    wait.until(ExpectedConditions.elementToBeClickable(selectedYearElement)).click();
                    System.out.println("Clicked on the year: " + selectedYearText);

                    // Call function to handle days for this year
                    clickOnRandomDayAfterYear();
                    break; // Exit after successfully selecting a year and day
                }
            } catch (org.openqa.selenium.StaleElementReferenceException e) {
                System.out.println("StaleElementReferenceException: Re-fetching elements...");
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
            }

            // Scroll to load more years
            scrollDown(2);
            Thread.sleep(1000); // Allow time for new elements to load
        }

        // Print all unique years found
        System.out.println("Total unique years: " + allYears.size());
        for (String year : allYears) {
            System.out.println("Year: " + year);
        }
    }
    // Function to click a random day after selecting a year
    public void clickOnRandomDayAfterYear() throws InterruptedException {
        By dayLocator = By.className("android.widget.TextView");

        try {
            // Wait for the day elements to become visible
            List<WebElement> days = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(dayLocator));
            System.out.println("Total days found: " + days.size());

            if (!days.isEmpty()) {
                Random rand = new Random();
                String selectedDayText = days.get(rand.nextInt(days.size())).getText();
                System.out.println("Randomly selected day: " + selectedDayText);

                // Re-fetch the list to ensure elements are fresh
                List<WebElement> refreshedDays = driver.findElements(dayLocator);
                WebElement selectedDayElement = refreshedDays.stream()
                        .filter(e -> e.getText().equals(selectedDayText))
                        .findFirst()
                        .orElseThrow(() -> new Exception("Selected day not found after refresh"));

                wait.until(ExpectedConditions.elementToBeClickable(selectedDayElement)).click();
                System.out.println("Clicked on the day: " + selectedDayText);
            } else {
                System.out.println("No days found to click.");
            }
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException: Retrying day selection...");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Optional delay to allow the UI to settle
        Thread.sleep(1000);
    }
}





