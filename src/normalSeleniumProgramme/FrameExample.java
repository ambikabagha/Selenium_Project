package normalSeleniumProgramme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ JavaAmbi\\selenium software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.quackit.com/javaScript/javascript_alert_box.cfm");
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//*[@value='Click me']")).click();
		String text4mAlertBox=driver.switchTo().alert().getText();
		System.out.println(text4mAlertBox);
		driver.switchTo().alert().accept();
	}

}
