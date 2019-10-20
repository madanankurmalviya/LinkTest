package Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelThird 
{  
	static
	{
		System.setProperty("webdriver.chrome.driver","./DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./excel/Table.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		
		for (int a=0 ; a<5 ; a++)
		{
			for(int b=0;b<3;b++)
			{
				Row rw = sh.getRow(a);
				Cell cl = rw.getCell(b);
				String data = cl.getStringCellValue();
				System.out.print(" "+ data+" ");
			}
			System.out.println(" ");
		}
	}

}
