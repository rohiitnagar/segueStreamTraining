package Test;

import org.testng.annotations.Test;

import POM.AddToCartPage;
import POM.BillingPage;
import POM.Cart;
import POM.PaymentInfo;
import POM.RegistrationPages;
import Utils.DriverUtils;

public class Registration {
	@Test
	
	public void doRegis() throws InterruptedException {
		DriverUtils.getDriver().get("https://demowebshop.tricentis.com/register");
		
		Thread.sleep(5000);
		
		RegistrationPages r = new RegistrationPages();
		
		r.selGenderClick();
		r.enterFirstName("SomeName");
		r.enterLastName("SomeLastNAme");
		r.enterEmail("Someto34w0dfd00hgt22@ymail.com");
		r.enterPassword("Something@123");
		r.confirmPassword("Something@123");
		r.clickRegister();
		
		Thread.sleep(5000);
		
		r.clickContinue();
		
		Thread.sleep(5000);
		
		AddToCartPage addtocart = new AddToCartPage();
		
		addtocart.clickAddTOCart();
		Thread.sleep(5000);
		
		addtocart.clickGotoCart();
		Thread.sleep(5000);
		
		Cart c = new Cart();
		
		c.selectCountryId();
		c.selectCountry();
		c.checkTerms();
		c.clickCheckout();
		
		Thread.sleep(5000);
		
		BillingPage bp = new BillingPage();
		
		bp.selectCountry();
		bp.enterCity("Spme City");
		bp.enterAdd1("Somwwhere");
		bp.enterPostalCode("465629");
		bp.enterPhone("54546561");
		bp.clickcontinue();
		
		Thread.sleep(5000);
		
		bp.againContinue();
		
		
		Thread.sleep(2000);
		
		bp.againClickContinue();
		
		Thread.sleep(2000);
		
		bp.selectPaymentMethod();
		
		Thread.sleep(2000);
		
		bp.againContinue();
		
		PaymentInfo pi = new PaymentInfo();
		
		pi.enterName("Some Name");
		pi.enterCard("54696187987");
		pi.clickContinue();
		
		
		
	}
}
