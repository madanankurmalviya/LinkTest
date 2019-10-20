package com.actitime.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.generic.*;

public class EnterTimeTrackPage extends BasePage
{
	//Decleration
	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement logoutLink;
	
	//Initialization
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//Utlization
	
	public void clickOnLogout(WebElement LogoutLink)
	{
		LogoutLink.click();
	}
}
