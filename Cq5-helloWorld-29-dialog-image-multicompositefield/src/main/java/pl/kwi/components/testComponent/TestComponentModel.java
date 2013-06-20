package pl.kwi.components.testComponent;

import java.util.List;

import pl.kwi.components.testComponentItem.TestComponentItemModel;

import com.cognifide.cq.api.Dto;
import com.cognifide.cq.model.mo.SingleDtoModelObject;

public class TestComponentModel<T extends Dto> extends SingleDtoModelObject<T> {

	
	private List<TestComponentItemModel> testComponents;
	
	
	public TestComponentModel(T dto, List<TestComponentItemModel> testComponents) {
		super(dto);
		this.testComponents = testComponents;
	}


	public List<TestComponentItemModel> getTestComponents() {
		return testComponents;
	}
	public void setTestComponents(List<TestComponentItemModel> testComponents) {
		this.testComponents = testComponents;
	}
	
			
}
