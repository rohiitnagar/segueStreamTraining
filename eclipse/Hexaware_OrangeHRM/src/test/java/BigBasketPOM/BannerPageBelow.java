package BigBasketPOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BannerPageBelow extends BasePage{
	@FindBy(xpath = "//img[@alt='uploads/banner_images/hp_m_petstore_250923_400.jpg']")
	WebElement banner1;
	
	@FindBy(xpath = "//*[@id='siteLayout']/div/div[13]/div/div[2]/div/div[2]")
	WebElement scrollBanner;
	
	public void clickBanner() {
		banner1.click();
	}
	
	public WebElement scrollBanner() {
		return scrollBanner;
	}
	
	public void scroll() throws InterruptedException 
	{
		for (int i = 0; i < 10; i++) { 
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,130)");
			Thread.sleep(200);
			
		}

	
}}
	

