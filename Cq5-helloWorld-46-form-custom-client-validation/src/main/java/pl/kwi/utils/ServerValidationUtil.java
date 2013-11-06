package pl.kwi.utils;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceUtil;
import org.apache.sling.api.resource.ValueMap;

import com.day.cq.wcm.foundation.forms.FormsHelper;
import com.day.cq.wcm.foundation.forms.ValidationInfo;

public class ServerValidationUtil {
	
	public static void validateTextFieldRequired(SlingHttpServletRequest slingRequest, Resource resource) {
		
		String fieldId = FormsHelper.getParameterName(resource);
		String fieldValue = slingRequest.getParameter(fieldId);
		
		ValueMap properties = ResourceUtil.getValueMap(resource);
		Boolean required = (Boolean) properties.get("required", false);
		String requiredMessage = (String) properties.get("requiredMessage", "Please fill this field");
		
		if(required && (fieldValue == null || "".equals(fieldValue))) {
			ValidationInfo.createValidationInfo(slingRequest).addErrorMessage(fieldId, requiredMessage);			
		}		
		
	}

}
