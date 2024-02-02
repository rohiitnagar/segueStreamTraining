package BigBasketPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddtocartB extends BasePage{
	
	@FindBy(xpath="/html/body/div[2]/div[1]/header[2]/div[2]/div[2]/ul/li[1]/a")
	private WebElement EF;
	@FindBy(xpath="/html/body/div[2]/div[1]/div[5]/div[2]/section[2]/section/ul/li[1]/div/div/div[1]/div[1]/a/span/img")
	private WebElement img;

	public void Fruits() {
		EF.click();
		
	}
	public void Strawberry()
	{
		img.click();
	}
	
	
}
