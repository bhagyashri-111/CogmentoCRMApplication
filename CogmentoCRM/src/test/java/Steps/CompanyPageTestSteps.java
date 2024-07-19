package Steps;

import BaseLayer.BaseClass;
import PageLayer.CompanyPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CompanyPageTestSteps extends BaseClass{
      
	private static CompanyPage companyPage;

@Given("user click on company Link")
public void user_click_on_company_link() {
   
	 companyPage=new CompanyPage();
	 
	 companyPage.clickONCompLink();
}

@Given("user click on company createe button")
public void user_click_on_company_createe_button() {
	
	companyPage.clickOnCompCreateButton();
  
}

@Given("enter company details {string},{string},{string} and {string}")
public void enter_company_details_and(String Name, String Website, String AddressCity, String Email) {
   
	companyPage.enterCompDetails(Name, Website, AddressCity, Email);
}

@Then("user click on comSave Button")
public void user_click_on_com_save_button() {
	companyPage.clickOnCompSaveButton();
	
  
}

}
