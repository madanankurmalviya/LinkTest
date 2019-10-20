package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAnkurCells
{
	static
	{
		System.setProperty("webdriver.chrome.driver",".//DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/java/html/table.html");
		Thread.sleep(1000);
		
	//	String xp = "//table[@id ='t1']//td";
		
		List<WebElement> allcells = driver.findElements(By.xpath("//table[@id ='t2']//td[1]"));
		
		
		for (WebElement cell:allcells)
		{
			String text = cell.getText();
			System.out.println("The text are: "+text);
						
		}
		Thread.sleep(1000);
		driver.close();
	}

}
