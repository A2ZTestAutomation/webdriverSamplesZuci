package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.GooglePage;

public class GoogleSearchScenarios {
	WebDriver driver;
	GooglePage gPage;
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
	}
	@Test(priority=1)
	public void searchJavaTest() throws InterruptedException {
		
		
//		WebElement srcBox = driver.findElement(By.id("APjFqb"));
//		srcBox.sendKeys("Java Tutorial");
//		srcBox.submit();
		GooglePage gPage = new GooglePage();
		gPage.searchTxt("Java Tutorial");
		Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
	}
	@Test(priority=1)
	public void searchSeleniumTest() throws InterruptedException {
		
		GooglePage gPage = new GooglePage();
		gPage.searchTxt("Java Tutorial");
		Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
	}
	
	@Test
	public void searchAppiumTest() throws InterruptedException {
		
		GooglePage gPage = new GooglePage();
		gPage.searchTxt("Java Tutorial");
		Assert.assertEquals(driver.getTitle(), "Appium Tutorial - Google Search");
	}
	@Test(enabled=false)
	public void searchCucumberTest() throws InterruptedException {
		
		GooglePage gPage = new GooglePage();
		gPage.searchTxt("Java Tutorial");
		Assert.assertEquals(driver.getTitle(), "Cucumber Tutorial - Google Search");
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
