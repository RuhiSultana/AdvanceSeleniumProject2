package pageObjectModel;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ShippingCartTestCase extends Base{
	@Test
	public void addtocart() {
		WelcomePage w = new WelcomePage(driver);
		w.getDigitaldownloadLink().click();
		
		DigitalDownloadPage d = new DigitalDownloadPage(driver);
		d.getBook1().click();
		Reporter.log("book1 added to Cart",true);
		
}

}
