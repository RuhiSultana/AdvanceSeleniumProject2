package testNGListener;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase1 extends BaseClassListener {
	@Test
	public void login2() {
	
	driver.findElement(By.xpath("//div[@class='header-links']/child::ul/child::li[2]/child::a[@class='ico-login']")).click();
	driver.findElement(By.id("Email")).sendKeys("Selenium.gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Selenium@123");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	Reporter.log("Naviagted to Homepage Successfully", true);
	driver.findElement(By.linkText("//div[@class='header-links']/child::ul/child::li[2]/child::a[@class='ico-log out']")).click();
}
	
}
