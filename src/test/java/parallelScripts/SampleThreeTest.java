package parallelScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleThreeTest {
WebDriver driver;
	
	@Test
	  public void testOne() {
		 driver = new ChromeDriver();
		 long id = Thread.currentThread().getId();
		  System.out.println("Test12 in SampleThree..." + id);
	  }
	  @Test
	  public void testTwo() {
		  driver = new ChromeDriver();
		  long id = Thread.currentThread().getId();
		  System.out.println("TestTwo in SampleThree..." + id);
	  }
	  @Test
	  public void testThree() {
		  driver = new ChromeDriver();
		  long id = Thread.currentThread().getId();
		  System.out.println("Test3 in SampleThree..."+id);
	  }
	  @Test
	  public void testFour() {
		  driver = new ChromeDriver();
		  long id = Thread.currentThread().getId();
		  System.out.println("Test22 in SampleThree..."+id);
	  }


}
