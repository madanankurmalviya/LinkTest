package others;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TestOne
{
	public static void main(String [] args)
{
		Tesseract instance = new Tesseract();
		instance.setDatapath("tessdata");
		instance.setLanguage("eng");
		try 
		{
			String result = instance.doOCR(dst);
			System.out.println(result);
		} 
		catch (TesseractException e) 
		{
			System.err.println(e.getMessage());
		}
	}
}