package com.gmail.generic;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils
{
	public static void getScreenShot(WebDriver driver , String name)
	{
		try
		{
			TakesScreenshot sht = (TakesScreenshot)driver;
			File src = sht.getScreenshotAs(OutputType.FILE);
			File dest = new File("./DriverAnkur/Photo/pic.jpeg");
			FileUtils.copyFile(src,dest);
		}
		catch(Exception e)
		{
			
		}
		
	}
	
	
	
	public static void selectByIndex(WebElement element , int index)
	{
		Select sel = new Select(element);
		selectByIndex(element,index);
	}
	
	
	public static void selectAll(WebElement element)
	{
		Select sel = new Select(element);
		List<WebElement> allOptions = sel.getOptions();
		for(WebElement option : allOptions)
		{
			String text = option.getText();
			selectByVisibleText(element,text);
		}
	}
	
	
	private static void selectByVisibleText(WebElement element, String text) 
	{
		Select sel = new Select(element);
		
	}
	
	
	public static void deselectAll(WebElement element)
	{
		Select sel = new Select(element);
		sel.deselectAll();
	}
	
	
	public static void closeChildBrowser(WebDriver driver)
	{
		String parentWh= driver.getWindowHandle();
		Set <String> allWh = driver.getWindowHandles();
		allWh.remove(parentWh);
		for(String wh:allWh)
		{
			driver.switchTo().window(wh);
			driver.close();
		}
	}
	
	
	
	public static void moveToElement(WebElement element, WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
}

