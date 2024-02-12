package parallelScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class SampleOneTest {
	WebDriver driver;
	
//	@Test
	  public void testOne() throws InterruptedException {
		 driver = new ChromeDriver();
		 long id = Thread.currentThread().getId();
		  System.out.println("Test12 in SampleOne..." + id);
		  Thread.sleep(2000);
		  driver.close();
	  }
//	  @Test
	  public void testTwo() throws InterruptedException {
		  driver = new ChromeDriver();
		  long id = Thread.currentThread().getId();
		  System.out.println("TestTwo in SampleOne..." + id);
		  Thread.sleep(2000);
		  driver.close();
	  }
//	  @Test
	  public void testThree() throws InterruptedException {
		  driver = new ChromeDriver();
		  long id = Thread.currentThread().getId();
		  System.out.println("Test3 in SampleOne..."+id);
		  Thread.sleep(2000);
		  driver.close();
	  }
//	  @Test(invocationCount = 7, threadPoolSize = 3, timeOut = 10000)
	  
	  public void testFour() throws InterruptedException {
		  driver = new ChromeDriver();
		  long id = Thread.currentThread().getId();
		  System.out.println("Test22 in SampleOne..."+id);
		  Thread.sleep(2000);
		  driver.close();
	  }


}
