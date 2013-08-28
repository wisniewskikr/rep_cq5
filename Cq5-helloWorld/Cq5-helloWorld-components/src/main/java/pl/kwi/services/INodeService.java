package pl.kwi.services;

import java.util.Map;

import javax.jcr.Node;
import javax.jcr.Session;

public interface INodeService {

	public void createNode(Session session, String absPath, String nodeType, Map<String, String> props)
			throws Exception;

	public Node readNode(Session session, String absPath, String nodeType) throws Exception;

	public void updateNode(Session session, String absPath, String nodeType, Map<String, String> props)
			throws Exception;

	public void deleteNode(Session session, String absPath, String nodeType) throws Exception;

	public void createOrUpdateNode(Session session, String absPath, String nodeType, Map<String, String> props)
			throws Exception;

}