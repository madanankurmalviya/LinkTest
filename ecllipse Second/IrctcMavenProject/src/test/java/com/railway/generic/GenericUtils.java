package com.railway.generic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class GenericUtils extends BaseTest
{
	public static void getScreenShot(String name)
	{
		try
		{
			WebElement el = driver.findElement(By.xpath(".//img[@id='nlpCaptchaImg']"));
			Thread.sleep(3000);
			TakesScreenshot sht = (TakesScreenshot)el;
			File src = sht.getScreenshotAs(OutputType.FILE);
			File dest= new File(".//Photo/"+name+".png");
			FileUtils.copyFile(src, dest);
		}
		catch (Exception e)
		{
			
		}
	}
	
	public static void selByIndex(WebElement element , int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public static void alertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public static void alertDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public static void actionClass(WebDriver driver , WebElement sqButton)
	{
		Actions act = new Actions(driver);
		act.moveToElement(sqButton).click().build().perform();
	}
	
	public static void enterUserPasswordJS(String arg)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(arg);
	}
	
	public static void javaClick(WebElement button)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",button);
	}
	
	public static void scanText(File dest ) throws TesseractException, InterruptedException
	{
		ITesseract image = new Tesseract();
		image.setDatapath(".//tessdata");
		image.setLanguage("eng");
		
		String Textt = image.doOCR(dest);
		
		System.out.println("The text of captcha - "+Textt);
		String str = Textt.replaceAll("^a-zA-Z0-9","");
		String[] st = str.split("Type”");
		System.out.println("The pure text is-"+st[1].toString());
		
		
		//****trim method to reduce space *****
		
		
		String Stt = st[1].replaceAll(" ","");
		Thread.sleep(2000);
		String sort=Stt.substring(0,4);
		System.out.println("The sorted value is :"+sort);
		driver.findElement(By.xpath(".//input[@id='nlpAnswer']")).sendKeys(sort);
		Thread.sleep(2000);
	}
}

