package dataDrivenTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

@Test
public class ExcellTest {
	public void fetch() throws EncryptedDocumentException, IOException {
		String passedData1 = ToReadExcellUtility.excelData("Sheet3", 0,0);
		Reporter.log(passedData1,true);
		String passedData2 = ToReadExcellUtility.excelData("Sheet3", 1,0);
		Reporter.log(passedData2,true);
		
	}

}
