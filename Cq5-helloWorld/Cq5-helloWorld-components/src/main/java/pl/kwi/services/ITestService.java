package pl.kwi.services;


import org.apache.sling.api.resource.Resource;

public interface ITestService {

	public String getHelloWorldMessage(Resource resource, String name);

	public void saveNameInNode(String absPath, String name);

}