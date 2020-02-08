package insurance;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AmazonTest {
	
	@Test
	public void openAmazonPage() {
		InitialPage page=InitialPage.getInstance();
		WebDriver dr=page.openBrowser();
		
		dr.get("http://www.amazon.in");
	}

}
