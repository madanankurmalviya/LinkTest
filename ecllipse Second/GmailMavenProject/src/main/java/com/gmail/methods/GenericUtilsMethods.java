package com.gmail.methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class GenericUtilsMethods extends BaseTest implements AutoConstant
{
	 
	public static void getScrnSht(String name) throws IOException
	{
		TakesScreenshot sht = (TakesScreenshot)driver;
		File src = sht.getScreenshotAs(OutputType.FILE);
		File dest = new File(photo_path+name+".jpeg");
		FileUtils.copyFile(src,dest);
	}
	
	public static void getElementScrnsht(WebElement ele , String name) throws IOException
	{
		TakesScreenshot sht = (TakesScreenshot)ele;
		File src = sht.getScreenshotAs(OutputType.FILE);
		File dest = new File(photo_path+name+".jpeg");
		FileUtils.copyFile(src, dest);
	}
	
	public static int getRowCount(String shn ) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(file_path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(shn);
		int rn = sh.getLastRowNum();		
		return rn;
	}
	
	public int getCellCount(String shn , int rn) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(file_path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(shn);
		Row rw = sh.getRow(rn);
		int cn = rw.getLastCellNum();
		return cn;
	}
	
	public static String getExcelDataS(String shn , int rn , int cn) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(file_path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(shn);
		Row rw = sh.getRow(rn);
		Cell cl = rw.getCell(cn);
		String data = cl.getStringCellValue();
		return data;
	}
	
	public static int getExcelDataInt(String shn , int rn , int cn) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(file_path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(shn);
		Row rw = sh.getRow(rn);
		Cell cl = rw.getCell(cn);
		int data = (int)cl.getNumericCellValue();
		return data;
	}
	
	public void putExcelData(String shn , int rn , int cn,String InputData) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(file_path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(shn);
		if(sh==null)
		{
			sh=wb.createSheet(shn);
		}
		Row rw = sh.getRow(rn);
		if(rw==null)
		{
			rw=sh.createRow(rn);
		}
		Cell cl = rw.getCell(cn);
		if(cl==null)
		{
			cl=rw.createCell(cn);
		}
		cl.setCellValue(InputData);
		
		FileOutputStream fos = new FileOutputStream(file_path);
		wb.write(fos);
	}
	
	public static void selIndex(WebElement element , int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public static void scanText(File pic, String spl) throws TesseractException
	{
		ITesseract image = new Tesseract();
		image.setDatapath(".//tessdata");
		image.setLanguage("eng");
		String str =image.doOCR(pic);
		String st= str.replaceAll("[^a-zA-Z0-9","");
		//String [] s = st.split(spl);
		System.out.println("The orig string is :"+st);
		//System.out.println("The splited string is :"+s);
	}
	
	public static void javaScriptClick(WebElement button)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", button);
	}
	
	public static void javaScriptGetData(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String data = js.executeScript("return arguments[0].InnerText",element).toString();
		
	}
	
	public static void javaScriptSendValues(WebElement element , String val)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(" arguments[0].value= 'val'; ", element);
	}
	
	public static void driverSendKeys(WebElement element , String keyValue)
	{
		element.sendKeys(keyValue);
	}

}
