package pl.kwi.components.testComponent;

import com.cognifide.cq.api.Dto;

public class TestComponentDto implements Dto{
	
	
	private String[] textList;

	
	public String[] getTextList() {
		return textList;
	}
	public void setTextList(String[] textList) {
		this.textList = textList;
	}
	
	
}
