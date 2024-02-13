package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckCartPage extends BasePage{

	public CheckCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "termsofservice")
	 private WebElement termsAndCondition;
	
	@FindBy(id = "checkout")
	 private WebElement checkout;

	public WebElement getTermsAndCondition() {
		return termsAndCondition;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	

}
