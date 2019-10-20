package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrnShotVoteInk 
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
		driver.findElement(By.name("q")).sendKeys("Voter Ink finger Mark");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//div[@role='option']")).click();
		driver.close();
	}

}
