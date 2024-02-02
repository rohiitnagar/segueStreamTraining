package com.BigBasket;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login_with_mobile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Nagar\\eclipse-workspace\\Hexaware_OrangeHRM\\src\\test\\resources\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try
		{
		wait.until(ExpectedConditions.titleContains("Online Grocery Shopping and Online Supermarket in India - bigbasket"));
		System.out.println("passed");
		}
		catch (Exception e) {
		System.out.println("Failed");
		}
		driver.findElement(By.xpath("//button[contains(text(), 'Login/ Sign Up')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div/div[2]/form/div/input")).sendKeys("9981735227");
		
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		Thread.sleep(20000);
		//Entering OTP 
		
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
				Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement we = driver.findElement(By.xpath("//img[@alt='uploads/banner_images/hp_m_petstore_250923_400.jpg']"));
		
		js.executeScript("arguments[0].scrollIntoView();", we);
		
		driver.findElement(By.xpath("//*[@id=\"siteLayout\"]/div/div[13]/div/div[2]/div/div[2]")).click();
		
		we.click();
		// WAITING TILL WEBSITE LOAD
				WebDriverWait wait1=new WebDriverWait(driver, 10);
				try
				{
				wait1.until(ExpectedConditions.titleContains("Buy Pet Food & Accessories online from the best brands at best prices. - bigbasket"));
				System.out.println("passed");
				}
				catch (Exception e) {
				System.out.println("Failed");
				}

		Thread.sleep(2000);
		WebElement a = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[5]/div[2]/section[2]/section/ul/li[20]/div/div/div[5]/div/div[2]/button"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",a);
		
		Thread.sleep(2000);
		System.out.println("Line 67 passed");
		//a.click();
		System.out.println("Line 69 passed");
		Thread.sleep(5000);
		
		WebDriverWait wait2=new WebDriverWait(driver, 10);
		try
		{
		wait2.until(ExpectedConditions.titleContains("Online Grocery Shopping and Online Supermarket in India - bigbasket"));
		System.out.println("passed");
		}
		catch (Exception e) {
		System.out.println("Failed");
		}
		

		driver.findElement(By.xpath("//h4[contains(text(),'Staples')]")).click();
			System.out.println("Clicked Staples");
			driver.findElement(By.xpath("//h4[contains(text(),'Essentials')]")).click();
			System.out.println("Clicked Essentials");
			
		driver.findElement(By.xpath("//img[@alt='DailyEssentials']")).click();
			System.out.println("Clicked Image");
		WebElement b = driver.findElement(By.xpath("//*[@id=\"siteLayout\"]/div[5]/div[2]/section[2]/section/ul/li[26]/div/div/div[5]/div/div[2]/button"));
		
		js.executeScript("arguments[0].scrollIntoView();",b);
		
		//b.click();
		
		//driver. navigate(). back();
		
		WebElement c = driver.findElement(By.xpath("//img[@alt='coca-cola-hp_brandStorefront_m_480_250323_03.jpg']"));
		
		js.executeScript("arguments[0].scrollIntoView();",c);
		
		c.click();
		
		driver.findElement(By.xpath("//img[@alt='Coca Cola Original Taste Soft Drink 300 ml Can']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),\"Add to basket\")]")).click();
		
		
		driver. quit() ;
		
		
	}

}
