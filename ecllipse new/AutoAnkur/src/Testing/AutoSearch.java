package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSearch
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("123");
		Thread.sleep(500);
	
		List<WebElement> allSuggestion = driver.findElements(By.xpath("//span[contains(text(),'123')]"));
		int count = allSuggestion.size();
		System.out.println("here are counts of the elements: "+count);
		//driver.findElement(By.name("btnK")).click();
		Thread.sleep(1000);
		
		
//driver.findElement(By.name("q")).sendKeys("1234567",Keys.ENTER)
		//Thread.sleep(1000);
		driver.close();	
	}
}