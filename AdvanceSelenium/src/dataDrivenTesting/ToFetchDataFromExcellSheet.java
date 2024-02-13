package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToFetchDataFromExcellSheet {
	@Test
	public void testExcell() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\gblas\\OneDrive\\Desktop\\testDataOfSelenium.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		Sheet S = w.getSheet("Sheet2");
		String data1 = S.getRow(0).getCell(0).toString();
		String data2 = S.getRow(0).getCell(1).toString();
		String data3 = S.getRow(1).getCell(0).toString();
		String data4 = S.getRow(1).getCell(1).toString();
		Reporter.log(data1, true);
		Reporter.log(data2, true);
		Reporter.log(data3, true);
		Reporter.log(data4, true);
		
	}

}
