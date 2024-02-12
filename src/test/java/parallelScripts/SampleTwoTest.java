package parallelScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTwoTest {
WebDriver driver;
	
	@Test
	  public void testOne() {
		 driver = new ChromeDriver();
		 long id = Thread.currentThread().getId();
		  System.out.println("Test12 in SampleTwo..." + id);
	  }
	  @Test
	  public void testTwo() {
		  driver = new ChromeDriver();
		  long id = Thread.currentThread().getId();
		  System.out.println("TestTwo in SampleTwo..." + id);
	  }
	  @Test
	  public void testThree() {
		  driver = new ChromeDriver();
		  long id = Thread.currentThread().getId();
		  System.out.println("Test3 in SampleTwo..."+id);
	  }
	  @Test
	  public void testFour() {
		  driver = new ChromeDriver();
		  long id = Thread.currentThread().getId();
		  System.out.println("Test22 in SampleTwo..."+id);
	  }


}
