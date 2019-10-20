package Testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExmp
{
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/java/html/Sample%20Test%20Page.html");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		Thread.sleep(500);
		Alert alt = driver.switchTo().alert();
		Thread.sleep(500);
		alt.accept();
		
		driver.findElement(By.cssSelector("button[onclick^='gen']")).click();
		Thread.sleep(500);
		Alert alt1= driver.switchTo().alert();
		String a = alt1.getText();
		System.out.println("Here are the print: "+a);
		
		alt1.dismiss();
		driver.close();
	}

}
