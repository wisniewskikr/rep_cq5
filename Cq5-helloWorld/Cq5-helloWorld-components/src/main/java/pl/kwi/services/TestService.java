package pl.kwi.services;


import java.util.HashMap;
import java.util.Map;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;

import com.day.cq.commons.jcr.JcrConstants;

@Service(value = ITestService.class)
@Component(immediate = true)
public class TestService implements ITestService {
	
	@Reference
	private INodeService nodeService;
	
	/* (non-Javadoc)
	 * @see pl.kwi.services.ITestService#saveNameInNode(java.lang.String, java.lang.String)
	 */
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
