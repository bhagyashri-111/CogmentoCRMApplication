package Steps;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTstSteps extends BaseClass{
	
private static LoginPage loginPage;
@Given("user is on Login Page")
public void user_is_on_login_page() {
	
	BaseClass.initialization();
	
	


}

@When("user enter username and password")
public void user_enter_username_and_password() {
	loginPage=new LoginPage();
	
	String UserName=prop.getProperty("USERNAME");
	
	String PassWord=prop.getProperty("PASSWORD");
	
	loginPage.loginFunctionality(UserName, PassWord);
	

}

@Then("user click on login button")
public void user_click_on_login_button() {

	loginPage.clickOnLoginButton();

}

}
