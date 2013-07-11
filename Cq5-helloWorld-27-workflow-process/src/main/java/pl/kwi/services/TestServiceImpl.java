package pl.kwi.services;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

@Service
@Component(immediate = true)
public class TestServiceImpl implements TestService {

	public String getDefaultText() {
		return "Default text";
	}

}
