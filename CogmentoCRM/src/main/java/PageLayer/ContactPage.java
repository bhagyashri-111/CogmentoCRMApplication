package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class ContactPage extends BaseClass {
	
	@FindBy(xpath="//a[@href='/contacts']")
	private WebElement contactLink;
	
	@FindBy(xpath="//a[@href='/contacts/new']")
	private WebElement createButton;
	
	@FindBy(name="first_name")
	private WebElement firstname;
	
	@FindBy(name="last_name")
	private WebElement lastname;
	
	@FindBy(xpath="//label[text()='Status']/following-sibling::div")
	private WebElement statusDropDown;
	
	@FindBys(@FindBy(xpath="//div[@class='visible menu transition']/child::div[@name='status']/child::span"))
	private List<WebElement> statusList;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement saveButton;
	
	public ContactPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void checkContactLink()
	{
		Wait.click(contactLink);
	}
	
	public void checkCreateButton()
	{
		Wait.click(createButton);
	}
	
	public void createContactFunctionality(String Fname,String Lname,String ExpectedStatus)
	{
		Wait.sendKeys(firstname, Fname);
		Wait.sendKeys(lastname,Lname);
		Wait.click(statusDropDown);
		for(WebElement status:statusList)
		{
			String allStatusList=status.getText();
			System.out.println(allStatusList);
			
			if(allStatusList.contains(ExpectedStatus))
			{
				Wait.click(status);
				break;
			}
		}
	}
	
	public void checkSaveButton()
	{
		Wait.click(saveButton);
	}
	

}
