package insurance;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SnapDealTest {
	
	@Test
	public void openSnapDealPage() {
		InitialPage page=InitialPage.getInstance();
		WebDriver dr=page.openBrowser();
		dr.get("https://www.snapdeal.com/");
	}

}
