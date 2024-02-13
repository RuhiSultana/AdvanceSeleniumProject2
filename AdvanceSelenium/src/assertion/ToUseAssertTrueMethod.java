package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUseAssertTrueMethod {
	@Test
	public void validation() {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	String expectedUrl ="https://demowebshop.tricentis.com/";
	
	driver.get("https://demowebshop.tricentis.com/");
	
	String actualUrl = driver.getCurrentUrl();
	
	Assert.assertEquals(expectedUrl, actualUrl);
	
	Reporter.log("Navigated to the desired WebPage",true);
	
	String beforelogin = driver.findElement(By.xpath("//div[@class='header-links']/child::ul/child::li/child::a[@class='ico-login']")).getText();
	
	boolean loginlink = driver.findElement(By.xpath("//div[@class='header-links']/child::ul/child::li/child::a[@class='ico-login']")).isDisplayed();
	Assert.assertTrue(loginlink);
	Reporter.log("login link is displayed",true);
	driver.findElement(By.xpath("//div[@class='header-links']/child::ul/child::li/child::a[@class='ico-login']")).click();
	
	boolean email = driver.findElement(By.id("Email")).isDisplayed();
	Assert.assertTrue(email);
	Reporter.log("Email text field is displayed",true);
	driver.findElement(By.id("Email")).sendKeys("advancetest.1234@gmail.com");
	
	boolean Password = driver.findElement(By.id("Password")).isDisplayed();
	Assert.assertTrue(Password);
	Reporter.log("Password text field is displayed",true);
	driver.findElement(By.id("Password")).sendKeys("selinium@123");
	
	boolean loginButton = driver.findElement(By.xpath("//input[@value='Log in']")).isDisplayed();
	Assert.assertTrue(loginButton);
	Reporter.log("login button is displayed",true);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	String afterlogin = driver.findElement(By.xpath("//div[@class='header-links']/child::ul/child::li/child::a[@class='ico-logout']")).getText();
	
	Assert.assertNotEquals(beforelogin, afterlogin);
	Reporter.log("TestCase Passed",true);
	
	
	}
}