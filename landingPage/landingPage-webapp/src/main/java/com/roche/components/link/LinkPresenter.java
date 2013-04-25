package com.roche.components.link;

import org.apache.commons.lang.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;

import com.cognifide.cq.api.Dao;
import com.cognifide.cq.api.ModelObject;
import com.cognifide.cq.model.dao.GenericSlingDao;
import com.cognifide.cq.presenter.AbstractPresenter;

public class LinkPresenter extends AbstractPresenter{

	private final Dao<LinkDto> dao = new GenericSlingDao<LinkDto>(LinkDto.class);

	@Override
	public ModelObject getModelFromResource(SlingHttpServletRequest request,
			Resource resource) {

		LinkDto dto = dao.getDtoOrNewOnError(resource);
		return new LinkModel<LinkDto>(dto);
	}


}