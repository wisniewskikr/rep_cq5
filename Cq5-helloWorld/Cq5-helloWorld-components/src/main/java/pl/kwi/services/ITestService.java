package pl.kwi.services;


public interface ITestService {

	/**
	 * Method saves name to node with specified path in repository.
	 * 
	 * @param absPath object <code>String</code> with abstract path to node
	 * where name should be stored
	 * @param name object <code>String</code> with name which should be stored
	 */
	public void saveNameInNode(String absPath, String name);

}