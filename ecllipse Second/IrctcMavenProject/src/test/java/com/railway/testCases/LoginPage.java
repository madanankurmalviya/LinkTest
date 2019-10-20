package com.railway.testCases;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.railway.generic.BaseTest;
import com.railway.generic.GenericUtils;

import net.sourceforge.tess4j.TesseractException;

public class LoginPage extends BaseTest
{
	@Test(invocationCount=1)
	public void clickSquare() throws TesseractException, InterruptedException
	{
		
		WebElement sqButton = driver.findElement(By.xpath(".//i[@class='fa fa-align-justify']/../../..//div[@class='h_menu_drop_button hidden-xs']"));
		GenericUtils.actionClass(driver, sqButton);
		
		WebElement login1 = driver.findElement(By.xpath(".//button[text()='LOGIN']"));
		GenericUtils.actionClass(driver, login1);
		
		
//		String arg0="document.getElementById('userId').value=' password  ';";
//		GenericUtils.enterUserPasswordJS(arg0);
		
		driver.findElement(By.xpath(".//input[@id='userId']")).sendKeys("mlankur");
		Thread.sleep(1000);
		
//		String arg1="document.getElementById('pwd').value=' password';";
//		GenericUtils.enterUserPasswordJS(arg1);
		
		driver.findElement(By.xpath(".//input[@id='pwd']")).sendKeys("malviya");
		Thread.sleep(1000);
		
		
		
		
		
		
		String name="firstCaptcha";
		GenericUtils.getScreenShot(name);
		File dest = new File(".//Photo/"+name+".png");
		GenericUtils.scanText(dest);
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath(".//button[text()='SIGN IN']"));
		GenericUtils.javaClick(button);
		Thread.sleep(3000);
		
		
		
		
//		WebElement login = driver.findElement(By.xpath(".//div[@class='loginError' and text()='Invalid Captcha....'] "));
//		String invalid = login.getText();
//		//String act = "Invalid Captcha....";
//		System.out.println("The invalid :"+invalid);

	}
}
