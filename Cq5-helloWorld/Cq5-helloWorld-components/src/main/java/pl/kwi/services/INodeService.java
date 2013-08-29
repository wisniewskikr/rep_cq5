package pl.kwi.services;

import java.util.Map;

import javax.jcr.Node;

public interface INodeService {

	public void createNode(String absPath, String nodeType, Map<String, String> props)
			throws Exception;

	public Node readNode(String absPath, String nodeType) throws Exception;

	public void updateNode(String absPath, String nodeType, Map<String, String> props)
			throws Exception;

	public void deleteNode(String absPath, String nodeType) throws Exception;

	public void createOrUpdateNode(String absPath, String nodeType, Map<String, String> props)
			throws Exception;

}