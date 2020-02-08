package insurance;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FlipkartTest {
	
	@Test
	public void openFlipkartPage() {
		InitialPage page=InitialPage.getInstance();
		WebDriver dr=page.openBrowser();
		dr.get("http://www.flipkart.com");
	}

}
