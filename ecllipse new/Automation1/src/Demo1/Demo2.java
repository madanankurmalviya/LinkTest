package Demo1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.ie.driver", ".\\Driver\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		Thread.sleep(2000);
		
		Dimension s = new Dimension(500,300);
		driver.manage().window().setSize(s);
		Thread.sleep(2000);
		
		Options a = driver.manage();
		Window w= a.window();
		w.maximize();
		Thread.sleep(1000);
		
		driver.navigate().to("https://mechanicalmentors.blogspot.com/");
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.close();
	}
}
