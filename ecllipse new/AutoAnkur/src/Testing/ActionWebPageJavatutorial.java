package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionWebPageJavatutorial
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./DriverAnkur/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?source=hp&ei=nSS4XJHhIZbd9QPG6oHYDg&q=ink+pen+refills&oq=ink&gs_l=psy-ab.1.5.35i39j0i67j0i131j0i67j0i20i263j0i67l3j0l2.1108.1403..290140...3.0..0.1552.2820.2-1j0j1j1j8-1......0....1..gws-wiz.0q4al0LVi7c");
		Thread.sleep(1000);
		//driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//cite[.='https://www.amazon.in/Pens-n-Refills/b?ie=UTF8&amp;node=3591085031']")).click();
//		Thread.sleep(1000);
//		Actions act=new Actions(driver);
//		Thread.sleep(1000);
//		act.click(button).perform();
//		Thread.sleep(1000);
		driver.close();
	}

}
