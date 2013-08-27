package pl.kwi.intg.tests;

import static org.junit.Assert.*;

import org.apache.sling.junit.annotations.SlingAnnotationsTestRunner;
import org.apache.sling.junit.annotations.TestReference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

import com.day.cq.wcm.api.commands.WCMCommand;

import pl.kwi.services.ITestService;


@RunWith(SlingAnnotationsTestRunner.class)
public class TestServiceTest {
	
//	@TestReference
//	private ITestService testService;
	
	@Test
	public void getHelloWorldMessage() throws InvalidSyntaxException {
		

	}

}
