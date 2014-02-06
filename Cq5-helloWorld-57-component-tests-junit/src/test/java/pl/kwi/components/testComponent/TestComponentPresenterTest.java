package pl.kwi.components.testComponent;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestComponentPresenterTest {
	
	
	private TestComponentPresenter presenter;
	
	
	@Before
	public void setUp() {
		presenter = new TestComponentPresenter();
	}
	

	@Test
	public void validate() {
		
		TestComponentDto dto = new TestComponentDto();
		dto.setTestComponentText("Test text");
		
		presenter.validate(dto);
		
		assertEquals("Test text", dto.getTestComponentText());
		
	}
	
	@Test
	public void validate_noText() {
		
		TestComponentDto dto = new TestComponentDto();
		dto.setTestComponentText(null);
		
		presenter.validate(dto);
		
		assertEquals("Put some text here!!!", dto.getTestComponentText());
		
	}

}
