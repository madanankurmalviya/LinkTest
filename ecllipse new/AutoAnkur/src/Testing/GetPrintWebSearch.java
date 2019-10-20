package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetPrintWebSearch 
{
	private static final int SECONDS = 0;

	static 
	{
		System.setProperty("webdriver.chrome.driver","./DriverAnkur/chromedriver.exe");
		}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Om Ganeshay Nama");
		Thread.sleep(1000);
		
		List<WebElement> allsuggestion = driver.findElements(By.xpath("//span[contains(text(),'om ganeshay nama')]"));
		int count=allsuggestion.size();
		System.out.println(count);
		Thread.sleep(1000);
		WebElement target = driver.findElement(By.xpath(".//b[.='ganeshaya']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).click().perform();
		Thread.sleep(10, SECONDS);
		driver.close();
	}

}
