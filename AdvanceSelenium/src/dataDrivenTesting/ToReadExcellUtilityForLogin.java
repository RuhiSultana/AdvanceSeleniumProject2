package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadExcellUtilityForLogin {
	public static Object[][] data(String Sheet) throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("C:\\Users\\gblas\\OneDrive\\Desktop\\testDataOfSelenium.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		 Sheet S = w.getSheet("Sheet5"); 
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
