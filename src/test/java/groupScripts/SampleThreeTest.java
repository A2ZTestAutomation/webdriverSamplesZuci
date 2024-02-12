package groupScripts;

import org.testng.annotations.Test;

public class SampleThreeTest {
	@Test
	  public void testOne() {
		  System.out.println("Testone in SampleThree");
	  }
	  @Test
	  public void testTwo() {
		  System.out.println("TestTwo in SampleThree");
	  }
	  @Test(groups = "feature2")
	  public void testThree() {
		  System.out.println("TestThree in SampleThree");
	  }
	  @Test
	  public void testFour() {
		  System.out.println("TestFour in SampleThree");
	  }

}
