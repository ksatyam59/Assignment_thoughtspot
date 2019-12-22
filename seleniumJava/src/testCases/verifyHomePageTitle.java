package testCases;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class verifyHomePageTitle {
	
	
	
   public void verifyTitle()
		{
			
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.cricbuzz.com/");
			
			String actual_title=driver.getTitle();
			
			System.out.println("Title is"+actual_title);
			
			//String expected_title="Cricket Score, Schedule, Latest News, Stats & Videos | Cricbuzz.com";
			
			
			//Assert.assertEquals(actual_title, expected_title);
			
			
			Assert.assertTrue(actual_title.contains("Cricket Score, Schedule, Latest News, Stats & Videos | Cricbuzz.com"));
			
			System.out.println("Test completed-Page Verified");
			
			
		}

	}


}
