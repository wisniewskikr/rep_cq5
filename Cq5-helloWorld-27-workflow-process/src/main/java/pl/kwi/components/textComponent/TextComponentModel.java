package pl.kwi.components.textComponent;

import com.cognifide.cq.api.Dto;
import com.cognifide.cq.model.mo.SingleDtoModelObject;

public class TextComponentModel<T extends Dto> extends SingleDtoModelObject<T> {

	
	private String text;
	
	
	public TextComponentModel(T dto) {
		super(dto);
		text = ((TextComponentDto)dto).getText();
	}

	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
		

}
