package pl.kwi.servlets;

import java.io.IOException;

import javax.servlet.ServletException;

import org.apache.commons.lang.StringUtils;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;

import pl.kwi.services.ITestService;


@Component(immediate=true, metatype=false, label="INPUT SERVLET")
@Service
@Properties(value = {
    @org.apache.felix.scr.annotations.Property(name="sling.servlet.methods", value={"POST"}),
    @org.apache.felix.scr.annotations.Property(name="sling.servlet.resourceTypes", value={"sling/servlet/default"}),
    @org.apache.felix.scr.annotations.Property(name="sling.servlet.selectors", value={"INPUT"}),
    @org.apache.felix.scr.annotations.Property(name="sling.servlet.extensions", value={"html"})
})
public class InputServlet extends SlingAllMethodsServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Reference
	private ITestService testService;

	@Override
	protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException,
			IOException {		
				
		String errorMessage = getErrorMessage(request);
		if(errorMessage != null) {
			String currentPagePath = request.getParameter("currentPagePath");
			response.sendRedirect(currentPagePath + ".html" + errorMessage);
			return;
		}
		
		String name = request.getParameter("name");
		String redirectPath = request.getParameter("redirectPath") + ".html?name=" + name;
		
		testService.getHelloWorldMessage(name);
		
		response.sendRedirect(redirectPath);
		
	}
	
	/**
	 * Method gets error field name.
	 * 
	 * @param request object SlingHttpServletRequest with request from browser
	 * @return object String with error field name
	 */
	protected String getErrorMessage(SlingHttpServletRequest request) {
				
		StringBuilder sb = new StringBuilder();		
		
		String name = request.getParameter("name");
		if(StringUtils.isBlank(name)) {
			sb.append("?errorField=name");
			return sb.toString();
		}
		
		return null;
		
	}

}
