package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends BasePage {
	@FindBy(xpath= "/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/div[3]/div[2]/input")
	WebElement addToCart;
	
	@FindBy(xpath= "//span[contains(text(),'Shopping cart')]")
	WebElement goToCart;
	
	public void clickAddTOCart() {
		addToCart.click();
	}
	
	public void clickGotoCart() {
		goToCart.click();
	}
}
