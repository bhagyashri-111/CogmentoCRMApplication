package Steps;

import org.junit.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageTestSteps extends BaseClass{
	private static HomePage homePage;

@Given("user is on home page Validate homeLogo")
public void user_is_on_home_page_validate_home_logo() {
	
	homePage=new HomePage();
	
	boolean actualLogo=homePage.checkLogo();
	Assert.assertTrue(actualLogo);
	
	
 
}

@Then("user Validate HomePage Text")
public void user_validate_home_page_text() {
	String actualtext=homePage.homeText();
	Assert.assertEquals(actualtext, "Deals Summary");
   
}

@Then("user validate HomePage Title")
public void user_validate_home_page_title() {
	String actualTitle=homePage.homeTitle();
	Assert.assertEquals(actualTitle, "Cogmento CRM");
	
}

@Then("user validate HomePage Url")
public void user_validate_home_page_url() {
	
	String actualUrl=driver.getCurrentUrl();
	Assert.assertEquals(actualUrl.contains("cogmento"), true);
	
   
}

}
