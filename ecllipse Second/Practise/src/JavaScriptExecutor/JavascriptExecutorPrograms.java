package JavaScriptExecutor;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorPrograms
{
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".//DriverAnkur/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com");  //https://ankur:malviya@www.engprod-charter.net/
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('Hello World');");
		
		Alert a = driver.switchTo().alert();
		String txt = a.getText();
		System.out.println("The text is :"+txt);
		a.dismiss();
		
		driver.findElement(By.xpath(".//input[@name='q']")).sendKeys("Ankur Malviya");
		WebElement button = driver.findElement(By.xpath(".//a[@title='Google apps']"));
		
		js.executeScript("arguments[0].click();", button);
		
		
		String title = js.executeScript("return document.title;").toString();
		String url = js.executeScript("return document.URL;").toString();
		String innerTxt = js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println("The title is :"+title+"\t"+url+"  "+innerTxt);
		js.executeScript("window.scrollBy(0,100)");
		js.executeScript("window.location = 'https://www.facebook.com'");
		Thread.sleep(3000);
		js.executeScript("history.go(0)");
		
		WebElement fbElement = driver.findElement(By.xpath(".//input[@type='email']"));
		
		//js.executeScript("document.getElementById('email').value='ankur'");
		WebElement fbButtn = driver.findElement(By.xpath(".//input[@id='u_0_4']"));
		js.executeScript("arguments[0].setAttribute().value='hello';",fbElement);
		
		Thread.sleep(3000);
		
		
		
	}
}
