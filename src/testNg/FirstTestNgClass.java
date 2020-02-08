package testNg;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FirstTestNgClass {
	
	WebDriver driver=null;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\ JavaAmbi\\selenium software/chromedriver.exe");
	    driver = new ChromeDriver();
	  
	}
	
  @Test
  public void openSite() {
	  driver.get("http://naukri.com");
	  Set<String> ids=driver.getWindowHandles();
	  for (String id : ids) {
		  driver.switchTo().window(id);
		  String titleOfThePage=driver.getTitle();
		  if (titleOfThePage.contains("Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com")) {
			  System.out.println("pass");
			  break;
			
		}
	}
  }
  
  @AfterMethod
  public void tearDown() {
		driver.close();
	}
}
