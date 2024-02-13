package pageObjectModel;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginPageTestCase extends Base{
	@Test
	public void testCase() {
		WelcomePage w = new WelcomePage(driver);
		w.getLoginLink().click();;
		Reporter.log("Login Link Clicked",true);
		
		LoginPage l = new LoginPage(driver);
		l.loginFunction();  //Using business logic
		/*
		 * l.getEmailID().sendKeys("ruhi0987@gmail.com");
		 * l.getPassword().sendKeys("Ruhi@123"); l.getLoginButton().click();
		 */  //Using direct 
		Reporter.log("Successfully Logged in to DWS",true);
		
		w.getLogoutButton().click();
		Reporter.log("Successfully Logged out from DWS",true);
	}

}
