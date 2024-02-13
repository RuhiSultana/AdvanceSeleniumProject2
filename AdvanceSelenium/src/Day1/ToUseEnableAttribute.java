package Day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUseEnableAttribute {
	
	@Test(enabled = false)
	public void testcase1() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Demoshop is launched succsessfully",true);
		driver.quit();
	}
	@Test
	public void testcase2() { 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.instagram.com/");
		Reporter.log("Instagram is launched succsessfully",true);
		driver.quit();
	}

}
