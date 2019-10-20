package Testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.io.FileBackedOutputStream;

public class ExcelPractise2
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./excel/OmGaneshayNama.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet3");
		Row r = sh.getRow(0);
		if(r==null)
		{
			r=sh.createRow(0);
		}
		Cell c = r.getCell(1);
		if(c==null)
		{
			c=r.createCell(1);
		}
		
		c.setCellValue("jspiders");
		FileOutputStream fos=new FileOutputStream("./excel/OmGaneshayNama.xlsx");
		wb.write(fos);
		fos.close();
	}

}
