package Test;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import BigBasketPOM.AddtocartB;
import BigBasketPOM.BBPrice;
import BigBasketPOM.BBRatings;
import BigBasketPOM.BannerPageBelow;
import BigBasketPOM.HairCare;
import BigBasketPOM.HomePageTopBanner;
import BigBasketPOM.LocationB;
import BigBasketPOM.LoginPages;
import BigBasketPOM.PetShop;
import BigBasketPOM.Scroll;
import BigBasketPOM.ScrollPrice;
import BigBasketPOM.Scrollratings;
import Utils.DriverUtils;
import Utils.ExcelData;

public class BigBasketTest {
	@Test(priority=4)
	public void verifyLogin() throws InterruptedException {
//		DriverUtils.getDriver().get("https://www.bigbasket.com/");
//		
//		Assert.assertEquals(DriverUtils.getDriver().getTitle(), "Online Grocery Shopping and Online Supermarket in India - bigbasket");
		
		Thread.sleep(5000);
		
		LoginPages lp = new LoginPages();
		
		lp.clickLogin();
		Thread.sleep(2000);
		lp.enterMObile("9981735227");
		Thread.sleep(5000);
		lp.clickContinue();
		Thread.sleep(20000);
		//lp.clickLogin();
	
		Thread.sleep(5000);
		//WebDriver driver = DriverUtils.getDriver();	
	}
	@Test(priority=5)
	
	public void verifyBanner() throws InterruptedException {

		BannerPageBelow bpb = new BannerPageBelow();
		bpb.scroll();
//		WebElement w = bpb.scrollBanner();
//		Actions act = new Actions(driver);
//		act.moveToElement(w).perform();
//		BannerPageBelow bpb = new BannerPageBelow();
//		bpb.scrollBanner();
		try{
			System.out.println("In try");
			bpb.clickBanner();
			
		}
		catch(Exception e){
			Thread.sleep(10000);
			System.out.println("Finally");
			bpb.clickBanner();
			
		}
		Thread.sleep(15000);
	}
	
	@Test(priority=6)
	public void verifyPetShop() throws InterruptedException {
		PetShop p = new PetShop();
		p.scroll();

		Thread.sleep(10000);
		
	}
	
	@Test(priority=7)
	public void  verifyTopBanner() throws InterruptedException {
		HomePageTopBanner tb = new HomePageTopBanner();
		tb.clickDaily();
		tb.clickTea();
		tb.clickHair();
		tb.openHair();
		
		Thread.sleep(5000);
		
		//HairCare hc = new HairCare();
		//hc.addShampoo();
		//Thread.sleep(2000);
		//hc.clickHome();
		
		Thread.sleep(5000);		
	}
	
	@Test(priority=2)
	public void verifyRating() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(DriverUtils.getDriver(), 20);
		try
		{
		wait.until(ExpectedConditions.titleContains("Online Grocery Shopping and Online Supermarket in India - bigbasket"));
		System.out.println("passed");
		}
		catch (Exception e) {
		System.out.println("Failed");
		}
		//DriverUtils.getDriver().get("https://www.bigbasket.com/");
		Thread.sleep(5000);
		BBRatings R = new BBRatings();
		Scrollratings s = new Scrollratings(); 
		Thread.sleep(2000);
		R.ClickShopbyCategory();
		Thread.sleep(2000);
		R.Beverages();
		Thread.sleep(2000);
	    s.scroll();
	    s.ratingclick();
	    
	}	
	
	@Test(priority =3)
	public void verifyPrice() throws InterruptedException, IOException {
		WebDriverWait wait=new WebDriverWait(DriverUtils.getDriver(), 20);
		try
		{
		wait.until(ExpectedConditions.titleContains("Online Grocery Shopping and Online Supermarket in India - bigbasket"));
		System.out.println("passed");
		}
		catch (Exception e) {
		System.out.println("Failed");
		}

		//DriverUtils.getDriver().get("https://www.bigbasket.com/");
		//Thread.sleep(5000);
		BBPrice R = new BBPrice();
		ScrollPrice s = new ScrollPrice(); 
		Thread.sleep(2000);
		R.ClickShopbyCategory();
		Thread.sleep(2000);
		R.Beverages();
		Thread.sleep(2000);
	    s.scroll();
	    s.priceclick();
	    Thread.sleep(10000);
	}	
	
	@Test(invocationCount=2)
	public void verifyLocation() throws InterruptedException{
		DriverUtils.getDriver().get("https://www.bigbasket.com/");
		
		Assert.assertEquals(DriverUtils.getDriver().getTitle(), "Online Grocery Shopping and Online Supermarket in India - bigbasket");
		
		Thread.sleep(5000);
		//DriverUtils.getDriver().get("https://www.bigbasket.com/");
		LocationB L = new LocationB();
		Thread.sleep(2000);
		L.Location();
		Thread.sleep(2000);
		L.Banglore("Banglore");
	//	L.Banglore(ExcelData.getdata("C:\\Users\\Rohit Nagar\\eclipse-workspace\\Hexaware_OrangeHRM\\src\\test\\resources\\Book1.xlsx", "Sheet1", 5, 1));
		Thread.sleep(2000);
		L.Railwaystation();
		Thread.sleep(2000);
		
	}
	@Test(dependsOnMethods = "verifyTopBanner")
		public void verifyAddtocart() throws InterruptedException{
		AddtocartB C = new AddtocartB();
		
		WebDriverWait wait=new WebDriverWait(DriverUtils.getDriver(), 20);
		try
		{
		wait.until(ExpectedConditions.titleContains("Online Grocery Shopping and Online Supermarket in India - bigbasket"));
		System.out.println("passed");
		}
		catch (Exception e) {
		System.out.println("Failed");
		}
		
		C.Fruits();
		Thread.sleep(2000);
		C.Strawberry();

		
	}
	
	public class Deals {
		@Test(priority=9)
		public void verifyLogin() throws InterruptedException
		{
			DriverUtils.getDriver().get("https://www.bigbasket.com/");
			Thread.sleep(3000);
			Scroll s=new Scroll();
			s.dealsOfWeek();
			s.goToCart();
		}

	}
	}


// Screenshot - Wait - Invo
