package pl.kwi.utils;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;

public class ResourceUtil {
	
	public static String getResourceProperty(Resource resource, String propertyName) {
		
		String result = null;
		
		try {
			
			ValueMap map = resource.adaptTo(ValueMap.class);
			result = (String)map.get(propertyName);			
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		return result;
		
	}

}
