package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class ToReadExcellUtility {
	public static String excelData(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\gblas\\OneDrive\\Desktop\\testDataOfSelenium.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		 Sheet S = w.getSheet(sheet); 
		 String storedData = S.getRow(row).getCell(cell).toString();
		 //Reporter.log(data, true);
		 return storedData;
		
		}

}
