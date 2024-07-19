package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class CompanyPage extends BaseClass {
	
	@FindBy(xpath="//a[@href='/companies']")
	private WebElement companyLink;
	
	@FindBy(xpath="//a[@href='/companies/new']/child::button")
	private WebElement compCreateButton;
	
	@FindBy(name="name")
	private WebElement name;
	
	@FindBy(name="url")
	private WebElement website;
	
	@FindBy(name="city")
	private WebElement addressCity;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	private WebElement email;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement compSaveButton;
	
	public CompanyPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickONCompLink()
	{
		Wait.click(companyLink);
		
	}
	
	public void clickOnCompCreateButton()
	{
		Wait.click(compCreateButton);
	}
	
	public void enterCompDetails(String Name,String Website,String AddressCity,String Email)
	{
		
	Wait.sendKeys(name, Name);
	Wait.sendKeys(website, Website);
	Wait.sendKeys(addressCity, AddressCity);
	Wait.sendKeys(email,Email);
		
	}
	
	public void clickOnCompSaveButton()
	{
		Wait.click(compSaveButton);
	}
	
	
	
	
	
	

}
