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

public class WriteExcelProgram {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(".//ExcelFolder/Excel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row rw = sh.getRow(3);
		if(rw==null)
		{
			rw= sh.createRow(3);
		}
		Cell cl = rw.getCell(1);
		if(cl==null)
		{
			cl=rw.createCell(1);
		}
		cl.setCellValue("Hello My Name is Ankur Malviya.");
		FileOutputStream fos = new FileOutputStream(".//ExcelFolder/Excel.xlsx");
		wb.write(fos);
		fos.close();
		System.out.println("Done");
	}

}
