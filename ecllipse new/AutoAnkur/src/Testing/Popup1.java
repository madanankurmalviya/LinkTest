package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Popup1
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
		driver.get("https://home.redbrickhealth.com/");
		WebElement target = driver.findElement(By.xpath("//a[.='RedBrick Health']/../..//a[.='Solutions']"));
		Thread.sleep(1000);
		 Actions act=new Actions(driver);
		 act.moveToElement(target).perform();
		 driver.findElement(By.xpath("//a[.='Problems We Solve']")).click();
		 Thread.sleep(1000);
		 driver.close();
	}

}
