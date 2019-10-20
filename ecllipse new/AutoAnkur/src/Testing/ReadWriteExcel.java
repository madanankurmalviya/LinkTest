package Testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ReadWriteExcel
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		try
		{
		File src = new File("./excel/Exp.xlsx");
		FileInputStream fis = new FileInputStream(src);
		new WorkbookFactory();
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Thread.sleep(1000);
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue()	);
		System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sh.getRow(1).getCell(0).getStringCellValue()	);
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
		System.out.println(sh.getRow(2).getCell(0).getStringCellValue()	);
		System.out.println(sh.getRow(2).getCell(1).getStringCellValue());
		sh.getRow(0).createCell(1).setCellValue("2");
		FileOutputStream fos=new FileOutputStream("./excel/Exp.xlsx");
		wb.write(fos);
		}
		catch (Exception e )
		{
			System.out.println("error"+e);
		}
	}

}
