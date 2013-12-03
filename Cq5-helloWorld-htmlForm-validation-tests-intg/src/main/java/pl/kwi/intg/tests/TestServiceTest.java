package pl.kwi.intg.tests;

import static org.junit.Assert.*;

import javax.jcr.Credentials;
import javax.jcr.LoginException;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;

import org.apache.sling.jcr.api.SlingRepository;
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
	
	@TestReference
    private transient BundleContext bundleContext;
	
	@TestReference
	private SlingRepository repository;
	
	Credentials loginCredentials = new SimpleCredentials( "admin", "admin".toCharArray() );       //you can use any type of login

	
	
	@Test
	public void getHelloWorldMessage() throws InvalidSyntaxException, LoginException, RepositoryException {
		
		Session session = repository.login(loginCredentials);
				
//		ServiceReference serviceReference = bundleContext.getServiceReference("ITestService.class");
//		ITestService testService = (ITestService)bundleContext.getService(serviceReference);
//		String message = testService.getHelloWorldMessage("Chris");
//		
//		assertEquals("Hello World Chris", message);		

	}

}
