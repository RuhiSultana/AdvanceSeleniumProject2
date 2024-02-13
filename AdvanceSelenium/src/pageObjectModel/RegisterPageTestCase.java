package pageObjectModel;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegisterPageTestCase extends Base{
	@Test
	public void testCase() {
		WelcomePage w = new WelcomePage(driver);
		w.getRegisterLink().click();;
		Reporter.log("Register Link Clicked",true);
		
		RegisterPage r = new RegisterPage(driver);
		r.getGender().click();
		r.getFirstName().sendKeys("Ruhi");
		r.getLastName().sendKeys("Sultana");
		r.getEmailID().sendKeys("ruhi0987@gmail.com");
		r.getPassword().sendKeys("Ruhi@123");
		r.getConfirmPassword().sendKeys("Ruhi@123");
		r.getRegisterButton().click();
		Reporter.log("Successfully Registered",true);
		
		
	}

}
