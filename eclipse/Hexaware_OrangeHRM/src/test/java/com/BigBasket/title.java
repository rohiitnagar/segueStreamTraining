package com.BigBasket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class title {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Nagar\\eclipse-workspace\\Hexaware_OrangeHRM\\src\\test\\resources\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.bigbasket.com/pc/kitchen-garden-pets/pet-food-accessories/?nc=b-cp&b_t=cp&b_camp=hp_m_petstore_250923_400&t_pg=%252Foct-homepage-t1%252F&t_p=Oct-T1_2023&t_s=below%2520TVC&t_pos_sec=15&t_pos=2&t_from_ban=7897555&t_ch=desktop");
		
		System.out.println(driver.getTitle());
	}
}
