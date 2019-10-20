package ExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import java.util.ArrayList;

public class ReadWriteProg 

{
	public static void main (String []args) throws EncryptedDocumentException, IOException
	{
		
		ArrayList<String> list = new ArrayList<>();
	
		for(int a=0;a<10;a++)
		{
			FileInputStream fis = new FileInputStream(".//ExcelFolder/Excel.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet("Sheet2");
			Row rw = sh.getRow(a+1);
			Cell cl = rw.getCell(a);
			String data = cl.getStringCellValue();
			System.out.println(data);
			
		}
		//list.add(data);
		//System.out.println(a);
		System.out.println(list);
		
	}
}
