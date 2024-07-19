package Steps;

import java.util.List;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ContactPageTestSteps extends BaseClass{
	
	private static ContactPage contactPage;

	
	@Given("user click on contact link")
	public void user_click_on_contact_link() {
		contactPage=new ContactPage();
		
		contactPage.checkContactLink();
		
		
	}

	@Then("user click on create button")
	public void user_click_on_create_button() {
	  
		contactPage.checkCreateButton();
	}

	@Then("user create contact enter firstname,lastname and status")
	public void user_create_contact_enter_firstname_lastname_and_status(DataTable dataTable) {
	   
		List<List<String>> list = dataTable.asLists();
		
		String fname=list.get(0).get(0);
		
		String lname=list.get(0).get(1);
		
		String selStatus=list.get(0).get(2);
		
		contactPage.createContactFunctionality(fname, lname, selStatus);
		
		
		
	}

	@Then("user click on save button")
	public void user_click_on_save_button() {
		contactPage.checkSaveButton();
	}
	
	@AfterStep
	public void checkEntity() throws InterruptedException
	{
		Thread.sleep(3000);
	}

	
}
