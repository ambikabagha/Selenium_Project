package listener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(EventListener.class)
public class EventTest {
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "D:\\ JavaAmbi\\selenium software/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.amazon.in");
		Assert.assertEquals("test", "test1");
	}
}
