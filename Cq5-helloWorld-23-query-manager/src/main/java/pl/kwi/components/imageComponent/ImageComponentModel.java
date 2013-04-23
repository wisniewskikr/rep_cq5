package pl.kwi.components.imageComponent;

import com.cognifide.cq.api.Dto;
import com.cognifide.cq.model.mo.SingleDtoModelObject;

public class ImageComponentModel<T extends Dto> extends SingleDtoModelObject<T> {

	
	private String fileName;
	private String fileReference;
	
	
	public ImageComponentModel(T dto) {
		super(dto);
		fileName = ((ImageComponentDto)dto).getFileName();
		fileReference = ((ImageComponentDto)dto).getFileReference();
	}

	
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
