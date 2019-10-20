package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrabhaLovesAnkur 
{
static
{
	System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
}


	public static void main(String[] args) throws InterruptedException
	
	{
	 System.out.println("Ankur Loves Prabha");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://www.google.com/");
	 
	 driver.findElement(By.name("q")).sendKeys("qspiders");
	 Thread.sleep(1000);
	 List<WebElement> allSuggestion = driver.findElements(By.xpath("//span[contains(text(),'ers')]"));
	 int count=allSuggestion.size();
	 System.out.println("paddu ka count hai ="+count);
 
	 
	 for(WebElement suggestion:allSuggestion)
	{
		 
		 String text = suggestion.getText();
		 System.out.println(text);
		 //if(text.equals("qspiders btm"))
		 //{
			//suggestion.click();
			//break;
		// }
	 
	 }
	 
	 //allSuggestion.get(count-1).click();
	 Thread.sleep(1000);
     driver.close();
	}
	
}
