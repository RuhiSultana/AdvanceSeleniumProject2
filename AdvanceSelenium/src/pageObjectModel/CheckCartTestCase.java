package pageObjectModel;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckCartTestCase extends Base{
	@Test
	public void checkCart() {
		WelcomePage w = new WelcomePage(driver);
		w.getShopCartLink().click();
		
		CheckCartPage c = new CheckCartPage(driver);
		c.getTermsAndCondition().click();
		c.getCheckout().click();
		Reporter.log("Added to Cart", true);
		
		}
		
}
