package ExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataProgONe 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream fis = new FileInputStream("E:\\java\\Selenium FOlder\\ExcelData\\ExampleOne.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row rw = sh.getRow(0);
		for(int a=0;a<3;a++)
		{
			Cell cl = rw.getCell(a);
			String data = cl.getStringCellValue();
			System.out.print(data+" ");
			Thread.sleep(1000);
		}
		
	}
}
