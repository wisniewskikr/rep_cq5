package pl.kwi.services;

import java.util.Map;

import javax.jcr.Node;

public interface INodeService {

	public void createNode(String absPath, String nodeType, Map<String, String> props)
			throws Exception;

	public Node readNode(String absPath) throws Exception;

	public void updateNode(String absPath, Map<String, String> props)
			throws Exception;

	public void deleteNode(String absPath) throws Exception;

	public void createOrUpdateNode(String absPath, String nodeType, Map<String, String> props)
			throws Exception;

}