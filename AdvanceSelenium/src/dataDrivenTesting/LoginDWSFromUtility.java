package dataDrivenTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDWSFromUtility extends BaseClass{
	@Test(dataProvider = "credential")
	public void logIn(String Email, String Password) {		
		//driver.findElement(By.xpath("//div[@class='header-links']/child::ul/child::li[2]/child::a[@class='ico-login']")).click();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("//div[@class='header-links']/child::ul/child::li[2]/child::a[@class='ico-logout']")).click();
		
	}
	@DataProvider(name = "credential")
	public Object[][] data() throws EncryptedDocumentException, IOException{
		return ToReadExcellUtilityForLogin.data("Sheet6");
		
	}
	

}
