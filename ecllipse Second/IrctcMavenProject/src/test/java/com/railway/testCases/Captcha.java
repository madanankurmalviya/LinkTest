package com.railway.testCases;

import java.io.File;

import org.testng.annotations.Test;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Captcha
{
	@Test
	public void Captcha() throws TesseractException
	{
		ITesseract image = new Tesseract();
		image.setDatapath(".//tessdata");
		image.setLanguage("eng");
		
		String Textt = image.doOCR(new File(".//Photo/captcha2.png"));
		
		System.out.println("The text of captcha - "+Textt);
		String str = Textt.replaceAll("^a-zA-Z0-9","");
		System.out.println(str);
	}
	

}
