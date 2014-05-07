package pl.kwi.components.countComponent;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;

import pl.kwi.services.TestService;

import com.cognifide.cq.api.Dto;
import com.cognifide.cq.model.mo.SingleDtoModelObject;


public class CountComponentModel<T extends Dto> extends SingleDtoModelObject<T> {


	private String text;

	
	public CountComponentModel(T dto) {
		super(dto);
		text = ((CountComponentDto)dto).getText();
	}

	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
		

}
