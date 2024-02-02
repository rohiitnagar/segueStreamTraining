package com.BigBasket;	
	import java.awt.AWTException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.JavascriptExecutor;

	public class MMT {

		public static void main(String[] args) throws InterruptedException,AWTException{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Nagar\\eclipse-workspace\\Hexaware_OrangeHRM\\src\\test\\resources\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.makemytrip.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/section/span")).click();
			Thread.sleep(2000);
			System.out.println("1");
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div/div/nav/ul/li[2]/span/a/span[1]/span")).click();
			Thread.sleep(2000);
			System.out.println("2");
			driver.findElement(By.xpath("//button[@class = 'primaryBtn font24 latoBold widgetSearchBtn']")).click();
			
			Thread.sleep(2000);
			System.out.println("3");
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[5]/div[1]/div[2]/div[2]/div[2]/ul/li[1]/span[1]/label")).click();
			
			Thread.sleep(2000);
			System.out.println("4");
			driver.findElement(By.xpath("//img[@src = '//r1imghtlak.mmtcdn.com/55b43e3042b111eca5680a58a9feac02.jpeg?&output-quality=75&downsize=243:162&crop=243:162;0,40&output-format=webp']")).click();
		System.out.println("5");
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div/div[2]/span/div/div/div[2]/div[2]/span/a")).click();
}
}