package com.selenium.practise;
import java.util.concurrent.TimeUnit;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataProvider 

{
	public static WebDriver driver;
	public static void main(String[]args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".//DriverAnkur/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LinkedHashMap<String,Integer> hm = new LinkedHashMap<>();
		FileInputStream fis = new FileInputStream(".//ExcelFolder/Excel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet2");
		for(int r = 1 ; r <16 ;r++)
		{
			Row rw = sh.getRow(r);
			Cell cl1 = rw.getCell(0);
			String un = cl1.getStringCellValue();
			Cell cl2 = rw.getCell(1);
			Integer pw = (int) cl2.getNumericCellValue();
			hm.put(un,pw);
		}
		
		System.out.println(hm);
		int a=0;
		for(Entry e: hm.entrySet())
		{
			driver.get("http://testing-ground.scraping.pro/login");
			a+=1;
			driver.findElement(By.xpath(".//input[@id='usr']")).sendKeys(e.getKey().toString());
			driver.findElement(By.xpath(".//input[@id='pwd']")).sendKeys(e.getValue().toString());
			
			TakesScreenshot sht = (TakesScreenshot)driver;
			File src = sht.getScreenshotAs(OutputType.FILE);
			File dest = new File(".//Photo"+"/pic"+a+".jpeg");
			FileUtils.copyFile(src,dest);
			driver.findElement(By.xpath(".//input[@type='submit']")).click();
			WebElement login = driver.findElement(By.xpath(".//div[@id='case_login']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,800);");
			File src1 = sht.getScreenshotAs(OutputType.FILE);
			File dest1 = new File(".//Photo"+"/picLast"+a+".jpeg");
			FileUtils.copyFile(src1,dest1);
			Thread.sleep(3000);
		}
	}
}
