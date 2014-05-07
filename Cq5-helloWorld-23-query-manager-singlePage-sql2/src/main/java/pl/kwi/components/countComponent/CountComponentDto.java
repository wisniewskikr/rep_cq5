package pl.kwi.components.countComponent;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;

import pl.kwi.services.TestService;

import com.cognifide.cq.api.Dto;


public class CountComponentDto implements Dto{
	
	
	private String text;
	
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
		

}
