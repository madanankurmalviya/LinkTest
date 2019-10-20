package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchDriver 
{	
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
	}
	

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E://java/html/page1.html");
		Thread.sleep(1000);
		driver.findElement(By.id("fn")).sendKeys("Ankur");
		driver.switchTo().frame(0);
		driver.findElement(By.id("mn")).sendKeys("Malviya");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("ln")).sendKeys("Bhilai");
		Thread.sleep(1000);
		driver.close();
	}

}
