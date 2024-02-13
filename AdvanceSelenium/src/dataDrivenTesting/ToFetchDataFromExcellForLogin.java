package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;



import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ToFetchDataFromExcellForLogin extends BaseClass{

	@Test
	public void logIn() throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("C:\\Users\\gblas\\OneDrive\\Desktop\\testDataOfSelenium.xlsx");
	Workbook w = WorkbookFactory.create(fis);
	Sheet S = w.getSheet("Sheet4");
	
	String email = S.getRow(0).getCell(0).toString();
	String password = S.getRow(1).getCell(0).toString();
	
	driver.findElement(By.xpath("//div[@class='header-links']/child::ul/child::li[2]/child::a[@class='ico-login']")).click();
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	}
}
