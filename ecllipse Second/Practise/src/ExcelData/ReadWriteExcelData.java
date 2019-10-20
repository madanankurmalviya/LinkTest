package ExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("E:\\java\\Selenium FOlder\\ExcelData\\ExampleOne.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		for(int a= 3 ; a < 10 ; a++)
		{
			for(int b=0 ; b < 10 ; b++)
			{
				Row rw = sh.getRow(a);
				
					if(rw==null)
					{
						rw=sh.createRow(a);
					}
					Cell cl = rw.getCell(b);
					if(cl==null)
					{
						cl=rw.createCell(b);
					}
					cl.setCellValue("OM GANESHAY NAMA");
		
					FileOutputStream fos = new FileOutputStream("E:\\java\\Selenium FOlder\\ExcelData\\ExampleOne.xlsx");
					wb.write(fos);
			}
		}
		System.out.println("Done");
	}

}
