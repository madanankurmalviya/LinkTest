package ExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadAWriteExcelData 
{
	public static FileInputStream fis;
	public static Workbook wb;
	
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		{
			fis = new FileInputStream(".//ExcelFolder/Excel.xlsx");
			wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet("Sheet1");
			Row rw = sh.getRow(0);
			Cell cl = rw.getCell(1);
			String data= cl.getStringCellValue();
			System.out.println("The new cell data is :"+data);
		
			//FileInputStream fis1 = new FileInputStream(".//ExcelFolder/Excel.xlsx");
			//Workbook wb = WorkbookFactory.create(fis);
			Sheet sh1 = wb.getSheet("Sheet1");
			Row rw1= sh1.getRow(8);
			if(rw1==null)
			{
				rw1=sh1.createRow(8);
			}
			Cell cl1 = rw1.getCell(8);
			if(cl1==null)
			{
				cl1=rw1.createCell(8);
			}
			cl1.setCellValue(data);
			FileOutputStream fos = new FileOutputStream(".//ExcelFolder/Excel.xlsx");
			wb.write(fos);
		}

	}
}
