package pl.kwi.components.testComponent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;

import pl.kwi.components.testComponentItem.TestComponentItemDto;
import pl.kwi.components.testComponentItem.TestComponentItemModel;

import com.cognifide.cq.api.Dao;
import com.cognifide.cq.api.ModelObject;
import com.cognifide.cq.helper.ResourceHelper;
import com.cognifide.cq.model.dao.GenericSlingDao;
import com.cognifide.cq.presenter.AbstractPresenter;

public class TestComponentPresenter extends AbstractPresenter{
	
	private final Dao<TestComponentDto> testComponentDao = new GenericSlingDao<TestComponentDto>(TestComponentDto.class);
	private final Dao<TestComponentItemDto> testComponentItemDao = new GenericSlingDao<TestComponentItemDto>(TestComponentItemDto.class);

	@Override
	public ModelObject getModelFromResource(SlingHttpServletRequest request,
			Resource resource) {
		
		TestComponentDto dto = testComponentDao.getDtoOrNewOnError(resource);
		List<TestComponentItemModel> testComponents = getTestComponentItemsFromPath(resource, "testComponentItems");
		return new TestComponentModel<TestComponentDto>(dto, testComponents);
	}
	
	protected List<TestComponentItemModel> getTestComponentItemsFromPath(Resource resource, String relativePath) {
        List<TestComponentItemModel> list = new ArrayList<TestComponentItemModel>();
        if (resource != null) {
            final Resource linksResource = ResourceHelper.getRelativeResource(resource, relativePath);
            if (linksResource != null) {
                Iterator<Resource> children = linksResource.listChildren();
                while (children.hasNext()) {
                    Resource child = children.next();
                    TestComponentItemDto item = testComponentItemDao.getDtoOrNewOnError(child);
                    list.add(new TestComponentItemModel(item));
                }
            }
        }
        return list;
    }
	
	

}
