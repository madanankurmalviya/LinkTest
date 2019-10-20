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

public class CopyExcelData 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	
	{
		FileInputStream fis = new FileInputStream("./excel/OmGaneshayNama.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row rw = sh.getRow(0);
		Cell cl = rw.getCell(0);
		String data = cl.getStringCellValue();
		System.out.println("The value which is copied: "+data);
				
		FileOutputStream fos = new FileOutputStream("./excel/OmGaneshayNama.xlsx");
		//Workbook wb1=WorkbookFactory.create(fis);
		Sheet sh2 = wb.getSheet("Sheet2");
		Row rw2 = sh2.createRow(2);
		Cell cl2 = rw2.createCell(10);
//		Row rw3 = sh2.createRow(5);
//		Cell cl3 = rw3.createCell(3);
//		Row rw4 = sh2.createRow(4);
//		Cell cl4 = rw4.createCell(5);
		cl2.setCellValue(data);
		wb.write(fos);
		System.out.println("End of prog : kYa dekh rahe ho excel check karo na yaar");
		
	}

}
