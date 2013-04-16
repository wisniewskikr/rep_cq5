package pl.kwi.components.testComponent;

import com.cognifide.cq.api.Dto;
import com.cognifide.cq.model.mo.SingleDtoModelObject;

public class TestComponentModel<T extends Dto> extends SingleDtoModelObject<T> {

	
	private String fileName;
	private String fileReference;
	
	
	public TestComponentModel(T dto) {
		super(dto);
		fileName = ((TestComponentDto)dto).getFileName();
		fileReference = ((TestComponentDto)dto).getFileReference();
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
