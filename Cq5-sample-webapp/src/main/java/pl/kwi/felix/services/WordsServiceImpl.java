package pl.kwi.felix.services;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

@Service
@Component(immediate = true)
public class WordsServiceImpl implements WordsService {

	public String getHelloWord() {
		return "Hello";
	}

	public String getWorldWord() {
		return "World";
	}

}
