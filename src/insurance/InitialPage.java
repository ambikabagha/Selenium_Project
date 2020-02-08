
package insurance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitialPage {

	public static InitialPage ip = null;
	WebDriver driver = null;

	private InitialPage() {

	}

	public static InitialPage getInstance() {
		if (ip == null) {
			ip = new InitialPage();
		}
		return ip;
	}

	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\ JavaAmbi\\selenium software/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;

	}

}
