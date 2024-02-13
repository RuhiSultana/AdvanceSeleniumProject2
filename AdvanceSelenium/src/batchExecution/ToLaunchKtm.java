package batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchKtm {
	@Test   //(groups = "integration")//for group execution
	public void ktm() {	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ktmindia.com/");
		Reporter.log("KTM Launched successfully", true);
		driver.quit();
	}
}
