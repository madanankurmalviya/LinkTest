package ExcelFetchData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchExcelData 
{

  public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	    FileInputStream fis = new FileInputStream("./Excel/Sheet1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		{
		for(int a= 0 ; a<=3;a++) //a=row
		
			{
				for(int b =0 ; b<3;b++) //b=column
			
		    	{
		    		
		    		Sheet sh = wb.getSheet("Sheet1");
		    		Row rw = sh.getRow(a);
		    		Cell cl = rw.getCell(0);
		    		String data = cl.getStringCellValue();
		    		System.out.print(data+" ");

		    		
//		    		row=0 , col=0(Om)-1(Ganeshay)-2(Nama) during read
//		    		row=1 ,
		    	}	
		      System.out.println(" ");
			}
		}
		{
			for(int a=0;a<=3;a++)
			{
				for(int b=0;b<3;b++)
				{
				FileOutputStream fos = new FileOutputStream("./Excel/Sheet1.xlsx");
			    Sheet sht=wb.getSheet("Sheet1");
			    Row rww = sht.createRow(a+10);
			    Cell cll = rww.createCell(b);
			    cll.setCellValue(data);
			    wb.write(fos);
				}
			}
		}
	}
}


