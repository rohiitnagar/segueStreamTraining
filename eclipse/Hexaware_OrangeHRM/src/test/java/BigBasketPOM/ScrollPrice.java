package BigBasketPOM;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ScrollPrice extends BasePage {
	
	public ScrollPrice() throws InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath ="//*[@id=\"i-Rs201toRs500\"]")
	WebElement ra;	
	public void scroll() throws InterruptedException
	{
		for (int i = 0; i < 10; i++) { 
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,130)");
			Thread.sleep(600);
			
		}
	}
	public void priceclick() throws IOException
	{
		ra.click();
		TakesScreenshot t=(TakesScreenshot)driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Rohit Nagar\\Pictures\\Screenshots\\screenshot_test.png");
		FileUtils.copyFile(src, dest);


	}
	
		
	}