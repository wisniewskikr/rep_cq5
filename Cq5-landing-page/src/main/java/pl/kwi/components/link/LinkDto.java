package pl.kwi.components.link;

import com.cognifide.cq.api.Dto;

public class LinkDto implements Dto{


	private String text;
	private String url;
	private String title;


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