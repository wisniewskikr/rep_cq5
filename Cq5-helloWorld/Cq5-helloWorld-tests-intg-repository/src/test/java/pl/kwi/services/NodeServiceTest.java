package pl.kwi.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.jcr.Node;
import javax.jcr.Property;

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
		service = new NodeService(SlingRepositoryProvider.get().getSession());
	}
	
	@After
	public void tearDown() throws Exception {
		SlingRepositoryProvider.get().clearRepository();
		service.getSession().logout();
	}
	
	@Test
	public void createNode() throws Exception{
		
		InputStream dataStream = getClass().getClassLoader().getResourceAsStream("nodeServiceTest.xml");
		XmlImporter.load("/", dataStream, XmlImportType.IMPORT_UUID_COLLISION_REMOVE_EXISTING);

		Map<String, String> props = new HashMap<String, String>();
		props.put("prop1", "value1");
		service.createNode("/webapp/nameNode2", JcrConstants.NT_UNSTRUCTURED, props);
		
		Node node = service.readNode("/webapp/nameNode2");
		Property property = node.getProperty("prop1");
		assertEquals("value1", property.getValue().getString());
		
	}
	
	@Test
	public void createNode_noExistingParent() throws Exception{
		
		InputStream dataStream = getClass().getClassLoader().getResourceAsStream("nodeServiceTest.xml");
		XmlImporter.load("/", dataStream, XmlImportType.IMPORT_UUID_COLLISION_REMOVE_EXISTING);

		Map<String, String> props = new HashMap<String, String>();
		props.put("prop1", "value1");
		service.createNode("/webapp/tmp1/tmp2/tmp3", JcrConstants.NT_UNSTRUCTURED, props);
		
		Node node = service.readNode("/webapp/tmp1/tmp2/tmp3");
		Property property = node.getProperty("prop1");
		assertEquals("value1", property.getValue().getString());
		
	}
	
	@Test
	public void readNode() throws Exception{
		
		InputStream dataStream = getClass().getClassLoader().getResourceAsStream("nodeServiceTest.xml");
		XmlImporter.load("/", dataStream, XmlImportType.IMPORT_UUID_COLLISION_REMOVE_EXISTING);

		Node node = service.readNode("/webapp/nameNode");
		
		Property property = node.getProperty("name");
		assertEquals("User1", property.getValue().getString());
		
	}
	
	@Test
	public void readNode_notExistingNode() throws Exception{
		
		InputStream dataStream = getClass().getClassLoader().getResourceAsStream("nodeServiceTest.xml");
		XmlImporter.load("/", dataStream, XmlImportType.IMPORT_UUID_COLLISION_REMOVE_EXISTING);

		Node node = service.readNode("/webapp/tmp");
		
		assertNull(node);
		
	}
	
	@Test
	public void updateNode() throws Exception{
		
		InputStream dataStream = getClass().getClassLoader().getResourceAsStream("nodeServiceTest.xml");
		XmlImporter.load("/", dataStream, XmlImportType.IMPORT_UUID_COLLISION_REMOVE_EXISTING);

		Map<String, String> props = new HashMap<String, String>();
		props.put("name", "User2");
		service.updateNode("/webapp/nameNode", props);
		
		Node node = service.readNode("/webapp/nameNode");
		
		Property property = node.getProperty("name");
		assertEquals("User2", property.getValue().getString());
		
	}
	
	@Test(expected = Exception.class)
	public void updateNode_notExistingNode() throws Exception{
		
		InputStream dataStream = getClass().getClassLoader().getResourceAsStream("nodeServiceTest.xml");
		XmlImporter.load("/", dataStream, XmlImportType.IMPORT_UUID_COLLISION_REMOVE_EXISTING);

		service.updateNode("/webapp/tmp", null);
		
	}
	
	@Test
	public void deleteNode() throws Exception{
		
		InputStream dataStream = getClass().getClassLoader().getResourceAsStream("nodeServiceTest.xml");
		XmlImporter.load("/", dataStream, XmlImportType.IMPORT_UUID_COLLISION_REMOVE_EXISTING);

		service.deleteNode("/webapp/nameNode");
		
		Node node = service.readNode("/webapp/nameNode");
		
		assertNull(node);
		
	}
	
	@Test(expected = Exception.class)
	public void deleteNode_notExistingNode() throws Exception {
		
		InputStream dataStream = getClass().getClassLoader().getResourceAsStream("nodeServiceTest.xml");
		XmlImporter.load("/", dataStream, XmlImportType.IMPORT_UUID_COLLISION_REMOVE_EXISTING);

		service.deleteNode("/webapp/tmp");
		
	}
	
	@Test
	public void createOrUpdateNode_create() throws Exception{
		
		InputStream dataStream = getClass().getClassLoader().getResourceAsStream("nodeServiceTest.xml");
		XmlImporter.load("/", dataStream, XmlImportType.IMPORT_UUID_COLLISION_REMOVE_EXISTING);

		Map<String, String> props = new HashMap<String, String>();
		props.put("prop1", "value1");
		service.createOrUpdateNode("/webapp/nameNode2", JcrConstants.NT_UNSTRUCTURED, props);
		
		Node node = service.readNode("/webapp/nameNode2");
		Property property = node.getProperty("prop1");
		assertEquals("value1", property.getValue().getString());
		
	}
	
	@Test
	public void createOrUpdateNode_update() throws Exception{
		
		InputStream dataStream = getClass().getClassLoader().getResourceAsStream("nodeServiceTest.xml");
		XmlImporter.load("/", dataStream, XmlImportType.IMPORT_UUID_COLLISION_REMOVE_EXISTING);

		Map<String, String> props = new HashMap<String, String>();
		props.put("name", "User2");
		service.createOrUpdateNode("/webapp/nameNode", JcrConstants.NT_UNSTRUCTURED, props);
		
		Node node = service.readNode("/webapp/nameNode");
		
		Property property = node.getProperty("name");
		assertEquals("User2", property.getValue().getString());
		
	}

}
