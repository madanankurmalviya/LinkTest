package Testing;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Data_04_May 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C://Users/Prafulla/Desktop/om.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
						
		int rowCount = sh.getLastRowNum()-sh.getFirstRowNum();
		
		for(int a = 0 ; a<= rowCount ;a++)
		{
			Row row = sh.getRow(a);
			for(int b = 0 ; b<row.getLastCellNum();b++)
			{
				System.out.println(row.getCell(b).getStringCellValue()+"||");
			}
			//System.out.println();
		}
		
		
		
	}
}
