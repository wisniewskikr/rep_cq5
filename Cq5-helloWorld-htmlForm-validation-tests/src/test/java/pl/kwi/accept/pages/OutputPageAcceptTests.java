package pl.kwi.accept.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import pl.kwi.accept.abstr.AbstrPageAcceptTests;

public class OutputPageAcceptTests extends AbstrPageAcceptTests {

	public OutputPageAcceptTests(WebDriver driver, Wait<WebDriver> wait) {
		super(driver, wait);
	}

	@Override
	public void checkIfPageLoaded() {
		
		// Wait
        wait.until(ExpectedConditions.textToBePresentInElement(By.id("title"), "Hello World"));
        
        // Conditions
        title = driver.getTitle();
        assertEquals("Hello World - Output", title);
        text = driver.findElement(By.id("title")).getText();
        assertEquals("Hello World", text);
        text = driver.findElement(By.id("subtitle")).getText();
        assertEquals("Page: Output", text);
		
	}

}
