package Steps;

import BigBasketPOM.LoginPages;
import Utils.DriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
		LoginPages lp = new LoginPages();
		
		@Given("Open the URL")
		public void open_the_url() {
		    DriverUtils.getDriver().get("https://www.bigbasket.com/");
		}
		
		
		@When("enter username {string}")
		public void enter_username(String string) {
		   lp.enterMObile(string);
		}

		@Then("Click Login Button")
		public void click_login_button() {
		    lp.clickLogin();
		}
		
		@Then("Click Continue Button")
		public void click_continue_button() {
		    lp.clickContinue();
		}
		
}
