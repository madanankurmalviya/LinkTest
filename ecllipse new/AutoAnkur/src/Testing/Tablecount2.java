package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablecount2 

{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("file:///E://java/html/table.html");
		Thread.sleep(1000);
		List<WebElement> tabble = driver.findElements(By.xpath("//table"));
		int count = tabble.size();
		System.out.println("Here are the count of the table: "+count);
		Thread.sleep(1000);
		driver.close();
	}

}
