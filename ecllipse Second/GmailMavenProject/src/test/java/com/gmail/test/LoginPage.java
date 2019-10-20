package com.gmail.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.gmail.methods.GenericUtilsMethods;

public class LoginPage extends GenericUtilsMethods
{
	@Test
	public void Login() throws EncryptedDocumentException, IOException
	{
		
		System.out.println(GenericUtilsMethods.getExcelDataS("Sheet1", 1, 1));
//		String lastName=GenericUtilsMethods.getExcelDataS("Sheet1", 1, 2);
//		String userNameData=GenericUtilsMethods.getExcelDataS("Sheet1", 1, 3);
//		String passNew=GenericUtilsMethods.getExcelDataS("Sheet1", 1, 3);
//		String passConfirm=passNew;
//		WebElement login = driver.findElement(By.xpath(".//input[@type='text' and @id='firstName']"));
//		GenericUtilsMethods.driverSendKeys(login, firstName);
//		WebElement password = driver.findElement(By.xpath(".//input[@type='text' and @id='lastName']"));
//		GenericUtilsMethods.driverSendKeys(password, lastName);
//		WebElement usrname = driver.findElement(By.xpath(".//input[@autocomplete='username']"));
//		GenericUtilsMethods.driverSendKeys(usrname, userNameData);
//		WebElement pass = driver.findElement(By.xpath(".//input[@type='password' and @name='Passwd' ]"));
//		GenericUtilsMethods.driverSendKeys(pass, passNew);
//		WebElement conPass=driver.findElement(By.xpath(".//input[@type='password' and @name='ConfirmPasswd' ]"));
//		GenericUtilsMethods.driverSendKeys(conPass, passConfirm);
//		WebElement next = driver.findElement(By.xpath(".//span[text()='Next']"));
//		GenericUtilsMethods.javaScriptClick(next);
	}

}
