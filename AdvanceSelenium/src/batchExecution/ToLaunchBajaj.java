package batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchBajaj {
	
	@Test //(groups = "smoke") //for group execution
	public void bajaj() {	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bajajauto.com/");
		Reporter.log("Bajaj Launched successfully", true);
		driver.quit();
	}
	
}
