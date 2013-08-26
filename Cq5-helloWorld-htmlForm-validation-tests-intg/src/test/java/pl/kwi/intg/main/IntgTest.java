package pl.kwi.intg.main;

import org.apache.sling.junit.remote.testrunner.SlingRemoteTestParameters;
import org.apache.sling.junit.remote.testrunner.SlingRemoteTestRunner;
import org.junit.runner.RunWith;

@RunWith(SlingRemoteTestRunner.class)
public class IntgTest implements SlingRemoteTestParameters {


	public String getJunitServletUrl() {
		return "http://localhost:4502/system/sling/junit";
	}

	public String getTestClassesSelector() {
		return "";
	}

	public String getTestMethodSelector() {
		return "";
	}
	

}
