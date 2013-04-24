package pl.kwi.components.textComponent;


import org.apache.commons.lang.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;

import com.cognifide.cq.api.Dao;
import com.cognifide.cq.api.ModelObject;
import com.cognifide.cq.model.dao.GenericSlingDao;
import com.cognifide.cq.presenter.AbstractPresenter;

public class TextComponentPresenter extends AbstractPresenter{
	
	private final Dao<TextComponentDto> dao = new GenericSlingDao<TextComponentDto>(TextComponentDto.class);

	@Override
	public ModelObject getModelFromResource(SlingHttpServletRequest request,
			Resource resource) {
		
		TextComponentDto dto = dao.getDtoOrNewOnError(resource);					
		return new TextComponentModel<TextComponentDto>(dto);
		
	}

}
