package ExcelFetchData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelAdditionData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./Excel/Sheet3.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sht = wb.getSheet("Sheet1");
		int rw = sht.getLastRowNum();
		int celltext = 0;
		for(int a= 0 ; a < rw ; a++)
		{
			Cell cl = sht.getRow(a).getCell(1);  // here the get the value of cell (1)
		 
			
			
			if(cl.getCellType()==CellType.NUMERIC)
			{
				celltext = (int) cl.getNumericCellValue();
			}
			else if (cl.getCellType()==CellType.STRING)
			{
				String celltext1 = cl.getStringCellValue();
			}
			else if (cl.getCellType()==CellType.BLANK)
			{
				String celltext3="";
			}
		
			//  The initialization of Multiplication process
			  sht.getRow(a).getCell(2).setCellValue(celltext*2);
			
		}
			
			fis.close();
			FileOutputStream fos = new FileOutputStream("./Excel/Sheet3.xlsx");
			wb.write(fos);
			fos.close();
		}
		
}

