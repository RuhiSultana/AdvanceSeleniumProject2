package batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchHonda {
	@Test    //(groups = "integration")//for group execution
	public void honda() {	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.honda2wheelersindia.com/");
		Reporter.log("Honda Launched successfully", true);
		driver.quit();
	}

}
