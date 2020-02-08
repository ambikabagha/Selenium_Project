package royalSundaramProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HealthInsurance {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\ JavaAmbi\\selenium software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.royalsundaram.in/");

		WebElement healthIns = driver.findElement(By.xpath("(//*[@id='carousel-selector-2'])[1]"));
		healthIns.click();

		WebElement calculatePremium = driver.findElement(By.linkText("Calculate Premium"));
		calculatePremium.click();

		WebElement planType = driver.findElement(By.xpath(
				"//select[@id='_com_rs_portlet_campaignlifeline_CampaignLifelineInsurancePortlet_calculatePremiumData-planType']"));
		Select sel = new Select(planType);
		List<WebElement> allplanTypes = sel.getOptions();
		int threeTypes = allplanTypes.size();
		for (int i = 0; i < threeTypes; i++) {
			String allplanTypesText = allplanTypes.get(i).getText();
			if (allplanTypesText.contains("Classic")) {
				allplanTypes.get(i).click();
			}

		}

		WebElement noOfAdults = driver.findElement(By.xpath("//select[@id='_com_rs_portlet_campaignlifeline_CampaignLifelineInsurancePortlet_calculatePremiumData-noOfAdults']"));
		Select sel1 = new Select(noOfAdults);
		List<WebElement> allnoOfAdults = sel1.getOptions();
		int twoTypes = allnoOfAdults.size();
		for (int i = 0; i < twoTypes; i++) {
			String allnoOfAdultsText = allnoOfAdults.get(i).getText();
			if (allnoOfAdultsText.contains("2")) {
				allnoOfAdults.get(i).click();
			}

		}

		WebElement sumInsured = driver.findElement(By.xpath("//select[@id='_com_rs_portlet_campaignlifeline_CampaignLifelineInsurancePortlet_calculatePremiumData-sumInsured']")); 
		Select sel2 = new Select(sumInsured);
		  List<WebElement> allSumInsured = sel2.getOptions();
		  int inLakhs = allSumInsured.size(); 
		  for (int i = 0; i <inLakhs; i++) { 
			  String allSumInsuredText = allSumInsured.get(i).getText();
			  if (allSumInsuredText.contains("4 Lakhs")) {
				  allSumInsured.get(i).click();
		     }
		  
		  }
		 
		WebElement city = driver.findElement(By.xpath("//div[@id='_com_rs_portlet_campaignlifeline_CampaignLifelineInsurancePortlet_cityName_chosen']"));
		WebElement div=city.findElement(By.className("chosen-drop"));
		WebElement divRes=div.findElement(By.className("chosen-results"));
		List<WebElement> subElmts=divRes.findElements(By.className("active-result"));
		for(WebElement e:subElmts) {
			if("BHUBANESHWAR".equals(e.getText())) {
				e.click();
			}
		}
		

	}

}
