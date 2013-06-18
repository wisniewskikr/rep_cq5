package pl.kwi.components.testComponent;

import com.cognifide.cq.api.Dto;
import com.cognifide.cq.model.mo.SingleDtoModelObject;

public class TestComponentModel<T extends Dto> extends SingleDtoModelObject<T> {
	
	
	private String[] textList;

	
	public TestComponentModel(T dto) {
		super(dto);
		this.textList = ((TestComponentDto)dto).getTextList();
	}


	public String[] getTextList() {
		return textList;
	}
	public void setTextList(String[] textList) {
		this.textList = textList;
	}
		
			
}
