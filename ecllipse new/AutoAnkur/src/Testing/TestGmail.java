package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGmail 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
		username.sendKeys("ankurmalviyatestmail@gmail.com");
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		Thread.sleep(1000);
		
		pwd.sendKeys("ankur@test");
		
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		
		WebElement to = driver.findElement(By.xpath("//textarea[@name='to']"));
		
		to.sendKeys("ankurmalviyatestmail@gmail.com");
		
		WebElement sub = driver.findElement(By.xpath("//input[@name='subjectbox']"));
		sub.sendKeys("Hello");
		
		WebElement txt = driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']"));
		txt.sendKeys("Hello Friends");
		txt.sendKeys("This is my first autmoated test mail.");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
		
		Thread.sleep(2000);
		driver.close();
	
	
	}
	
}
