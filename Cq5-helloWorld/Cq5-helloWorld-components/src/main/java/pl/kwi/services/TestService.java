package pl.kwi.services;


import java.util.HashMap;
import java.util.Map;

import javax.jcr.Session;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;

import com.day.cq.commons.jcr.JcrConstants;

@Service(value = ITestService.class)
@Component(immediate = true)
public class TestService implements ITestService {
	
	@Reference
	private ResourceResolverFactory resolverFactory;
	
	@Reference
	private INodeService nodeService;
	
	public String getHelloWorldMessage(Resource resource, String name) {
		
		String message = "Hello World " + name;
		System.out.println(message);
		return message;
		
	}
	
	public void saveNameInNode(String absPath, String name) {
		
		try {
			
			ResourceResolver resolver = resolverFactory.getAdministrativeResourceResolver(null);
			Session session = resolver.adaptTo(Session.class);
			session.refresh(false);
			
			Map<String, String> props = new HashMap<String, String>();
			props.put("name", name);
			nodeService.createOrUpdateNode(session, absPath, JcrConstants.NT_UNSTRUCTURED, props);
			
			session.save();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
