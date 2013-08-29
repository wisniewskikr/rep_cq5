package pl.kwi.services;

import java.util.Map;

import javax.jcr.Node;
import javax.jcr.Session;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;

import com.day.cq.commons.jcr.JcrConstants;
import com.day.cq.commons.jcr.JcrUtil;

@Service(value = INodeService.class)
@Component(immediate = true)
public class NodeService implements INodeService {
	
	@Reference
	private ResourceResolverFactory resolverFactory;
	
	private Session session;
	
	public NodeService() {}
	
	public NodeService(Session session) {
		this.session = session;  
	}

	/* (non-Javadoc)
	 * @see pl.kwi.services.INodeService#createNode(javax.jcr.Session, java.lang.String, java.lang.String, java.util.Map)
	 */
	public void createNode(String absPath, String nodeType, Map<String, String> props) throws Exception {
		
		openSession();
		
		Node newNode = JcrUtil.createPath(absPath, nodeType, session);
		if(props == null) {
			saveSession();
			return;
		}		
		for (Map.Entry<String, String> entry : props.entrySet()) {
			newNode.setProperty(entry.getKey(), entry.getValue());
		}
		
		saveSession();
				
	}
	
	public void createNode(String absPath, Map<String, String> props) throws Exception {
		createNode(absPath, JcrConstants.NT_UNSTRUCTURED, props);
	}
	
	/* (non-Javadoc)
	 * @see pl.kwi.services.INodeService#readNode(javax.jcr.Session, java.lang.String, java.lang.String)
	 */
	public Node readNode(String absPath) throws Exception {
		
		Node node = null;
		
		openSession();		
		
		if(session.nodeExists(absPath)) {
			node = session.getNode(absPath);
		} 
		
		saveSession();
		
		return node;
					
	}
	
	/* (non-Javadoc)
	 * @see pl.kwi.services.INodeService#updateNode(javax.jcr.Session, java.lang.String, java.lang.String, java.util.Map)
	 */
	public void updateNode(String absPath, Map<String, String> props) throws Exception {
		
		Node node = readNode(absPath);
		if(node == null) {
			throw new Exception("Can not update node because node not exists. Path to node: " + absPath);
		}
		
		openSession();
		
		for (Map.Entry<String, String> entry : props.entrySet()) {
			node.setProperty(entry.getKey(), entry.getValue());
		}
		
		saveSession();
		
	}
	
	/* (non-Javadoc)
	 * @see pl.kwi.services.INodeService#deleteNode(javax.jcr.Session, java.lang.String, java.lang.String)
	 */
	public void deleteNode(String absPath) throws Exception {
		
		openSession();
		
		if(!session.nodeExists(absPath)) {
			saveSession();
			throw new Exception("Can not delete node because node not exists. Path to node: " + absPath);
		}
		
		Node node = session.getNode(absPath);
		node.remove();
		
		saveSession();
		
	}
	
	/* (non-Javadoc)
	 * @see pl.kwi.services.INodeService#createOrUpdateNode(javax.jcr.Session, java.lang.String, java.lang.String, java.util.Map)
	 */
	public void createOrUpdateNode(String absPath, String nodeType, Map<String, String> props) throws Exception{
		
		Node node = readNode(absPath);
		if(node == null && nodeType != null) {
			createNode(absPath, nodeType, props);
		} else if(node == null && nodeType == null) {
			createNode(absPath, props);
		} else {
			updateNode(absPath, props);
		}
		
	}
	
	
	// ******************************************************************************* //
	// ****************************** HELP METHODS *********************************** //
	// ******************************************************************************* //
	
	
	private void openSession() throws Exception {
		
		if(session != null) {
			return;
		}
		
		ResourceResolver resolver = resolverFactory.getAdministrativeResourceResolver(null);
		Session session = resolver.adaptTo(Session.class);
		session.refresh(false);
		this.session = session;
		
	}
	
	private void saveSession() throws Exception{
		
		session.save();
		
	}

}
