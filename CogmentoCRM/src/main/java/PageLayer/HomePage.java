package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class HomePage extends BaseClass {
	
	@FindBy(xpath="//div[text()='Deals Summary']")
	private WebElement homeText;
	

	@FindBy(xpath="//div[@class='header item']")
	private WebElement homeLogo;
	

	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean checkLogo()
	{
		return Wait.isDisplayed(homeLogo);
	}
	
	public String homeText()
	{
		return homeText.getText();
	}
	
	public String homeTitle()
	{
		return driver.getTitle();
	}
	
	public String homeUrl()
	{
		return driver.getCurrentUrl();
	}
	
	

}
