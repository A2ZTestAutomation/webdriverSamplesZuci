package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SamplePageTest {
  @Test
  public void f() {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://demoqa.com/automation-practice-form");
	  
	  driver.findElement(By.id("dateOfBirthInput")).click();
	  
  }
}
