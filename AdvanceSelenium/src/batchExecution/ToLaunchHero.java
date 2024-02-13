package batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchHero {
	@Test   //(groups = "smoke")//for group execution
	public void hero() {	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.heromotocorp.com/en-in.html");
		Reporter.log("Hero Launched successfully", true);
		driver.quit();
	}

}
