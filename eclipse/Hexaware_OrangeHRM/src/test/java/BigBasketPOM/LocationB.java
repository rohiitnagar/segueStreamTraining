package BigBasketPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LocationB extends BasePage {
	@FindBy(xpath="/html/body/div[2]/div[1]/header[2]/div[1]/div[2]/div[1]/div[1]/div/button/span/span")
	private WebElement L;
	@FindBy(xpath="/html/body/div[2]/div[1]/header[2]/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/input")
	private WebElement B;
	@FindBy(xpath="/html/body/div[2]/div[1]/header[2]/div[1]/div[2]/div[1]/div[1]/div/div/div[3]/ul/li[1]/span[1]")
	private WebElement BR;
	public void Location() {
		L.click();
		
	}
	public void Banglore(String str) {
		B.sendKeys(str);
		Assert.assertTrue(L.isEnabled());
		System.out.println("Enabled Location");
			
	}
	public void Railwaystation() {
		BR.click();
		
	}
}
