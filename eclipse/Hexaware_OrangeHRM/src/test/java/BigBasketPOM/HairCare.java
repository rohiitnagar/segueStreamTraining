package BigBasketPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HairCare extends BasePage{
	@FindBy(xpath = "//*[@id=\"siteLayout\"]/div[5]/div[2]/section[2]/section/ul/li[5]/div/div/div[5]/div/div[2]/button")
	WebElement addShampoo;
	
	@FindBy(xpath = "//*[@id=\"siteLayout\"]/div[2]/div[1]/a/span")
	WebElement goToHome;
	
	
	public void addShampoo() {
		addShampoo.click();
	}
	
	public void clickHome() {
		goToHome.click();
	}
	
}
