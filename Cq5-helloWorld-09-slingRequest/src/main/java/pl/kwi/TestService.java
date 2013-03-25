package pl.kwi;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;

public class TestService implements ITestService {

	public String getHelloWorldMessage(SlingHttpServletRequest slingRequest) {
		
		Resource resource = slingRequest.getResource();
		String name = resource.getName();
		System.out.println(name);
		
		return "Hello World from class TestService";
	}

}
