package pl.kwi.accept.main;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import pl.kwi.accept.pages.InputPageAcceptTests;
import pl.kwi.accept.pages.OutputPageAcceptTests;

public class AccptTests {
	
	private final static String PATH_HOST = System.getProperty("accept.host");
	private final static String PATH_CONTEXT = System.getProperty("accept.init.context");
	
	private InputPageAcceptTests inputPage;
	private OutputPageAcceptTests outputPage;
	
	@Before
	public void setUp(){

		WebDriver driver = new HtmlUnitDriver();
		Wait<WebDriver> wait = new WebDriverWait(driver, 10);
		
		inputPage = new InputPageAcceptTests(driver, wait);
		outputPage = new OutputPageAcceptTests(driver, wait);
		
	}
	
	@Test
	public void typeNameToInputPageAndCheckOutputPage() {
		
		inputPage.initBrowserByUrl(PATH_HOST + PATH_CONTEXT);
		
		inputPage.checkIfPageLoaded();
		inputPage.typeTextInFieldById("name", "Chris");
		inputPage.pressButtonById("ok");
		
		outputPage.checkIfPageLoaded();
		outputPage.checkTextInFieldById("textHelloWorld", "Hello World Chris");
		outputPage.pressButtonById("back");
		
		inputPage.checkIfPageLoaded();
		
	}

}
