package Test;

import org.testng.annotations.Test;

import POM.LoginPages;
import Utils.DriverUtils;
import Utils.ExcelData;

public class LoginTestOne {
	@Test
	public void verifyLogin() throws InterruptedException {
		
		DriverUtils.getDriver().get("https://demowebshop.tricentis.com/login");
		
		//Thread.sleep(10000);
		LoginPages lp = new LoginPages();
		
		///Thread.sleep(10000);
	
		lp.enterUsername(ExcelData.getdata("C:\\Users\\Rohit Nagar\\eclipse-workspace\\Hexaware_OrangeHRM\\src\\test\\resources\\Book1.xlsx","Sheet1", 1, 0));
		
		lp.enterPassword(ExcelData.getdata("C:\\Users\\Rohit Nagar\\eclipse-workspace\\Hexaware_OrangeHRM\\src\\test\\resources\\Book1.xlsx", "Sheet1", 1, 1));
		
		lp.loginClick();
		
	}
}
