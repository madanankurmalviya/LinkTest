package JavaScriptExecutor;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutor 

{
	WebDriver driver;
	JavascriptExecutor js;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "E:/ANKUR MALVIYA/eclipse/eclipse new/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html?e=2");
		
		js = (JavascriptExecutor) driver;
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	@Test
	public void scrollPage()
	{
		driver.findElement(By.xpath(".//input[@name='username']")).sendKeys("ankur123");
		driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("test123");
		WebElement btn = driver.findElement(By.xpath(".//input[@type='submit']"));
		
		js.executeScript("argument[0].click", btn);
		
		js.executeScript("window.scrollBy(0,100)");
	}
	
	@Test
	public void generateAlert()
	{
		js.executeScript("alert('Hello World');");
		
		js.executeScript("history.go(0)");
		
	}
	

	@ Test(priority=1)
	public void doc()
	{
		driver.findElement(By.xpath(".//input[@name='username']")).sendKeys("ankur123");
		driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("test123");
		WebElement btn = driver.findElement(By.xpath(".//input[@type='submit']"));
		js.executeScript("hisory.go(0)");
		String str = js.executeScript("return document.document Element.innerText;").toString();
		System.out.println("The title is "+str);
	}
	
	
	@Test(priority=2)
	public void screenShot()
	{
		TakesScreenshot sht =(TakesScreenshot)driver;
		File src = sht.getScreenshotAs(OutputType.FILE);
		File dest = new File(".//Photos/Pic1.jpeg");
		FileUtils.copyFile(src,dest);
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}

