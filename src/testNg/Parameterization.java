package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	WebDriver driver=null;
	@Test
	@Parameters({"url","emailId"})
	public void gmailLoginTest(String url,String emailId) {
		System.setProperty("webdriver.chrome.driver", "D:\\ JavaAmbi\\selenium software/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(url);
	    driver.findElement(By.id("identifierId")).clear();
	    driver.findElement(By.id("identifierId")).sendKeys("emailId");
	    driver.findElement(By.xpath("//*[@class='RveJvd snByac']")).click();
	}

}
