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

public class CompareTwoColAdd 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./Excel/Sheet3.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sht = wb.getSheet("Sheet1");
		int rwcnt = sht.getLastRowNum();
		for(int a= 0; a<rwcnt;a++)
		{
			int clcnt = sht.getRow(a).getLastCellNum();

			Cell cell = sht.getRow(a).getCell(1);
				String text="";
				if(cell.getCellType()==CellType.STRING)
				{
					text = cell.getStringCellValue();
				}
				if(cell.getCellType()==CellType.NUMERIC) 
				{
					text = String.valueOf(cell.getNumericCellValue());
				}
				if(cell.getCellType()==CellType.BLANK)
				{
					text=" ";
				}
				
				// do mathematical calculations
				
				if(Double.parseDouble(text)>1000)
				{
					sht.getRow(rwcnt).getCell(2).setCellValue("More than One Thousand");
				}
				else
				{
					sht.getRow(rwcnt).getCell(2).setCellValue("Less than Onethousand");
				}
	     	}
				
					fis.close();
					FileOutputStream fos =new FileOutputStream("./Excel/Sheet3.xlsx");
					wb.write(fos);
					fos.close();
							
			}
				
		
		
		
		
	}
