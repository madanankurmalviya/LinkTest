package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTripPro {
	static
	{
		System.setProperty("webdriver.chrome.driver","./DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='May']/../../..//a[.='28']")).click();
		Thread.sleep(10000);
	}

}
