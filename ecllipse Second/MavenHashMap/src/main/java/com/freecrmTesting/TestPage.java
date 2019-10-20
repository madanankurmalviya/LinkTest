package com.freecrmTesting;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPage
{
	WebDriver driver;
	String credential,credential1[];
	
	@BeforeMethod
	public void openWebPage()
	{
		System.setProperty("webdriver.chrome.driver", "E:/ANKUR MALVIYA/eclipse/ecllipse new/driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html?e=2");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

//	@Test (priority=2)
//	public void loginWithFirstId() throws Exception
//	{
//		credential = Data.getUser().get(1);
//		credential1= credential.split("_");
//		driver.findElement(By.xpath(".//input[@name='username']")).clear();
//		
//		driver.findElement(By.xpath(".//input[@name='username']")).sendKeys(credential1[0]);
//		
//		driver.findElement(By.xpath(".//input[@name='password']")).sendKeys(credential1[1]);
//		
//		driver.findElement(By.xpath(".//input[@class='btn btn-small' and @type='submit']")).submit();
//	}
	
	@Test (priority=3)
	public void loginWithAdmin() throws IOException
	{
		
		try
		{
			credential =Data.getUser().get(2);
			credential1=credential.split("_");
			WebElement wb=driver.findElement(By.xpath(".//input[@name='username']"));
			wb.clear();
			wb.sendKeys(credential1[0]);
			
			driver.findElement(By.xpath(".//input[@name='password']")).sendKeys(credential1[1]);			
			WebElement btn = driver.findElement(By.xpath(".//input[@class='btn btn-small' and @type='submit']"));
			
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("argument[0].click()",btn);
			
			
		}
		catch(Exception e)
		{
			TakesScreenshot sht = (TakesScreenshot)driver;
			File src1 = sht.getScreenshotAs(OutputType.FILE);
			File dest1 = new File("C:/Users/Prafulla/Desktop/Photos/Pic1.png");
			FileUtils.copyFile(src1, dest1);
			System.out.println("Some Mistake is with credentials.");
			
		}
//		btn.submit();
		
		
	}
	
//	@Test (priority=1)
//	public void loginWithThird() throws IOException
//	{
//		credential=Data.getUser().get(3);
//		credential1=credential.split("_");
//		
//		driver.findElement(By.xpath(".//input[@name='username']")).sendKeys(credential1[0]);
//		driver.findElement(By.xpath(".//input[@name='password']")).sendKeys(credential1[1]);
//		
//		TakesScreenshot sht = (TakesScreenshot)driver;
//		File src1 = sht.getScreenshotAs(OutputType.FILE);
//		File dest1 = new File("C:/Users/Prafulla/Desktop/Photos/Pic1.png");
//		FileUtils.copyFile(src1, dest1);
//		
//		driver.findElement(By.xpath(".//input[@type='submit']")).submit();
//		
//		driver.switchTo().frame("mainpanel");
//		WebElement pht= driver.findElement(By.xpath(".//select[@name='slctMonth']"));
//		Select sel = new Select(pht);
//		sel.selectByVisibleText(Data.getMonth().get("feb"));
//	}
	
//	
	
	
}
