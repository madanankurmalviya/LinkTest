package com.actitime.generic;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtil 
{
	public static void getScreenShot(WebDriver driver, String Name) throws IOException
	{
		try
		{
			TakesScreenshot t = (TakesScreenshot) driver;
			File src = t.getScreenshotAs(OutputType.FILE);
			File dest = new File("./ScrnShot/"+Name+".png");
			FileUtils.copyFile(src, dest);
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
	public static void selectByIndex(WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	public static void selectByVisibleText(WebElement element, String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	public static void selectAll(WebElement element)
	{
		Select sel = new Select(element);
		List<WebElement> alloptions = sel.getOptions();
		for(WebElement option:alloptions)
		{
			String text = option.getText();
			selectByVisibleText(element,text);
		}
	}
	public static void accept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
}

