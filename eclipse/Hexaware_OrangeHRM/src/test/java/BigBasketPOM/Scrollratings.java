package BigBasketPOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Scrollratings extends BasePage {
	
	public Scrollratings() throws InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[5]/div[2]/section[1]/div/div[1]/div[2]/div[2]/span[1]/input")
	WebElement ra;	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[5]/div[2]/section[1]/div/div[1]/div[2]/div[2]/span[2]/input")
	WebElement ra1;	
	public void scroll() throws InterruptedException
	{
		for (int i = 0; i < 10; i++) { 
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,130)");
			Thread.sleep(600);
			
		}
	}
	public void ratingclick()
	{
		ra.click();
	}
		
	}