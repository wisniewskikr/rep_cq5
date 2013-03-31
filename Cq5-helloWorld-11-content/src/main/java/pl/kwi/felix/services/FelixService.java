package pl.kwi.felix.services;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

@Service
@Component(immediate = true)
public class FelixService implements IFelixService {

	public String getHelloWorldMessage() {
		return "Hello World from class FelixService";
	}

}
