package pl.kwi.services;

import java.util.Map;

import javax.jcr.Node;

public interface INodeService {

	/**
	 * Method creates node in repository.
	 * 
	 * @param absPath object <code>String</code> with abstract path to node
	 * @param nodeType object <code>String</code> with node type
	 * @param props map with properties of node
	 * @throws Exception
	 */
	public void createNode(String absPath, String nodeType, Map<String, String> props)
			throws Exception;
	
	/**
	 * Method creates node in repository.
	 * 
	 * @param absPath object <code>String</code> with abstract path to node
	 * @param props map with properties of node
	 * @throws Exception
	 */
	public void createNode(String absPath, Map<String, String> props) throws Exception;

	/**
	 * Method reads node from specified path.
	 * 
	 * @param absPath object <code>String</code> with abstract path to node
	 * @return node from repository if exists. Otherwise null
	 * @throws Exception
	 */
	public Node readNode(String absPath) throws Exception;

	/**
	 * Method updates node with specified path.
	 * 
	 * @param absPath object <code>String</code> with abstract path to node
	 * @param props map with properties of node
	 * @throws Exception
	 */
	public void updateNode(String absPath, Map<String, String> props)
			throws Exception;

	/**
	 * Method deletes node with specified path.
	 * 
	 * @param absPath object <code>String</code> with abstract path to node
	 * @throws Exception
	 */
	public void deleteNode(String absPath) throws Exception;

	/**
	 * Method creates node if not exists. Otherwise node is updated.
	 * 
	 * @param absPath object <code>String</code> with abstract path to node
	 * @param nodeType object <code>String</code> with node type
	 * @param props map with properties of node
	 * @throws Exception
	 */
	public void createOrUpdateNode(String absPath, String nodeType, Map<String, String> props)
			throws Exception;
	
}