package Testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class RobCal 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_WINDOWS);
		Thread.sleep(500);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_C);
		Thread.sleep(500);
		r.keyRelease(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(500);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_L);
		Thread.sleep(500);
		r.keyRelease(KeyEvent.VK_L);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
