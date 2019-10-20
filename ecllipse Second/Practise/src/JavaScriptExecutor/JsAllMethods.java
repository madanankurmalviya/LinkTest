package JavaScriptExecutor;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JsAllMethods 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement ele =driver.findElement(By.xpath(".//input[contains(@class,'gLFyf gsfi')]"));
		WebElement ele1= driver.findElement(By.xpath("(.//input[contains(@class,'gNO89b')])[1]"));
//		String ab=js.executeScript(" return arguments[0].innerText; ",ele).toString();
//		System.out.println(ab);
		
		js.executeScript("alert('Om Ganeshay Nama:')");
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
		
		js.executeScript("arguments[0].value='Hello World' " , ele);
		js.executeScript("arguments[0].click(); ", ele1);
		//driver.close();
		
		
		
		
		
	}
}
