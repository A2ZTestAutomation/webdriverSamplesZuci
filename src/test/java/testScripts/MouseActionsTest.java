package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActionsTest {
  @Test
  public void actionsTest() throws InterruptedException, IOException {
	  
	  WebDriver driver = new ChromeDriver();
	  Actions actions = new Actions(driver);
		driver.manage().window().maximize();
//		driver.get("https://automationbookstore.dev/");
//		WebElement srcBox =  driver.findElement(By.id("searchBar"));
//		actions.contextClick(srcBox).perform();
		
//driver.get("https://www.stqatools.com/demo/DoubleClick.php");
		
//		Thread.sleep(2000);
//		WebElement btn = driver.findElement(
//				By.xpath("//button[text() = 'Click Me / Double Click Me!']"));
//		
//		actions.doubleClick(btn).perform();
//			
//		actions.doubleClick(btn).doubleClick(btn).build().perform();
//		
		
		//Mousehover actions
		driver.get("https://www.stqatools.com/demo/MouseHover.php");
		TakesScreenshot screen = (TakesScreenshot)driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") 
				+ "/screenshots/" + System.currentTimeMillis() +".png";
		FileUtils.copyFile(src, new File(path));
		
		WebElement menu = driver.findElement(By.cssSelector("button.dropbtn"));
		
		File src1 = menu.getScreenshotAs(OutputType.FILE);
		String path1 = System.getProperty("user.dir") 
				+ "/screenshots/" + System.currentTimeMillis() +".png";
		FileUtils.copyFile(src1, new File(path1));
		
		actions.moveToElement(menu).perform();
		WebElement menuItem = driver.findElement(By.cssSelector("div.dropdown-content > a:nth-child(1)"));
//		actions.click(menuItem).perform();
		actions.moveToElement(menu).click(menuItem).build().perform();
		
 
  }
}
