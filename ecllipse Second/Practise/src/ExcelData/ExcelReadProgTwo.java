package ExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadProgTwo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(".//ExcelFolder/Excel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row rw = sh.getRow(3);
		Cell cl = rw.getCell(1);
		String data = cl.getStringCellValue();
		ArrayList<String> list = new ArrayList<>();
		for(char ch :data.toCharArray())
		{
			String an = toSting(ch);
			System.out.println(an);
//			list.add(an);
//			System.out.println(list);
//			Collections.sort(list);
//			System.out.println(list);
//			Collections.reverse(list);
//			System.out.println(list);
		  
		}
		
		System.out.println(data);
		
		
		
	}

	private static String toSting(char ch) {
		// TODO Auto-generated method stub
		return null;
	}
}


