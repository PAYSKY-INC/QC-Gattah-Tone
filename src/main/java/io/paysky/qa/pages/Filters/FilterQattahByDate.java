package io.paysky.qa.pages.Filters;

import io.appium.java_client.AppiumBy;
import io.paysky.qa.pages.CreateQattah.AbstractClass;
import io.paysky.qa.pages.PayQattah.ClickOnSelectReasons;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
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
        By yearLocator = By.className("android.widget.TextView");
        Set<String> allYears = new HashSet<>(); // To store unique years
        int maxScrollAttempts = 10; // Limit scroll attempts
        int scrollAttempts = 0;

        while (scrollAttempts < maxScrollAttempts) {
            try {
                // Scroll first before looking for the years
              ClickOnSelectReasons.swipeWithinPopup();
                Thread.sleep(30); // Add some wait to ensure elements load after scroll

                // Fetch fresh references to year elements
                List<WebElement> years = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(yearLocator));
                System.out.println("Fetched " + years.size() + " years after scrolling");

                // Add unique years to the set
                for (WebElement year : years) {
                    String yearText = year.getText();
                    if (yearText.matches("\\d{4}")) { // Ensure it's a valid year
                        allYears.add(yearText);
                        System.out.println("Year found: " + yearText);
                    }
                }

                if (!allYears.isEmpty()) {
                    // Randomly select a year from the set
                    List<String> yearList = new ArrayList<>(allYears);
                    Random rand = new Random();
                    String selectedYear = yearList.get(rand.nextInt(yearList.size()));
                    System.out.println("Randomly selected year: " + selectedYear);

                    // Re-fetch elements and find the matching year again to avoid stale references
                    List<WebElement> refreshedYears = driver.findElements(yearLocator);
                    WebElement selectedYearElement = refreshedYears.stream()
                            .filter(e -> e.getText().equals(selectedYear))
                            .findFirst()
                            .orElseThrow(() -> new Exception("Selected year not found after refresh"));
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

                    // Ensure the year element is clickable
                    wait.until(ExpectedConditions.elementToBeClickable(selectedYearElement)).click();
                    // Handle days for the selected year
                    clickOnRandomDayAfterYear();
                    return; // Exit after successfully selecting a year and day
                }
            } catch (Exception e) {
                System.out.println("Exception during year selection: " + e.getMessage());
            }
        }
    }

    public void clickOnRandomDayAfterYear() throws InterruptedException {
        By dayLocator = By.className("android.widget.TextView");

        try {
            // Perform the scroll action first to bring more days into view
           ClickOnSelectReasons.swipeWithinPopup();
            Thread.sleep(20);  // Wait for the UI to settle after scrolling

            // Fetch fresh references to day elements after scrolling
            List<WebElement> days = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(dayLocator));
            System.out.println("Total days found: " + days.size());

            if (!days.isEmpty()) {
                Random rand = new Random();
                WebElement selectedDay = days.get(rand.nextInt(days.size()));  // Randomly select a day
                String dayText = selectedDay.getText();

                System.out.println("Randomly selected day: " + dayText);

                // Ensure the day element is clickable
                wait.until(ExpectedConditions.elementToBeClickable(selectedDay)).click();
                System.out.println("Clicked on the day: " + dayText);
            } else {
                System.out.println("No days found to click.");
            }
        } catch (Exception e) {
            System.out.println("Exception during day selection: " + e.getMessage());
        }
    }

}





