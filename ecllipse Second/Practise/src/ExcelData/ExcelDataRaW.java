package ExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelDataRaW
{
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(".//ExcelFolder/Excel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row rw = sh.getRow(3);
		Cell cl = rw.getCell(3);
		String data = cl.getStringCellValue();
		System.out.println("The data is :"+data);
	}
	 
	{
		
		try 
		{
			FileInputStream fis1 = new FileInputStream(".//ExcelFolder/Excel.xlsx");
			Workbook wb1=WorkbookFactory.create(fis1);
			Sheet sh1 = wb1.getSheet("Sheet2");
			Row rw1 = sh1.getRow(2);
			if(rw1==null)
			{
				rw1=sh1.createRow(2);
			}
			Cell cl1 = rw1.getCell(2);
			{
				cl1=rw1.createCell(2);
			}
			cl1.setCellValue("/*/*/*/");
			FileOutputStream fos = new FileOutputStream(".//ExcelFolder/Excel.xlsx");
			wb1.write(fos);
		}
		catch (IOException e) 
		{
			System.out.println("There is exception");
		}
		
		
	}
}

