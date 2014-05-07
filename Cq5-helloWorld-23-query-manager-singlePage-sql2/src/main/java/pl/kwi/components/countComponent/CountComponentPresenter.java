package pl.kwi.components.countComponent;

import org.apache.commons.lang.StringUtils;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;

import pl.kwi.services.TestService;

import com.cognifide.cq.api.Dao;
import com.cognifide.cq.api.ModelObject;
import com.cognifide.cq.model.dao.GenericSlingDao;
import com.cognifide.cq.presenter.AbstractPresenter;

public class CountComponentPresenter extends AbstractPresenter{
	
		
	private final Dao<CountComponentDto> dao = new GenericSlingDao<CountComponentDto>(CountComponentDto.class);

	
	@Override
	public ModelObject getModelFromResource(SlingHttpServletRequest request,
			Resource resource) {
		
		CountComponentDto dto = dao.getDtoOrNewOnError(resource);
		
		TestService testService = getSling(request).getService(TestService.class);
		dto.setText(testService.getTagsCount());
				
		return new CountComponentModel<CountComponentDto>(dto);
		
	}
	

}
