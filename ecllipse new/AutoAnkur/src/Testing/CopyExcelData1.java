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

public class CopyExcelData1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./excel/Table.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Sheet1");
//		Row rw = sh.getRow(0);
//		Cell cl = rw.getCell(0);
//		String data = cl.getStringCellValue();
		String data = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data);
		
		FileOutputStream fos = new FileOutputStream("./excel/Table.xlsx");
		Sheet sh4 = wb.getSheet("Sheet2");
		Row rw4 = sh4.createRow(2);
		Cell cl4 = rw4.createCell(2);
		cl4.setCellValue(data);
		wb.write(fos);
//		System.out.println("prog completed and copied");
	}

}
