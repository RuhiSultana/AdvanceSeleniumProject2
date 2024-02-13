package crossBrowserTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import configurationAnnotation.BaseClass;

public class TestCase extends BaseClass{
	
		@Test
		public void testcase1() {
			
		 driver.findElement(By.linkText("Log in")).click();
				  
		 Reporter.log("Login Link Clicked successfully", true);
				 
		}

}
