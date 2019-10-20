package others;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InputExcelData 
{
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream fis = new FileInputStream(".//ExcelFolder/Excel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet2");
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int a = 0 ; a<10 ;a++)
		{	
			Row rw = sh.getRow(a+1);
			Cell cl = rw.getCell(0);
			String data1 = cl.getStringCellValue();
			//System.out.println(data1);
			list.add(data1);
		}
		System.out.println(list);
		HashMap<String,Integer> hm = new HashMap<>();
		for(String ls:list)
		{
			hm.put(ls,ls.length());
		}
		System.out.println(hm);
		
		LinkedList<Entry<String , Integer>> ll = new LinkedList<Entry<String,Integer>>(hm.entrySet());
		Collections.sort(ll,new Comparator<Entry <String , Integer>>()
				
				{
					public int compare(Entry<String,Integer>a1 , Entry<String,Integer>a2)
					{
						return a1.getValue().compareTo(a2.getValue());
					}
				});
		System.out.println(ll);	
	}
}
