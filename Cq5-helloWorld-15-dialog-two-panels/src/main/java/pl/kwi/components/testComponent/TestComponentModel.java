package pl.kwi.components.testComponent;

import com.cognifide.cq.api.Dto;
import com.cognifide.cq.model.mo.SingleDtoModelObject;

public class TestComponentModel<T extends Dto> extends SingleDtoModelObject<T> {

	
	private String text;
	private String name;
	
	
	public TestComponentModel(T dto) {
		super(dto);
		text = ((TestComponentDto)dto).getTestComponentText();
		name = ((TestComponentDto)dto).getName();
	}

	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	

}
