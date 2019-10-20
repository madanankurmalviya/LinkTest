package Testing;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveAction
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("https://home.redbrickhealth.com/");
		 WebElement target = driver.findElement(By.xpath("//a[.='RedBrick Health']/../..//a[.='Results']"));
		 Thread.sleep(1000);
		 Actions act = new Actions(driver);
		 act.moveToElement(target).perform();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[.='Research']")).click();
		 Thread.sleep(1000);
		 driver.navigate().back();
		 driver.navigate().to("http://www.google.com");
		 Thread.sleep(1000);
		 driver.findElement(By.name("q")).sendKeys("Sony Music flipkart");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath(".//b[.=' system for home ']")).click();
		 Thread.sleep(2000);
		 driver.close();
	}

}
