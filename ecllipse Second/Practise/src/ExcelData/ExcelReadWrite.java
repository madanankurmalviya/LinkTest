package ExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadWrite 
{
		public static void main (String []args) throws EncryptedDocumentException, IOException
		{
			//System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
			{
			FileInputStream fis = new FileInputStream(".//ExcelFolder/Excel.xlsx");
			Workbook wb =  WorkbookFactory.create(fis);
			Sheet st = wb.getSheet("Sheet1");
			Row rw=st.getRow(1);
			Cell cl = rw.getCell(2);
			String data = cl.getStringCellValue();
			System.out.println("The data value of sheet is :"+data);
			}	
			{
			FileInputStream fis1 = new FileInputStream(".//ExcelFolder/Excel.xlsx");
			Workbook wb1=WorkbookFactory.create(fis1);
			Sheet sh1 = wb1.getSheet("Sheet1");
			Row rw1 = sh1.getRow(3);
			if(rw1==null)
			{
				rw1=sh1.createRow(3);
			}
			Cell cl1=rw1.getCell(3);
			if(cl1==null)
			{
				cl1=rw1.createCell(3);
			}
			cl1.setCellValue("************OM Ganeshay Nama************");
						
			FileOutputStream fos = new FileOutputStream(".//ExcelFolder/Excel.xlsx");
			wb1.write(fos);
		}

		
		System.out.println("The print has done");
		}
		
}
