package allDynamic_Xpath_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Child_Axes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ JavaAmbi\\selenium_software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com");
		WebElement toys = driver.findElement(By.xpath("//div[@class='hl-module hl-popular-destinations off-card hl-atf-module-js']/child::ul/child::li[4]/child::a/child::h3[@class='hl-popular-destinations-name']"));
		toys.click();
		WebElement diecast_And_Toy_Vehicles = driver.findElement(By.xpath("//div[@id=\"w7-xCarousel\"]/descendant::ul/descendant::li[2]"));
		diecast_And_Toy_Vehicles.click();
		WebElement abc = driver.findElement(By.xpath("//li[@id='w9-items[0]']//descendant::h3"));
		abc.click();		
	}

}
