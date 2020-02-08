package parallelTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTesting {
	WebDriver driver=null;
  @Test
  @Parameters("browser")
  public void setUp(String browser) {
	  if (browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "D:\\ JavaAmbi\\selenium software/chromedriver.exe");
		  driver=new ChromeDriver();
	}
	  else if (browser.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
	}
  }
  
  @Test
  public void openPage() throws Exception {
	  driver.get("https://gmail.com");
	  driver.findElement(By.cssSelector("#identifierId")).clear();
	  driver.findElement(By.cssSelector("#identifierId")).sendKeys("ambikabagha19@gmail.com");
	  driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//input[@name='password']")).clear();
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rituritututulu");
	  driver.findElement(By.xpath("//div[@id='passwordNext']//span[@class='CwaK9']")).click();
  }
}
