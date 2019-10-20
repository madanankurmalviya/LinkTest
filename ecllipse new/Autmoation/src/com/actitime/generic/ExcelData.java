package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{
	public static String getData(String filePath, String sheetName, int rn, int cn)
	{
		try
		{
			FileInputStream fis = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fis);
			String data = wb.getSheet(sheetName).getRow(rn).getCell(cn).toString();
			return data;
		}
		catch(Exception e)
		{
			return "";
		}
	}
	public static int getRowCount(String filePath, String sheetName)
	{
		try
		{
			FileInputStream fis = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fis);
			int data = wb.getSheet(sheetName).getLastRowNum();
			return data;
		}
		catch(Exception e)
		{
			return -1; 
		}
	}
	public static int getCellCount(String sheetName, int rn, String filePath)
	{
		try
		{
			FileInputStream fis = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fis);
			int data = wb.getSheet(sheetName).getRow(rn).getLastCellNum();
			return data;
		}
		catch(Exception e)
		{
			return -1;
		}
	}
	public static String setData(String filePath, String sheetName, int rn, int cn, Date cellValue)
	{
		try
		{
			FileInputStream fis = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fis);
			
			Sheet sh = wb.getSheet(sheetName);
			Row r = sh.getRow(rn);
			
			if(r==null)
			{
				r=sh.createRow(rn);
			}
			Cell cl = r.getCell(cn);
			
			if(cl==null)
			{
				cl=r.createCell(cn);
			}
			cl.setCellValue(cellValue);
								
			FileOutputStream fos = new FileOutputStream(filePath);
			
			wb.write(fos);
			wb.close();
		}
		catch(Exception e)
		{
			
		}
		return null;
	}
}


