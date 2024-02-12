package groupScripts;

import org.testng.annotations.Test;

public class SampleTwoTest {
	
	@Test(groups = "feature1")
	  public void testOne() {
		  System.out.println("Test1 in SampleTwo");
	  }
	  @Test(groups = "feature1")
	  public void testTwo() {
		  System.out.println("Test2 in SampleTwo");
	  }
	  @Test(groups = "feature2")
	  public void testThree() {
		  System.out.println("Test3 in SampleTwo");
	  }
	  @Test(groups = "feature3")
	  public void testFour() {
		  System.out.println("Test4 in SampleTwo");
	  }

}
