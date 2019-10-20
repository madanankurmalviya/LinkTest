package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelAllOption
{
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E:/java/html/dropdown.html");
		Thread.sleep(1000);
		WebElement sel = driver.findElement(By.id("A2B"));
		Select sel1=new Select(sel);
		sel1.selectByIndex(0);
		sel1.selectByIndex(1);
		sel1.selectByIndex(2);
		List<WebElement> option = sel1.getAllSelectedOptions();
		int count = option.size();
		System.out.println("Here the size are : "+count);
		for(int a=0;a<count;a++)
		{
			WebElement ap = option.get(a);
			String text = ap.getText();
			System.out.println("The text are : "+text);
		}
		Thread.sleep(1000);;
		driver.close();
	}

}
