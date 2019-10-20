package com.actitime.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.generic.BasePage;

public class LoginPage extends BasePage
	
{
                  //Decalaration

	@FindBy(xpath="//*[@id='username']")
	private WebElement usernameTB;
	
	@FindBy(xpath="//*[@type='password']")
	private WebElement passwordTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//nobr[contains(text(),'actiTIME')]")
	private WebElement version;
	
	@FindBy(xpath="//span[contains(text(),'invalid')]")
	private WebElement errorMessge;
		

	                   //Inatiallization
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	                  //Utilization 
	
	public void enterUsername(String un)
	{
		usernameTB.sendKeys(un);
	}
	public void verifyPage(String eTitle)
	{
		verifyTitle(eTitle);
	}
	public void enterPassword(String pw)
	{
		passwordTB.sendKeys(pw);
	}
	public void clickOnLogin()
	{
		loginBTN.click();
	}
	public String verifyErrorMsg(WebElement errorMsg)
	{
		verifyElement(errorMsg);
		String aErrorMsg = errorMsg.getText();
		return aErrorMsg;
	}
	public String verifyVersion()
	{
		verifyElement(version);
		String aversion = version.getText();
		return aversion;
	}
}
