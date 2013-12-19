package pl.kwi.utils;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;


public class RedirectUtil {
	
	private static final String REDIRECTED_PATH_PROP = "redirectedPath";

	/**
	 * Method redirects user to resource indicated by "redirectedPath" property.
	 * 
	 * @param request object <code>SlingHttpServletRequest</code> with request from browser
	 * @param response object <code>SlingHttpServletResponse</code> with response to browser
	 * @param resource object <code>Resource</code> with resource from current page
	 */
	public static void redirect(SlingHttpServletRequest request, SlingHttpServletResponse response, Resource resource) {
		
		try {
			
			ValueMap map = resource.adaptTo(ValueMap.class);
			String redirectedPath = (String)map.get(REDIRECTED_PATH_PROP) + ".html";			
			response.sendRedirect(redirectedPath);
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
	}

}
