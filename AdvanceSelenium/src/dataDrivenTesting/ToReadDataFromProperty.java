package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToReadDataFromProperty{
	public static ChromeDriver driver;
	@Test
public void testcase() throws IOException {
	FileInputStream fis = new FileInputStream("C:\\Users\\gblas\\eclipse-workspace\\AdvanceSelenium\\test data\\loginData.properties");
	Properties P = new Properties();
	P.load(fis);
	String url = P.getProperty("url");
	String userName = P.getProperty("userName");
	String password = P.getProperty("password");
	
	driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get(url);
	//driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.xpath("//div[@class='header-links']/child::ul/child::li[2]/child::a[@class='ico-login']")).click();
	driver.findElement(By.id("Email")).sendKeys(userName);
	driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	driver.findElement(By.xpath("//div[@class='header-links']/child::ul/child::li[2]/child::a[@class='ico-logout']")).click();
	
}
		
}
