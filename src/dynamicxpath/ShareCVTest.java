package dynamicxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShareCVTest {
	public static void main1(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\ JavaAmbi\\selenium_software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sharecv.co.in/");
		/*
		 * WebElement first_link = driver .findElement(By.xpath(
		 * ".//main[@id='main']/child::article[1]//child::header//child::h2//child::a"))
		 * ;
		 */

		WebElement first_link = driver
				.findElement(By.xpath(".//main[@id='main']/descendant::article[1]//descendant::a[2]"));
		first_link.click();
	}

	public static void main(String[] args) {
		int i = 0;
		for (i = i + 2, System.out.println(i); i < 5; System.out.println(i), i++) {

		}
	}
	

}


