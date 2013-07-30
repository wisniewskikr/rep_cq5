package pl.kwi.utils;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;

import com.day.cq.security.User;

public class LoginUtil {
	
	public static boolean isUserLoggedIn(SlingHttpServletRequest request) {
		
		User user = request.getResourceResolver().adaptTo(User.class);
		if ("anonymous".equals(user.getID())) {
			return false;
		} else {
			return true;
		}
		
	}
	
	public static String getUserId(SlingHttpServletRequest request) {
		
		User user = request.getResourceResolver().adaptTo(User.class);
		return user.getID();
		
	}

}
