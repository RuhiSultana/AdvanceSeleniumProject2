package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToFetchDataFromExcellForRegister extends BaseClass{
	

	@Test
	public void register() throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\gblas\\OneDrive\\Desktop\\testDataOfSelenium.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		Sheet S = w.getSheet("Sheet3");
		
		String fName = S.getRow(0).getCell(0).toString();
		String lName = S.getRow(1).getCell(0).toString();
		String email = S.getRow(2).getCell(0).toString();
		String password = S.getRow(3).getCell(0).toString();
		String cPassword = S.getRow(4).getCell(0).toString();
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys(fName);
		driver.findElement(By.id("LastName")).sendKeys(lName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cPassword);
		driver.findElement(By.id("register-button")).click();
					
	}
}
