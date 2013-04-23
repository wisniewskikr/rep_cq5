package pl.kwi.components.imageComponent;

import org.apache.commons.lang.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;

import com.cognifide.cq.api.Dao;
import com.cognifide.cq.api.ModelObject;
import com.cognifide.cq.model.dao.GenericSlingDao;
import com.cognifide.cq.presenter.AbstractPresenter;

public class ImageComponentPresenter extends AbstractPresenter{
	
	private final Dao<ImageComponentDto> dao = new GenericSlingDao<ImageComponentDto>(ImageComponentDto.class);

	@Override
	public ModelObject getModelFromResource(SlingHttpServletRequest request,
			Resource resource) {
		
		ImageComponentDto dto = dao.getDtoOrNewOnError(resource);					
		return new ImageComponentModel<ImageComponentDto>(dto);
	}

}
