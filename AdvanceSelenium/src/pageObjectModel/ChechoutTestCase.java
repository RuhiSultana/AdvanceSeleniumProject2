package pageObjectModel;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ChechoutTestCase extends Base{
	@Test
	public void testCase() {
		WelcomePage w = new WelcomePage(driver);
		w.getRegisterLink().click();;
		Reporter.log("Register Link Clicked",true);
		
	}
}
