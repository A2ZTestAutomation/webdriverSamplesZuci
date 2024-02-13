package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest {
  @Test
  public void searchEmpDetails() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		List<WebElement> items =  driver.findElements(
				By.xpath("//td[text()='B. Wagner']//following-sibling::td"));
		System.out.println("Number of items..."+items.size());
		for(int i = 0 ; i < items.size(); i++) {
			System.out.println(items.get(i).getText());
		}
	
		
		//To get the salary of an employee
		String strSalary = driver.findElement(By.xpath("\n"
				+ "//td[contains(text(), 'Wagner')]//following-sibling::td[5]")).getText();
		
		System.out.println(strSalary);
		
		String strLocation = driver.findElement(By.xpath("\n"
				+ "//td[contains(text(), 'Wagner')]//following-sibling::td[2]")).getText();
		
		System.out.println("Location....." + strLocation);
  }
}
