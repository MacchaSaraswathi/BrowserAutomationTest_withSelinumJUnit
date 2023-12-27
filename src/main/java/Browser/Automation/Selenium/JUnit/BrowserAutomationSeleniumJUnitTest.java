package Browser.Automation.Selenium.JUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserAutomationSeleniumJUnitTest {
	private WebDriver driver;

    @BeforeEach
    public void setUp() {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleSearch() {
        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium with JUnit");

        searchBox.submit();

        // Verify the search results page
        WebElement resultsStats = driver.findElement(By.id("result-stats"));
        System.out.println("Search results: " + resultsStats.getText());
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
