package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmailautomation 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./DriverAnkur/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
		username.sendKeys("researchmalviya@gmail.com");
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		Thread.sleep(1000);
		
		pwd.sendKeys("Ganesha88@");
		
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		
		WebElement to = driver.findElement(By.xpath("//textarea[@name='to']"));
		
		to.sendKeys("researchmalviya@gmail.com");
		
		WebElement sub = driver.findElement(By.xpath("//input[@name='subjectbox']"));
		sub.sendKeys("Hello");
		
		WebElement txt = driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']"));
		txt.sendKeys("Om Ganeshay Nama:");
		txt.sendKeys("This is first autmoated test mail, send me reply if you got it.");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
		
		Thread.sleep(2000);
		driver.close();
		
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.gmail.com");
		
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement username1 = driver1.findElement(By.xpath("//input[@type='email']"));
		username1.sendKeys("researchmalviya@gmail.com");
		
		driver1.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		WebElement pwd1 = driver1.findElement(By.xpath("//input[@name='password']"));
		Thread.sleep(1000);
				
		pwd1.sendKeys("Ganesha88@");
		
		driver1.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(500);
		
		driver1.findElement(By.xpath("//a[@title='Inbox']")).click();
		Thread.sleep(1000);
		
		driver1.findElement(By.xpath("//div[@class='yW']")).click();
		Thread.sleep(500);
		
		driver1.findElement(By.xpath("//span[@class='ams bkG']")).click();
		Thread.sleep(500);
		
		WebElement to1 = driver1.findElement(By.xpath("//textarea[@name='to']"));
		to1.sendKeys("chandraprabha1805@gmail.com");
		
		driver1.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
		Thread.sleep(2000);
		
		driver1.close();
	}
	
}
