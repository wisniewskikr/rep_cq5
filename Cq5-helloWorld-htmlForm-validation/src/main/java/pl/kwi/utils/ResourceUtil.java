package pl.kwi.utils;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;

public class ResourceUtil {
	
	public static String getResourceProperty(Resource resource, String propertyName) {
		
		String result = null;
		
		try {
			
			if(resource == null) {
				throw new Exception("There is no resorce for property: " + propertyName);
			}
			
			ValueMap map = resource.adaptTo(ValueMap.class);
			
			if(map == null) {
				throw new Exception("There is no properties in resource: " + resource.getPath() + " and property: " + propertyName);
			}
			
			result = (String)map.get(propertyName);			
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static String getResPropWithDefaultValue(Resource resource, String propertyName, String defaultValue) {
		
		String result = null;
		
		try {
			
			if(resource == null) {
				throw new Exception("There is no resorce for property: " + propertyName);
			}
			
			ValueMap map = resource.adaptTo(ValueMap.class);
			
			if(map == null) {
				throw new Exception("There is no properties in resource: " + resource.getPath() + " and property: " + propertyName);
			}
			
			result = (String)map.get(propertyName);			
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		if (result == null) {
			result = defaultValue;
		}
		
		return result;
		
	}

}
