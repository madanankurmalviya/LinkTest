package ExcelData;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenReadExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver",".//DriverAnkur/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
//		driver.get(web);
		
		FileInputStream fis = new FileInputStream(".//ExcelFolder/Excel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(1);
		Cell cell = row.getCell(2);
		String data =cell.getStringCellValue();
		System.out.println("The data is :"+data);
		
		
		
		
		
	}

}
