package pl.kwi;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;

import pl.kwi.felix.services.WordsService;

@Service
@Component(immediate = true)
public class MessageServiceImpl implements MessageService {
	
	@Reference
	private WordsService wordsService;

	public String getHelloWorldMessage() {
		String helloWord = wordsService.getHelloWord();
		String worldWord = wordsService.getWorldWord();
		return helloWord + " " + worldWord;
	}

}
