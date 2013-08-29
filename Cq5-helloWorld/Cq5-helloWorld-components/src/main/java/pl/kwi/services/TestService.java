package pl.kwi.services;


import java.util.HashMap;
import java.util.Map;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.Resource;

import com.day.cq.commons.jcr.JcrConstants;

@Service(value = ITestService.class)
@Component(immediate = true)
public class TestService implements ITestService {
	
	@Reference
	private INodeService nodeService;
	
	public String getHelloWorldMessage(Resource resource, String name) {
		
		String message = "Hello World " + name;
		System.out.println(message);
		return message;
		
	}
	
	public void saveNameInNode(String absPath, String name) {
		
		try {			
			
			Map<String, String> props = new HashMap<String, String>();
			props.put("name", name);
			nodeService.createOrUpdateNode(absPath, JcrConstants.NT_UNSTRUCTURED, props);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
