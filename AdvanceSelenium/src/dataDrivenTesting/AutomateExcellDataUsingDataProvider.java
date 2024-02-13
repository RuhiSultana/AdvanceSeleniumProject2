package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AutomateExcellDataUsingDataProvider {
	@Test(dataProvider = "credential" )
	public void testcase(String S1, String S2) throws EncryptedDocumentException, IOException {
		Reporter.log(S1,true);
		Reporter.log(S2,true);
	}
	@DataProvider(name = "credential")
	public Object[][] fetchData() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("C:\\Users\\gblas\\OneDrive\\Desktop\\testDataOfSelenium.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		 Sheet S = w.getSheet("Sheet2"); 
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
