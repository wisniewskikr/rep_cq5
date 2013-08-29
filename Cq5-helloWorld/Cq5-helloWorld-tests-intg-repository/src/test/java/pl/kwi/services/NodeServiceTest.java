package pl.kwi.services;

import java.io.InputStream;

import javax.jcr.Node;
import javax.jcr.Property;
import javax.jcr.Session;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.roche.testing.sling.jcr.SlingRepositoryProvider;
import com.roche.testing.sling.jcr.util.XmlImportType;
import com.roche.testing.sling.jcr.util.XmlImporter;

public class NodeServiceTest {

	private NodeService service;
	
	@Before
	public void setUp() {
		service = new NodeService();
	}
	
	@After
	@Before
	public void tearDown() throws Exception {
		SlingRepositoryProvider.get().clearRepository();
	}
	
	@Test
	public void readNode() throws Exception{
		
		InputStream dataStream = getClass().getClassLoader().getResourceAsStream("nodeServiceTest.xml");
		XmlImporter.load("/", dataStream, XmlImportType.IMPORT_UUID_COLLISION_REMOVE_EXISTING);

		Session session = SlingRepositoryProvider.get().getSession();
		
		Node node = service.readNode(session, "/webapp/nameNode", null);
		
		Property property = node.getProperty("name");
		Assert.assertEquals("User1", property.getValue().getString());
		
		session.logout();
		
	}

}
