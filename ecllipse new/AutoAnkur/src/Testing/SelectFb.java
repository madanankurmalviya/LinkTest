package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFb 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement date = driver.findElement(By.id("day"));	
		Select sel=new Select(date);
		sel.selectByValue("18");
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select sel1=new Select(month);
		sel1.selectByValue("5");
		Thread.sleep(1000);
		
		
		WebElement year = driver.findElement(By.id("year"));
		Select sel2=new Select(year);
		sel2.selectByValue("1993");
		
		Thread.sleep(1000);
		driver.close();
		
	}
	
}
