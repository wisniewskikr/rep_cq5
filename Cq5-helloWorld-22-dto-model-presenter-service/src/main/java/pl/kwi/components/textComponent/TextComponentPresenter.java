package pl.kwi.components.textComponent;


import org.apache.commons.lang.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;

import pl.kwi.services.TestService;

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
				
		if(StringUtils.isEmpty(dto.getText())) {
			TestService testService = getSling(request).getService(TestService.class);
			dto.setText(testService.getDefaultText());
		}
			
		return new TextComponentModel<TextComponentDto>(dto);
		
	}

}
