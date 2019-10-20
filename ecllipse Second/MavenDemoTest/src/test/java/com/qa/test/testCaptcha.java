package com.qa.test;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class testCaptcha
{
	
	public static void main (String[]args) throws TesseractException
	{
		ITesseract image = new Tesseract();
		image.setDatapath(".//tessdata");
		image.setLanguage("eng");
		try
			{
				String text=image.doOCR(new File("E://ANKUR MALVIYA/eclipse/ecllipse Second/Practise/ExcelFolder/picOne.png"));
				System.out.println(text);
			}
		catch (TesseractException e) 
		
			{
				System.err.println(e.getMessage());
			}
		
	}
}
