package pl.kwi.components.testComponentItem;


import com.cognifide.cq.model.mo.SingleDtoModelObject;

public class TestComponentItemModel extends SingleDtoModelObject<TestComponentItemDto>{
	
	
	
	 private String fileName;
	 private String fileReference;
	 private String link;
	

	public TestComponentItemModel(TestComponentItemDto dto) {
		super(dto);
		fileName = dto.getFileName();
        fileReference = dto.getFileReference();
        link = dto.getLink();
	}


	public String getFileName() {
		return fileName;
	}

	public String getFileReference() {
		return fileReference;
	}

	public String getLink() {
		return link;
	}
		

}
