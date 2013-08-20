package pl.kwi.utils;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;

public class ResourceUtil {
		
	
	/**
	 * Method gets property with specified name from resource.
	 * 
	 * @param resource object Resource containing property
	 * @param propertyName object String with property specified name
	 * @return object String with value of property with specified name
	 */
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
	
	/**
	 * Method gets property with specified name from resource. If property does not exist
	 * then default value is returned.
	 * 
	 * @param resource object Resource containing property
	 * @param propertyName object String with property specified name
	 * @param defaultValue object String with default value of property
	 * @return object String with value of property with specified name. If property does not exist
	 * then default value is returned. 
	 */
	public static String getResPropWithDefaultValue(Resource resource, String propertyName, String defaultValue) {
		
		String result = getResourceProperty(resource, propertyName);
		
		if (result == null) {
			result = defaultValue;
		}
		
		return result;
		
	}
	
	/**
	 * Method gets property with specified name from child of resource.
	 * 
	 * @param resource object Resource containing child with property
	 * @param propertyName object String with property specified name
	 * @param relPath object String with relative path to child Resource
	 * @return object String with property value
	 */
	public static String getResourcePropertyFromChild(Resource resource, String propertyName, String relPath) {
		
		Resource child = resource.getChild(relPath);
		return getResourceProperty(child, propertyName);
		
	}
	

}
