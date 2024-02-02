package BigBasketPOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PetShop extends BasePage{
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[5]/div[2]/section[2]/section/ul/li[20]/div/div/div[5]/div/div[2]/button")
	WebElement goToItem;
	
	@FindBy(xpath = "//*[@id=\"siteLayout\"]/header[1]/div[2]/div[1]/a/svg/g/g/path[2]")
	WebElement backToHome;
	
	
	public void goToItem() {
		goToItem.click();
	}
	
	public void backToHome() {
		backToHome.click();
	}
	
	public void scroll() throws InterruptedException 
	{
		for (int i = 0; i < 10; i++) { 
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,130)");
			Thread.sleep(200);
			
		}
}}
