package pl.kwi.services;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

@Service(value = ITestService.class)
@Component(immediate = true)
public class TestService implements ITestService {
	
	/* (non-Javadoc)
	 * @see pl.kwi.services.ITestService#getHelloWorldMessage(java.lang.String)
	 */
	public String getHelloWorldMessage(String name) {
		
		String message = "Hello World " + name;
		System.out.println(message);
		return message;
		
	}

}
