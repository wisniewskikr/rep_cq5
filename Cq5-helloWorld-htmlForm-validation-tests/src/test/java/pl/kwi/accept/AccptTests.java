package pl.kwi.accept;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccptTests {
	
	private InputAcceptTestPage inputPage;
	
	@Before
	public void setUp(){

		WebDriver driver = new HtmlUnitDriver();
		Wait<WebDriver> wait = new WebDriverWait(driver, 10);
		
		inputPage = new InputAcceptTestPage(driver, wait);

	}
	
	@Test
	public void typeNameToInputPageAndCheckOutputPage() {
		
		inputPage.initBrowserByUrl("http://localhost:4503/content/accept/webapp.html");
		
		inputPage.checkIfPageLoaded();		
		
	}

}
