package com.railway.generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelSheetData 
{
	//To get data
	
	public static String getData(String filePath , String SheetName ,int rn , int cn )
	{
		try
		{
			FileInputStream fis = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(SheetName);
			Row rw = sh.getRow(rn);
			Cell cl = rw.getCell(cn);
			String data = cl.getStringCellValue();
		    return data;
		}
		catch (Exception e)
		{
			return " ";
		}
		
		
	}
	
	public static int getRowCout(String filePath , String sheetName)
	{
		try
		{
			FileInputStream fis = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet("sheetName");
			int rn = sh.getLastRowNum();
			return rn;
		}
		catch (Exception e)
		{
			return -1;
		}
	}
	
	public static int getCellCount(String filePath , String sheetName , int rn) throws EncryptedDocumentException, IOException
	{
		try 
		{
			FileInputStream fis = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			Row rw = sh.getRow(rn);
			int cn = rw.getLastCellNum();
			return cn;
		}
		catch (Exception e)
		{
			return -1 ;
		}
	}
}
