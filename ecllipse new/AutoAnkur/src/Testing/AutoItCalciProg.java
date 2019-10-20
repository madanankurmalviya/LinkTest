package Testing;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItCalciProg 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/download");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h2[.='Downloads']/..//a[.='3.141.59']")).click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("E://java/autoit/winpopup.exe");
		Thread.sleep(500);
	}

}
