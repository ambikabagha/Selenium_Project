package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
	WebDriver driver=null;

	
	  @Test 
	  public void test1() throws Exception { 
		  System.setProperty("webdriver.chrome.driver","D:\\ JavaAmbi\\selenium software/chromedriver.exe");
		  driver = new ChromeDriver(); 
		  driver.get("http://www.gmail.com"); 
		  driver.findElement(By.cssSelector("#identifierId")).clear();
		  driver.findElement(By.cssSelector("#identifierId")).sendKeys("ambikabagha19@gmail.com");
		  driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//input[@name='password']")).clear();
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rituritututulu");
		  driver.findElement(By.xpath("//div[@id='passwordNext']//span[@class='CwaK9']")).click();
	  }
	 
  @Test
  public void test2() {
	  System.setProperty("webdriver.chrome.driver", "D:\\ JavaAmbi\\selenium software/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com");

  }
  
}
