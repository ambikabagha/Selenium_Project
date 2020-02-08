package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Include_ExcludeMethods {
	WebDriver driver=null;
	@Test
	public void testStep1() {
		System.setProperty("webdriver.chrome.driver", "D:\\ JavaAmbi\\selenium software/chromedriver.exe");
	    driver = new ChromeDriver();
	}
	@Test
	public void testStep2() {
		driver.get("https://www.google.com");
	}
	@Test
	public void testStep3() {
		String title=driver.getTitle();
		System.out.println(title);
	}

}
