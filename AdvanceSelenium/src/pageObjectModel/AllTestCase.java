package pageObjectModel;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AllTestCase extends Base{
	
	
	@Test(priority = 1)
	public void register() {
		WelcomePage w = new WelcomePage(driver);
		w.getRegisterLink().click();
		
		RegisterPage r = new RegisterPage(driver);
		r.getGender().click();
		r.getFirstName().sendKeys("Ruhi");
		r.getLastName().sendKeys("Sultana");
		r.getEmailID().sendKeys("ruhiAdv14@gmail.com");
		r.getPassword().sendKeys("Ruhi@123");
		r.getConfirmPassword().sendKeys("Ruhi@123");
		r.getRegisterButton().click();
		Reporter.log("Successfully Registered",true);
			
	}
	@Test(priority = 2, dependsOnMethods = "register")
	public void logOut() {
		
		WelcomePage w = new WelcomePage(driver);
		w.getLogoutButton().click();
		Reporter.log("Successfully Logged out from DWS",true);
	}
	@Test(priority = 3, dependsOnMethods = "logOut")
	public void logIn() {
		WelcomePage w = new WelcomePage(driver);
		w.getLoginLink().click();
		
		LoginPage l = new LoginPage(driver);
		l.getEmailID().sendKeys("ruhiAdv14@gmail.com");
		l.getPassword().sendKeys("Ruhi@123");
		l.getLoginButton().click();
		Reporter.log("Successfully Logged in to DWS",true);
	}
	@Test(priority = 4 , dependsOnMethods = "logIn")
	public void addtoCard() {
		WelcomePage w = new WelcomePage(driver);
		w.getDigitaldownloadLink().click();
		
		DigitalDownloadPage d = new DigitalDownloadPage(driver);
		d.getBook1().click();
		Reporter.log("book1 added to Cart",true);
		
}
	@Test(priority = 5, dependsOnMethods = "addtoCard")
	public void checkCart() {
		WelcomePage w = new WelcomePage(driver);
		w.getShopCartLink().click();
		
		CheckCartPage c = new CheckCartPage(driver);
		c.getTermsAndCondition().click();
		c.getCheckout().click();
		Reporter.log("Added to Cart", true);
		
		}
	@Test(priority = 6 ,dependsOnMethods = "checkCart") 
	public void checkOut() {
		CheckoutPage ch = new CheckoutPage(driver);
//		ch.getFirstName().sendKeys("Ruhi");
//		ch.getLastName().sendKeys("Sultana");
//		ch.getEmailID().sendKeys("ruhi@0987@gmail.com");
//		ch.getCompany().sendKeys("QSpiders");
		ch.getCountry().click();
		ch.getState().sendKeys("Karnataka");
		ch.getCity().sendKeys("Bangalore");
		ch.getAddress1().sendKeys("blr1");
		ch.getAddress2().sendKeys("blr2");
		ch.getPinCode().sendKeys("560093");
		ch.getPhoneNumber().sendKeys("1234567890");
		ch.getFaxNumber().sendKeys("abcdr123");
		ch.getContinuebutton().click();
		Reporter.log("Checked out successfully",true);
	}
		

}
