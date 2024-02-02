package BigBasketPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageTopBanner extends BasePage{
	@FindBy(xpath ="//*[@id=\"siteLayout\"]/div/div[1]/div[1]/div[2]/div/div[1]/h4[1]" )
	WebElement dailyStaples;
	
	@FindBy(xpath = "//*[@id=\"siteLayout\"]/div/div[1]/div[1]/div[2]/div/div[3]/h4[1]")
	WebElement teaOffers;
	
	@FindBy(xpath = "//*[@id=\"siteLayout\"]/div/div[1]/div[1]/div[2]/div/div[5]/h4[1]")
	WebElement hairCare;
	
	@FindBy(xpath = "//*[@id=\"siteLayout\"]/div/div[1]/div[1]/div[1]/div/div[6]/div/a/span/img")
	WebElement hairCareClick;
	
	public void clickDaily() {
		dailyStaples.click();
	}
	
	public void clickTea() {
		teaOffers.click();
	}
	
	public void clickHair() {
		hairCare.click();
	}
	
	public void openHair() {
		hairCareClick.click();
	}
}
