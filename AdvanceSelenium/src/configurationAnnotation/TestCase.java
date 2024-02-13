package configurationAnnotation;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase extends BaseClass{
	
	@Test
	public void testcase1() {
			  
	 Reporter.log("Test Case1 executed successfully", true);
			 
	}
	@Test
	public void testcase2() {
			  
	 Reporter.log("Test Case2 executed successfully", true);
			 
	}
}

