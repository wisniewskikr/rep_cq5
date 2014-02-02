package pl.kwi.form.utils;

import org.apache.sling.api.resource.Resource;

public class FormUtil {
	
	public Model getModelWithResultComponentExist(Resource resource, String componentName) {
				
		Resource res = null;
		try {
			res = resource.getParent().getChild(componentName);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(res == null) {
			return new Model(false);
		}else {
			return new Model(true);
		}
		
	}

}
