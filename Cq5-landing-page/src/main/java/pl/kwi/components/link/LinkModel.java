package pl.kwi.components.link;

import com.cognifide.cq.api.Dto;
import com.cognifide.cq.model.mo.SingleDtoModelObject;

public class LinkModel<T extends Dto> extends SingleDtoModelObject<T> {


	private String text;
	private String url;
	private String title;


	public LinkModel(T dto) {
		super(dto);
		text = ((LinkDto)dto).getText();
		url = ((LinkDto)dto).getUrl();
		title = ((LinkDto)dto).getTitle();
	}


	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}


}