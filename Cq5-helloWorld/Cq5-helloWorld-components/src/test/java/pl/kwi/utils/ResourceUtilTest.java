package pl.kwi.utils;

import static org.junit.Assert.*;

import org.apache.sling.commons.testing.sling.MockResource;
import org.junit.Test;

public class ResourceUtilTest {

	@Test
	public void getResourceProperty() {
		
		String propertyKey = "propertyKey";
		String propertyValue = "propertyValue";
		
		MockResource resource = new MockResource(null, null, null);
		resource.addProperty(propertyKey, propertyValue);
		
		String result = ResourceUtil.getResourceProperty(resource, propertyKey);
		
		assertEquals(propertyValue, result);
		
	}

}
