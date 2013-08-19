package pl.kwi.classes;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;


public class RedirectClass {
	
	private static final String REDIRECTED_PATH_PROP = "redirectedPath";

	public void redirect(SlingHttpServletRequest request, SlingHttpServletResponse response, Resource resource) {
		
		try {
			
			ValueMap map = resource.adaptTo(ValueMap.class);
			String redirectedPath = (String)map.get(REDIRECTED_PATH_PROP) + ".html";			
			response.sendRedirect(redirectedPath);
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
	}

}
