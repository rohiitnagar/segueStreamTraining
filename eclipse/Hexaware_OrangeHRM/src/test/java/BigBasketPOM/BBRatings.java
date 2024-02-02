package BigBasketPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BBRatings extends BasePage {
	
		
	public BBRatings() throws InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@id=\"headlessui-menu-button-:R5bab6:\"]")
	private WebElement sbc;
	
	@FindBy(xpath="//*[@id=\"headlessui-menu-items-:R9bab6:\"]/nav/ul[1]/li[5]/a")
	private WebElement bev;
	
	@FindBy(xpath="//*[@id=\"5\"]']")
	private WebElement ratings;
	
	//Utilization
	public  void ClickShopbyCategory()
	{
		sbc.click();
	}
	
	public  void Beverages()
	{
		bev.click();
	}
}