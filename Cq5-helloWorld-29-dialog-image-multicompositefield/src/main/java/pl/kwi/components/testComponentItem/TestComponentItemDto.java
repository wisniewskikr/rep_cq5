package pl.kwi.components.testComponentItem;

import com.cognifide.cq.api.Dto;

public class TestComponentItemDto implements Dto{
	
	
	private String fileName;
	private String fileReference;
    private String link;
	
    
    public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getFileReference() {
		return fileReference;
	}
	public void setFileReference(String fileReference) {
		this.fileReference = fileReference;
	}
	
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
       

}
