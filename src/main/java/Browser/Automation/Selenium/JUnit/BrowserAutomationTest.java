package Browser.Automation.Selenium.JUnit;

import static org.testng.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAutomationTest {
	
	private WebDriver driver;
@Before
public void setUp() {
System.setProperty("webdriver.chrome.driver", "C:\\ZSelenium Jars and drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
driver = new ChromeDriver();
}
/*
@Test
public void testFacebookAuthentication() {
driver.get("https://www.facebook.com");
driver.findElement(By.id("email")).sendKeys("your_username");
driver.findElement(By.id("pass")).sendKeys("your_password");
driver.findElement(By.id("loginbutton")).click();
assertEquals("Facebook", driver.getTitle());
}
*/
@Test
public void testGoogleSearch() {
driver.get("https://www.google.com");
driver.findElement(By.name("q")).sendKeys("Selenium Automation");
driver.findElement(By.name("btnK")).submit();
assertEquals("Selenium Automation - Google Search", driver.getTitle());
}
@After
public void tearDown() {
driver.quit();
}

}
