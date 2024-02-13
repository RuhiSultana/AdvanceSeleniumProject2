package pageObjectModel;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class WelcomePageTestCase extends Base{
	@Test
	public void testCase() {
		WelcomePage w = new WelcomePage(driver);
		w.getRegisterLink().click();;
		Reporter.log("Register Link Clicked",true);
		w.getLoginLink().click();;
		Reporter.log("Login Link Clicked",true);
		w.getShopCartLink().click();;
		Reporter.log("Shopping Cart Link Clicked",true);
		w.getWishlistLink().click();;
		Reporter.log("Wishlist Link Clicked",true);
		w.getSearchBar().sendKeys("Mobiles");
		Reporter.log("Search Bar",true);
		
	}
	

}
