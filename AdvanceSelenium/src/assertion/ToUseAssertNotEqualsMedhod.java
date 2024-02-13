package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUseAssertNotEqualsMedhod {
	
	@Test
	public void register() {
		
		String expectedResult; 
	    ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		expectedResult= driver.findElement(By.xpath("//div[@class='header-links']/child::ul/child::li/child::a[@class='ico-register']")).getText();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Advanced");
		driver.findElement(By.id("LastName")).sendKeys("Selenium");
		driver.findElement(By.id("Email")).sendKeys("advancetest.1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("selinium@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("selinium@123");
		driver.findElement(By.id("register-button")).click();
		
		//String actualresult = driver.findElement(By.linkText("Register")).getText();
		String actualresult = driver.findElement(By.xpath("//div[@class='header-links']/child::ul/child::li/child::a[@class='account']")).getText();
		
		Assert.assertNotEquals(expectedResult,actualresult);
		Reporter.log("TC Passed",true);
	}
	

}
