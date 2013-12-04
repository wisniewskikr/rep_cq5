package pl.kwi.components.testComponent.intg.tests;

import static org.junit.Assert.*;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.apache.sling.junit.annotations.SlingAnnotationsTestRunner;
import org.apache.sling.junit.annotations.TestReference;
import org.junit.Test;
import org.junit.runner.RunWith;

import pl.kwi.components.testComponent.TestComponentDto;
import pl.kwi.components.testComponent.TestComponentModel;
import pl.kwi.components.testComponent.TestComponentPresenter;


@RunWith(SlingAnnotationsTestRunner.class)
public class TestComponentPresenterTest {
	
	
	private static final String NODE_COMPONENT = "/content/webapp/jcr:content/par";
	
	@TestReference
	private ResourceResolverFactory resolverFactory;


	@Test
	public void test() throws org.apache.sling.api.resource.LoginException {
		
		assertNotNull(resolverFactory);
		
		ResourceResolver resourceResolver = resolverFactory.getAdministrativeResourceResolver(null);
        Resource resource = resourceResolver.getResource(NODE_COMPONENT);
        assertNotNull(resource);
        
		TestComponentPresenter presenter = new TestComponentPresenter();
		@SuppressWarnings("unchecked")
		TestComponentModel<TestComponentDto> model = (TestComponentModel<TestComponentDto>)presenter.getModelFromResource(null, resource);
		
		String text = model.getText();
		assertEquals("Example text", text);
				
	}
	

}
