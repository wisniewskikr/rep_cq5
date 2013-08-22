package pl.kwi.accept.abstr;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public abstract class AbstrPageAcceptTests {
	
	protected WebDriver driver;
	protected Wait<WebDriver> wait;
	protected String text;
	protected String title;
	
	
	public AbstrPageAcceptTests(WebDriver driver, Wait<WebDriver> wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	/**
	 * Method checks if current page is loaded.
	 */
	public abstract void checkIfPageLoaded();
	
	/**
	 * Method inits browser with specified url.
	 * 
	 * @param url object String with url which starts browser
	 */
	public void initBrowserByUrl(String url) {
		driver.get(url);
	}
	
	/**
	 * Method types text into field with specified id.
	 * 
	 * @param id object String with field id
	 * @param text object String with typed text
	 */
	public void typeTextInFieldById(String id, String text) {
		driver.findElement(By.id(id)).sendKeys(text);
	}
	
	/**
	 * Method checks if text is placed into field with specified id
	 * 
	 * @param id object String with field id
	 * @param expectedText object String with expected text
	 */
	public void checkTextInFieldById(String id, String expectedText) {
		text = driver.findElement(By.id(id)).getText();
        assertEquals(expectedText, text);
	}
	
	/**
	 * Method presses button with specified id
	 * 
	 * @param id object String with id of button
	 */
	public void pressButtonById(String id) {
		driver.findElement(By.id(id)).click();
	}

}
