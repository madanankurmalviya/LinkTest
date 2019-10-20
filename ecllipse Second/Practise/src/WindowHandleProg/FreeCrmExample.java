package WindowHandleProg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCrmExample {



	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", ".//DriverAnkur/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com/index.html?e=2");
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		Thread.sleep(1000);
		//username.clear();
		Thread.sleep(2000);
		username.sendKeys("ankur88");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		//password.clear();
				
		password.sendKeys("test123");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//td[text()='Name']//following-sibling::td[@align='left']//input[@type='text']")).sendKeys("Ankur Malviya");
		driver.findElement(By.xpath("//td[text()='Email']//parent::tr//td[@align='left']//input[@type='text']")).sendKeys("ankur@gmail.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		String name=driver.findElement(By.xpath("//td[text()='Owner']//following-sibling::td//select[@name='by_user']")).getText();
		
		System.out.println(name.trim());
		
		FileInputStream fis = new FileInputStream(".//ExcelFolder/Excel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sht = wb.getSheet("Sheet3");
		Row rw = sht.getRow(1);
		if(rw==null)
		{
			rw=sht.createRow(1);
		}
		Cell cl = rw.getCell(1);
		if(cl==null)
		{
			cl=rw.createCell(1);
		}
		cl.setCellValue(name.trim());
		FileOutputStream fos = new FileOutputStream(".//ExcelFolder/Excel.xlsx");
		wb.write(fos);
		fos.close();
		System.out.println("Its Done Man");
		
		Sheet sht1 = wb.getSheet("Sheet2");
		Row rw1 = sht1.getRow(2);
		Cell cl1 = rw1.getCell(2);
		String data = cl1.getStringCellValue();
		System.out.println(data);
		
		driver.findElement(By.xpath("//td[text()='Notes']//following-sibling::td//input[@type='text']")).sendKeys(data);
				
		
	
		
		
		
		
		//driver.close();
	
	}
}
