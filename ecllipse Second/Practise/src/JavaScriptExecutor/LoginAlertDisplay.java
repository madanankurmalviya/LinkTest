package JavaScriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class LoginAlertDisplay 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".//DriverAnkur/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('Om Ganeshay Nama:');");
		
		// handle popup
		Alert a = driver.switchTo().alert();
		System.out.println("The message is :"+a.getText());
		Thread.sleep(2000);
		a.dismiss();
		//To refresh
		Thread.sleep(2000);
		js.executeScript("history.go(0)");
	}	
}
