package com.Practice;
 
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class ListGoogle {
 
	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Nagar\\eclipse-workspace\\Hexaware_OrangeHRM\\src\\test\\resources\\Driver\\chromedriver.exe");
		
WebDriver driver=new ChromeDriver();

driver.get("https://www.google.com/");
driver.manage().window().maximize();
 
driver.findElement(By.name("q")).sendKeys("Bengaluru");

Thread.sleep(5000);
 
 
 
List<WebElement> li= driver.findElements(By.xpath("//span[contains(text(),'Bengaluru')]"));
 
 
Thread.sleep(2000);
int count=li.size();
 
for(int i=0;i<count;i++)
{
	Thread.sleep(2000);
 
WebElement element_verify=	 li.get(i);
Thread.sleep(2000);
 
System.out.println(element_verify.getText());
}
	}}
