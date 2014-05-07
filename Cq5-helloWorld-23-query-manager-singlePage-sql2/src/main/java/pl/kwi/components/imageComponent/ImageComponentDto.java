package pl.kwi.components.imageComponent;

import com.cognifide.cq.api.Dto;

public class ImageComponentDto implements Dto{
	
	
	private String fileName;
	private String fileReference;
	
	
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
		

}
