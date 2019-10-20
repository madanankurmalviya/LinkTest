package ExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;

public class ExcelDataRW
{
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(".//ExcelFolder/Excel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh =  wb.getSheet("Sheet3");
		
		for (int a=1;a<=10;a++)
		{
			Row rw = sh.getRow(a);
			Cell cl = rw.getCell(0);
			Cell cl2=rw.getCell(1);
			double data = cl.getNumericCellValue();
			double data2 = cl2.getNumericCellValue();
			double data1 = data*data2;
			System.out.println("The value is :"+data1);
			
			Row rw1=sh.getRow(a);
			if(rw1==null)
			{
				rw1=sh.createRow(a);
			}
			Cell cl1= rw1.getCell(3);
			if(cl1==null)
			{
				cl1=rw1.createCell(3);
			}
			cl1.setCellValue(data1);
			FileOutputStream fos = new FileOutputStream(".//ExcelFolder/Excel.xlsx");
			wb.write(fos);
		}
	}
}
