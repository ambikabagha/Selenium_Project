package selenium_All_features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ JavaAmbi\\selenium_software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/trains/14553");
		driver.findElements(By.xpath(".//table[@class='results']/tbody"));
		
	}

}
