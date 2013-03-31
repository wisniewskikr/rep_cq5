package pl.kwi;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;

import pl.kwi.felix.services.IFelixService;

@Service
@Component(immediate = true)
public class TestService implements ITestService {
	
	@Reference
	private IFelixService felixService;

	public String getHelloWorldMessage() {
		
		System.out.println("---Here");
		
		return felixService.getHelloWorldMessage();
	}

}
