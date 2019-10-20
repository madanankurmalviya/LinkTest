package Testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class AutoitNotepad 
{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		Runtime.getRuntime().exec("E://java/autoit/Notepad1.exe");
		Thread.sleep(500);
		
		TakesScreenshot tsh = null ;
		File src = tsh.getScreenshotAs(OutputType.FILE);
		File dest = new File("C://Desktop/Pic/pic1.jpeg");
		FileUtils.copyFile(src, dest);
		Thread.sleep(1000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_S);
		Thread.sleep(500);
		
		TakesScreenshot tsh1= null;
		File src1= tsh1.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C://Desktop/Pic/pic1.jpeg");
		FileUtils.copyFile(src1, dest1);
		Thread.sleep(1000);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_S);
		Thread.sleep(1000);
		
		Runtime.getRuntime().exec("E://java/autoit/Text.exe");
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		
		TakesScreenshot sht2= null;
		File scr2 = sht2.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("C://Desktop/Pic/Pic2.jpeg");
	    FileUtils.copyFile(scr2, dest2);
	    Thread.sleep(1000);
		
		
		
		
	}

}
