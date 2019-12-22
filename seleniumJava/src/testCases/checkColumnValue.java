package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkColumnValue {
	
	WebDriver driver;
	public void setup() throws Exception{
		
		driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("'https://developers.google.com/chart");
	} 
	
	
	public void checkColumnValue() throws InterruptedException{
		
		
		WebElement XaxisValues =driver
				.findElement(By.xpath("\"//*[name()='text'][@text-anchor='middle']\""));

		WebElement YaxisValues =driver
				.findElement(By.xpath("//*[name()='text'][@text-anchor='end']"));
		WebElement Sales =driver
				.findElement(By.xpath("//*[name()='svg'][@aria-label='A chart.']//*[name()='rect'][@fill='#3366cc']"));
		
		WebElement Expenses =driver
				.findElement(By.xpath("//*[name()='svg'][@aria-label='A chart.']//*[name()='rect'][@fill='#dc3912']"));
		WebElement ToolTip =driver
				.findElement(By.xpath("//*[name()='svg'][@aria-label='A chart.']/*[name()='g'][last()]"));
		
		
		System.out.println("Sales ");
		Sales.click();
		System.out.println(ToolTip.getText());
		System.out.println();
		
		System.out.println("Expense ");
		Expenses.click();
		System.out.println(ToolTip.getText());
		System.out.println();
		
		
		
		
		
		
	}

}
