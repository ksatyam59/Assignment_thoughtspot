package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver();
	
	

	

	public class pieChart {

		WebDriver driver;
		public void setup() throws Exception{
			
			driver =new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://yuilibrary.com/yui/docs/charts/charts-pie.html");
		} 
		
		public void PieChart() throws InterruptedException{
			WebElement VioleteColor =driver
					.findElement(By.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#66007f']"));
			WebElement GreenColor =driver
					.findElement(By.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#295454']"));
			WebElement GreyColor =driver
					.findElement(By.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#e8cdb7']"));
			WebElement LightVioleteColor =driver
					.findElement(By.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#996ab2']"));
			WebElement BrownColor =driver
					.findElement(By.xpath("//*[contains(@class,'yui3-svgSvgPieSlice')][@fill='#a86f41']"));
			
			
			WebElement ToolTip= driver.findElement(By.xpath("//div[contains(%id,'_tooltip')]"));
			
			System.out.println(" Violete Part ");
			VioleteColor.click();
			System.out.println(ToolTip.getText());
			System.out.println();
			
			System.out.println(" Grey Part ");
			GreyColor.click();
			System.out.println(ToolTip.getText());
			System.out.println();
			
			System.out.println(" Green Part ");
			GreenColor.click();
			System.out.println(ToolTip.getText());
			System.out.println();
			
			System.out.println(" LightViolete Part ");
			LightVioleteColor.click();
			System.out.println(ToolTip.getText());
			System.out.println();
			
			System.out.println(" Brown Part ");
			BrownColor.click();
			System.out.println(ToolTip.getText());
			System.out.println();
			
			
			
			
			
		}
	}

}
