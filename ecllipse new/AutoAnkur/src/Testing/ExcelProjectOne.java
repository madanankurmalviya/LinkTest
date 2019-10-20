package Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelProjectOne 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException 
	
	{
		FileInputStream fis = new FileInputStream("./excel/OmGaneshayNama.xlsx");
		
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet("Sheet1");
		 Row rw = sh.getRow(0);
		 Cell cl = rw.getCell(0);
		 Cell c2 = rw.getCell(1);
		 String data = cl.getStringCellValue();
		 String data1 = c2.getStringCellValue();
		 System.out.println(data+" "+data1);
	}
}
