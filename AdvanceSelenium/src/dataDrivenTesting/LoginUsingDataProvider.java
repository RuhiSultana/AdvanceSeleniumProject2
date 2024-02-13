package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginUsingDataProvider extends BaseClass{
	
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
	public Object[][] fetchData() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("C:\\Users\\gblas\\eclipse-workspace\\AdvanceSelenium\\test data\\testDataOfSelenium.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		 Sheet S = w.getSheet("Sheet6"); 
		 int rowSize = S.getPhysicalNumberOfRows();
		 int cellSize = S.getRow(0).getPhysicalNumberOfCells();
		 
		 
		 Object[][] data = new Object[rowSize][cellSize];
		 for( int i=0; i<rowSize; i++) {
			 for (int j=0; j<cellSize; j++) {
				 data[i][j] = S.getRow(i).getCell(j).toString();
			 }
			 
		 }
		return data;	 
		
	}

}
