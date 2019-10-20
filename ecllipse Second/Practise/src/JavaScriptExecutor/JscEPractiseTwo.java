package JavaScriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
public class JscEPractiseTwo
{
	public static void main(String[]args) throws InterruptedException, IOException, TesseractException
	{
		System.setProperty("webdriver.chrome.driver",".//DriverAnkur/chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(opt);
		WebDriverWait wait = new WebDriverWait(driver,10);
				
		driver.get("https://www.irctc.co.in/nget/train-search");
		//wait.until(ExpectedConditions.titleIs("Google"));
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		JavascriptExecutor  js =  (JavascriptExecutor)driver;
		
//		String innerText=js.executeScript("return document.documentElement.innerText; ").toString();
//		System.out.println("The inner text is: "+innerText);
//		
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println("The title is :"+title);
//		
//		String url = js.executeScript("return document.URL;").toString();
//		System.out.println("The url is :"+url);
		
		// enter xpath :  .//i[@class='fa fa-align-justify']/../../..//div[@class='h_menu_drop_button hidden-xs']
		
		// Login : //button[text()="LOGIN"]
		
//		Alert alt = driver.switchTo().alert();
//		alt.dismiss();
		
		WebElement threeButton = driver.findElement(By.xpath(".//i[@class='fa fa-align-justify']/../../..//div[@class='h_menu_drop_button hidden-xs']"));
		
		Actions act =  new Actions(driver);
		act.moveToElement(threeButton).click().build().perform();
		
		
		WebElement btt = driver.findElement(By.xpath(".//button[text()='LOGIN']"));
		
		act.moveToElement(btt).click().build().perform();
		
		
		
//		// Enter the value in tab
//		js.executeScript(" document.getElementById('userId').value='mlankur';");
//		
//		//Enter password
//		js.executeScript(" document.getElementById('pwd').value='malviya';");
//		
		
		
		WebElement log = driver.findElement(By.xpath(" .//button[text()='SIGN IN'] "));
		js.executeScript(" arguments[0].click();",log );
		
				WebElement shht = driver.findElement(By.xpath(".//img[@id='captchaImg']"));
				Thread.sleep(3000);
				TakesScreenshot sht = (TakesScreenshot)shht;
				File src =sht.getScreenshotAs(OutputType.FILE);
				File dest = new File(".//ExcelFolder/picOne.png");
				FileUtils.copyFile(src, dest);
		
		ITesseract image = new Tesseract();
		image.setDatapath(".//tessdata");
		image.setLanguage("eng");
		
		String Textt = image.doOCR(dest);
		
		System.out.println("The text of captcha by prabha kumari- "+Textt);
		
		String[] str = Textt.split("below.");
		String st = str[1].replaceAll(" ", "");
		
		for(int a = 0 ; a<st.length(); a++)
		{
			if(st.charAt(a))
			{
				
			}
		}
		System.out.println("The pure text is-"+st);
		
		//		driver.close();
	}

	
	}
}
