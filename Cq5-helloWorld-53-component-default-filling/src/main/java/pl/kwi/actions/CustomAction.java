package pl.kwi.actions;

import java.io.IOException;
import java.util.Enumeration;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;

public class CustomAction {

	/**
	 * Method handles action from Input page.
	 * 
	 * @param request object <code>SlingHttpServletRequest</code> with request from page
	 * @param response object <code>SlingHttpServletResponse</code> with response to page
	 * @param resource object <code>Resource</code> with current page resource
	 * @throws IOException
	 */
	public void handleAction(SlingHttpServletRequest request, SlingHttpServletResponse response, Resource resource) throws IOException {
		
		String path = null;
		
		try {
			
			ValueMap map = resource.adaptTo(ValueMap.class);
			String pageAfterAction = map.get("pageAfterAction", String.class) + ".html";
			path = request.getResourceResolver().map(pageAfterAction);
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		String text = request.getParameter("text");
		response.sendRedirect(path + "?text=" + text);
		
	}

}
