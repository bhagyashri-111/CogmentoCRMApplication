package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Wait extends BaseClass {
	
	private static WebDriverWait wait;
	
	public static WebElement visibilityOf(WebElement wb)
	{
		 wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.visibilityOf(wb));
		
	}
	
	public static void click(WebElement wb)
	{
		wait.until(ExpectedConditions.elementToBeClickable(wb)).click();
	}
	
	public static void sendKeys(WebElement wb,String value)
	{
		Wait.visibilityOf(wb).sendKeys(value);
	}
	
	public static boolean isDisplayed(WebElement wb)
	{
		return Wait.visibilityOf(wb).isDisplayed();
	}

}
