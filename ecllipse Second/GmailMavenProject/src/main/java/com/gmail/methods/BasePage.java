package com.gmail.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage 
{
	public WebDriver driver;
	public void explicitWait(String eTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleIs(eTitle));
	}
	
	
}
