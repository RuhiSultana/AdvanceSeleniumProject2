package assertion;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToUseSoftAssert {

	@Test
	public void testCase() {
		
		String expectedUrl ="https://demowebshop.tricentis.com/";
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//driver.get("https://demowebshop.tricentis.com/");
		driver.get("https://demowebshop.tricentis.com/login");
		String actualUrl = driver.getCurrentUrl();
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(expectedUrl, actualUrl);
		s.assertAll();
		Reporter.log("Test Case Passed",true);
	}

}
