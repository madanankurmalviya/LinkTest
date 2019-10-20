package com.gmail.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{
	public static String getData(String filePath , String sheetName , int rn , int cn)
	{
		try
			{
				FileInputStream fis = new FileInputStream(filePath);
				Workbook wb = WorkbookFactory.create(fis);
				Sheet sh = wb.getSheet(sheetName);
				Row rw = sh.getRow(rn);
				Cell cl = rw.getCell(cn);
				String data = cl.getStringCellValue();
				return data;
			}
		catch(Exception e )
			{
				return "";
			}
	}
	
	public static int getRowCount(String filePath , String sheetName)
	{
		try
		{
			FileInputStream fis = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			int rcount = sh.getLastRowNum();
			return rcount;
		}
		catch(Exception e)
		{
			return -1;
		}
	}
	
	public static int getCellCount(String filePath , String sheetName, int rn)
	
	{
		try
	{
	
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row rw = sh.getRow(rn);
		int ccount= rw.getLastCellNum();
		return ccount;
	}
	catch (Exception e)
	{
		return -1;
	}
}
	public static void setData(String sheetName , int rn , int cn , String cellValue , String filePath)
	{
		try
		{
			FileInputStream fis = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
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
			cl.setCellValue(cellValue);
			FileOutputStream fos = new FileOutputStream(filePath);
			wb.write(fos);
			wb.close();
			
		}
		catch (Exception e)
		{
			
		}
	}
	
}
