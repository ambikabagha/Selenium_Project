package allDynamic_Xpath_Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ JavaAmbi\\selenium_software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();        
        driver.get("http://demo.guru99.com/test/guru99home/");

        List<WebElement> dateBox = driver.findElements(By.xpath("//div[.//a[text()='SELENIUM']]/ancestor::div[@class='rt-grid-2 rt-omega']/following-sibling::div"));
        for (WebElement webElement : dateBox) {
            System.out.println(webElement.getText());
        }
        
	}

}
