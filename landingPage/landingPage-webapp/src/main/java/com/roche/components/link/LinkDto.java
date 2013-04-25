package com.roche.components.link;

import com.cognifide.cq.api.Dto;

public class LinkDto implements Dto{


	private String text;
	private String url;
	private String title;
	private String smallFlagFileName;
	private String smallFlagFileReference;
	private String bigFlagFileName;
	private String bigFlagFileReference;


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
	
	public String getSmallFlagFileName() {
		return smallFlagFileName;
	}
	public void setSmallFlagFileName(String smallFlagFileName) {
		this.smallFlagFileName = smallFlagFileName;
	}
	
	public String getSmallFlagFileReference() {
		return smallFlagFileReference;
	}
	public void setSmallFlagFileReference(String smallFlagFileReference) {
		this.smallFlagFileReference = smallFlagFileReference;
	}
	
	public String getBigFlagFileName() {
		return bigFlagFileName;
	}
	public void setBigFlagFileName(String bigFlagFileName) {
		this.bigFlagFileName = bigFlagFileName;
	}
	
	public String getBigFlagFileReference() {
		return bigFlagFileReference;
	}
	public void setBigFlagFileReference(String bigFlagFileReference) {
		this.bigFlagFileReference = bigFlagFileReference;
	}
	

}