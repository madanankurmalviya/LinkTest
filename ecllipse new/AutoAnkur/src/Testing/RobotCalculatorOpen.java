package Testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class RobotCalculatorOpen 
{

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		Robot r= new Robot();
		Clipboard cp = Toolkit.getDefaultToolkit().getSystemClipboard();
	    StringSelection ss = new StringSelection("CALCULATOR");
	    cp.setContents(ss, null);
	    r.keyPress(KeyEvent.VK_WINDOWS);
	    Thread.sleep(500);
	    r.keyRelease(KeyEvent.VK_WINDOWS);
	    Thread.sleep(1000);
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_V);
	    Thread.sleep(500);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_V);
	    Thread.sleep(1000);
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(500);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    r.keyPress(KeyEvent.VK_2);
	    Thread.sleep(500);
	    r.keyRelease(KeyEvent.VK_2);
	    Thread.sleep(1000);
	    r.keyPress(KeyEvent.VK_ADD);
	    Thread.sleep(500);
	    r.keyRelease(KeyEvent.VK_ADD);
	    Thread.sleep(1000);
	    r.keyPress(KeyEvent.VK_3);
	    Thread.sleep(500);
	    r.keyRelease(KeyEvent.VK_3);
	    Thread.sleep(1000);
	    r.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(500);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    r.keyPress(KeyEvent.VK_ALT);
	    r.keyPress(KeyEvent.VK_F4);
	    Thread.sleep(1000);
	    r.keyRelease(KeyEvent.VK_ALT);
	    r.keyRelease(KeyEvent.VK_F4);
	    
	    Thread.sleep(1000);
		
	}

}