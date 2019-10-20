package com.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.generic.BasePage;

public class LoginPage extends BasePage
{
	@FindBy(id="username")
	private WebElement usernameTB;
	
	@FindBy(name="pwd")
	private WebElement passwordTB;
	
	@FindBy(xpath="//div[.'Login']")
	private WebElement loginBTN;
	
	@FindBy(xpath="")
	private WebElement version;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver ,this);
	}
	
	public void verifyPage(String eTitle)
	{
		verifyTitle(eTitle);
	}
	
	public void enterUserName(String un)
	{
		usernameTB.sendKeys(un);
	}
	
	public void enterPassword(String pw)
	{
		passwordTB.sendKeys(pw);
	}
	
	public void clickOnLogin()
	{
		loginBTN.click();
	}
	
	public String verifyVersion()
	{
		verifyElement(version);
		String aVersion = version.getText();
		return aVersion;
	}

}
