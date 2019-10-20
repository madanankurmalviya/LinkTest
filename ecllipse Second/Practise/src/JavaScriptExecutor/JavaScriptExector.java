package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptExector 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get("https://www.google.com");
		driver.get("https://www.youtube.com/watch?v=fmbatSJupuc");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript(" history.go(0)");
//		
//		String url = js.executeScript(" return document.URL; ").toString();
//		System.out.println("The url is :"+url);
//		
//		String title = js.executeScript(" return document.title;").toString();
//		System.out.println("The title is: "+title);
//		
//		String innerDocument = js.executeScript(" return document.documentElement.innerText;").toString();
//		System.out.println("The inner text :"+innerDocument);
//		
//		WebElement text = driver.findElement(By.xpath(".//input[@name='q']"));
//		js.executeScript(" arguments[0].value='Ankur Malviya'",text );
////		driver.close();
//		
		WebElement eleText = driver.findElement(By.xpath(".//div[contains(@class,'Yutt')]"));
		String TextElement= js.executeScript(" return arguments[0].innerText; ",eleText).toString();
		System.out.println("The Text Element is :"+TextElement);
//		
//		js.executeScript(" window.scrollBy(0,800)");
//		
//		js.executeScript("alert('Hello World')");
//		
//		Alert alt =driver.switchTo().alert();
//		alt.dismiss();
//		
//		Thread.sleep(2000);
		
//		WebElement search=driver.findElement(By.xpath(" .//div[@class='FPdoLc VlcLAe']/center/input[1][@class='gNO89b']"));
//		js.executeScript("arguments[0].click();", search);
//		
//		WebElement video = driver.findElement(By.xpath("(.//div[@jsname='haAclf'])[1]//a[contains(@href,'fmbatSJupuc')]"));
//		
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(video).click().build().perform();
		Thread.sleep(2000);
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		//check whether it is pause or play
//		
//		WebElement button = driver.findElement(By.xpath(".//button[@class='ytp-play-button ytp-button']"));
//		String at=button.getAttribute("tittle");
//		if(at=="Pause (k)")
//		{
//			button.click();
//		}
//				
//		WebElement skip =driver.findElement(By.xpath(".//div[@class='ytp-ad-text ytp-ad-skip-button-text']"));
//		
//		wait.until(ExpectedConditions.textToBePresentInElement(skip, "Skip Ads"));
//		js.executeScript("arguments[0].click();", skip);
//		if(at=="Pause (k)")
//		{
//			button.click();
//		}
//		Thread.sleep(3000);
		//driver.close();
	}

}
