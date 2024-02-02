package Steps;

import BigBasketPOM.BannerPageBelow;
import io.cucumber.java.en.Then;

public class VerifyBannerSteps {
	BannerPageBelow b = new BannerPageBelow();
	
	@Then("Click Banner")
	public void click_banner() throws InterruptedException {
		try{
			System.out.println("In try");
		b.clickBanner();
			
		}
		catch(Exception e){
			Thread.sleep(10000);
			System.out.println("Finally");
			b.clickBanner();
			
		}
		Thread.sleep(15000);
	}
	
	
}
