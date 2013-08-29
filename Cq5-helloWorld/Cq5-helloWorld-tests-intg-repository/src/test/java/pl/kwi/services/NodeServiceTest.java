package pl.kwi.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.jcr.Node;
import javax.jcr.Property;
import javax.jcr.Session;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.day.cq.commons.jcr.JcrConstants;
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
	public void createNode() throws Exception{
		
		InputStream dataStream = getClass().getClassLoader().getResourceAsStream("nodeServiceTest.xml");
		XmlImporter.load("/", dataStream, XmlImportType.IMPORT_UUID_COLLISION_REMOVE_EXISTING);

		Session session = SlingRepositoryProvider.get().getSession();
		
		Map<String, String> props = new HashMap<String, String>();
		props.put("prop1", "value1");
		service.createNode(session, "/webapp/nameNode2", JcrConstants.NT_UNSTRUCTURED, props);
		
		Node node = service.readNode(session, "/webapp/nameNode2", null);
		Property property = node.getProperty("prop1");
		assertEquals("value1", property.getValue().getString());
		
		session.logout();
		
	}
	
	@Test
	public void readNode() throws Exception{
		
		InputStream dataStream = getClass().getClassLoader().getResourceAsStream("nodeServiceTest.xml");
		XmlImporter.load("/", dataStream, XmlImportType.IMPORT_UUID_COLLISION_REMOVE_EXISTING);

		Session session = SlingRepositoryProvider.get().getSession();
		
		Node node = service.readNode(session, "/webapp/nameNode", null);
		
		Property property = node.getProperty("name");
		assertEquals("User1", property.getValue().getString());
		
		session.logout();
		
	}
	
	@Test
	public void updateNode() throws Exception{
		
		InputStream dataStream = getClass().getClassLoader().getResourceAsStream("nodeServiceTest.xml");
		XmlImporter.load("/", dataStream, XmlImportType.IMPORT_UUID_COLLISION_REMOVE_EXISTING);

		Session session = SlingRepositoryProvider.get().getSession();
		
		Map<String, String> props = new HashMap<String, String>();
		props.put("name", "User2");
		service.updateNode(session, "/webapp/nameNode", JcrConstants.NT_UNSTRUCTURED, props);
		
		Node node = service.readNode(session, "/webapp/nameNode", null);
		
		Property property = node.getProperty("name");
		assertEquals("User2", property.getValue().getString());
		
		session.logout();
		
	}
	
	@Test
	public void deleteNode() throws Exception{
		
		InputStream dataStream = getClass().getClassLoader().getResourceAsStream("nodeServiceTest.xml");
		XmlImporter.load("/", dataStream, XmlImportType.IMPORT_UUID_COLLISION_REMOVE_EXISTING);

		Session session = SlingRepositoryProvider.get().getSession();
				
		service.deleteNode(session, "/webapp/nameNode", JcrConstants.NT_UNSTRUCTURED);
		
		Node node = service.readNode(session, "/webapp/nameNode", null);
		
		assertNull(node);
		
		session.logout();
		
	}
	
	@Test
	public void createOrUpdateNode_create() throws Exception{
		
		InputStream dataStream = getClass().getClassLoader().getResourceAsStream("nodeServiceTest.xml");
		XmlImporter.load("/", dataStream, XmlImportType.IMPORT_UUID_COLLISION_REMOVE_EXISTING);

		Session session = SlingRepositoryProvider.get().getSession();
		
		Map<String, String> props = new HashMap<String, String>();
		props.put("prop1", "value1");
		service.createOrUpdateNode(session, "/webapp/nameNode2", JcrConstants.NT_UNSTRUCTURED, props);
		
		Node node = service.readNode(session, "/webapp/nameNode2", null);
		Property property = node.getProperty("prop1");
		assertEquals("value1", property.getValue().getString());
		
		session.logout();
		
	}
	
	@Test
	public void createOrUpdateNode_update() throws Exception{
		
		InputStream dataStream = getClass().getClassLoader().getResourceAsStream("nodeServiceTest.xml");
		XmlImporter.load("/", dataStream, XmlImportType.IMPORT_UUID_COLLISION_REMOVE_EXISTING);

		Session session = SlingRepositoryProvider.get().getSession();
		
		Map<String, String> props = new HashMap<String, String>();
		props.put("name", "User2");
		service.createOrUpdateNode(session, "/webapp/nameNode", JcrConstants.NT_UNSTRUCTURED, props);
		
		Node node = service.readNode(session, "/webapp/nameNode", null);
		
		Property property = node.getProperty("name");
		assertEquals("User2", property.getValue().getString());
		
		session.logout();
		
	}

}
