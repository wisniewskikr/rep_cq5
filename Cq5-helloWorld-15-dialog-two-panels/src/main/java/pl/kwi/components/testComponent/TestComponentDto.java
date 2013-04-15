package pl.kwi.components.testComponent;

import com.cognifide.cq.api.Dto;

public class TestComponentDto implements Dto{
	
	
	private String testComponentText;
	private String name;

	
	public String getTestComponentText() {
		return testComponentText;
	}
	public void setTestComponentText(String testComponentText) {
		this.testComponentText = testComponentText;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		

}
