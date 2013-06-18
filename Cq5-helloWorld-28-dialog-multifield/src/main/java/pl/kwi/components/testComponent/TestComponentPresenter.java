package pl.kwi.components.testComponent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;

import com.cognifide.cq.api.Dao;
import com.cognifide.cq.api.ModelObject;
import com.cognifide.cq.model.dao.GenericSlingDao;
import com.cognifide.cq.presenter.AbstractPresenter;

public class TestComponentPresenter extends AbstractPresenter{

	
	private final Dao<TestComponentDto> testComponentDao = new GenericSlingDao<TestComponentDto>(TestComponentDto.class);

	
	@Override
	public ModelObject getModelFromResource(SlingHttpServletRequest request,
			Resource resource) {
		
		TestComponentDto dto = testComponentDao.getDtoOrNewOnError(resource);
		return new TestComponentModel<TestComponentDto>(dto);
	}
	

}
