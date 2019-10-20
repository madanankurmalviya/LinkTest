package ExcelData;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAndWrite
{
	public static void main(String[]args) throws Exception

	{
		FileInputStream fis = new FileInputStream(".//ExcelFolder/Excel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("3");
		for(int r=1;r<11;r++)
		{
			Row rw = sh.getRow(r);
			Cell cl = rw.getCell(0);
			int data = (int) cl.getNumericCellValue();
			System.out.println(data);
			Row rw1 = sh.getRow(r);
			if(rw1==null)
			{
				rw1=sh.createRow(r);
			}
			Cell cl1=rw1.getCell(5);
			if(cl1==null)
			{
				cl1=rw1.createCell(5);
			}
			cl1.setCellValue(data);
			FileOutputStream fos = new FileOutputStream(".//ExcelFolder/Excel.xlsx");
			wb.write(fos);
		}
		
		
	}
}



