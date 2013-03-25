package pl.kwi;

import org.apache.sling.api.SlingHttpServletRequest;

public interface ITestService {
	
	public String getHelloWorldMessage(SlingHttpServletRequest slingRequest);

}
