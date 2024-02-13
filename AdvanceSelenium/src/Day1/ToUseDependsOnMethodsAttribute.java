package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToUseDependsOnMethodsAttribute {
	
	public WebDriver driver;
	
	
	@Test
	public void register() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Advanced");
		driver.findElement(By.id("LastName")).sendKeys("Selenium");
		driver.findElement(By.id("Email")).sendKeys("ptest.1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("selinium@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("selinium@123");
		driver.findElement(By.id("register-button")).click();
	}
	
	@Test(dependsOnMethods = "register")
	public void logOut() {
		
//		driver= new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		
//		driver.get("https://demowebshop.tricentis.com/");
//		
		driver.findElement(By.linkText("Log out")).click();
	}
		
	
	@Test(dependsOnMethods = "logOut")
	public void logIn() {
		
//		driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		
//		driver.get("https://demowebshop.tricentis.com/");
//		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("ptest.1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("selinium@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();
	}
	
		
	
	

}
