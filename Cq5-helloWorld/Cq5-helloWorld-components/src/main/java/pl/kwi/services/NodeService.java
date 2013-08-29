package pl.kwi.services;

import java.util.Map;

import javax.jcr.Node;
import javax.jcr.Session;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

@Service(value = INodeService.class)
@Component(immediate = true)
public class NodeService implements INodeService {

	/* (non-Javadoc)
	 * @see pl.kwi.services.INodeService#createNode(javax.jcr.Session, java.lang.String, java.lang.String, java.util.Map)
	 */
	public void createNode(Session session, String absPath, String nodeType, Map<String, String> props) throws Exception {
		
		int lastIndexOf = absPath.lastIndexOf("/");
		String parentPath = absPath.substring(0, lastIndexOf);
		String relPath = absPath.substring(lastIndexOf + 1, absPath.length());
		
		Node parentNode = readNode(session, parentPath, null);		
		Node newNode = parentNode.addNode(relPath, nodeType);
		if(props == null) {
			return;
		}		
		for (Map.Entry<String, String> entry : props.entrySet()) {
			newNode.setProperty(entry.getKey(), entry.getValue());
		}
				
	}
	
	/* (non-Javadoc)
	 * @see pl.kwi.services.INodeService#readNode(javax.jcr.Session, java.lang.String, java.lang.String)
	 */
	public Node readNode(Session session, String absPath, String nodeType) throws Exception {
		
		if(session.nodeExists(absPath)) {
			return session.getNode(absPath);
		} else {
			return null;
		}
					
	}
	
	/* (non-Javadoc)
	 * @see pl.kwi.services.INodeService#updateNode(javax.jcr.Session, java.lang.String, java.lang.String, java.util.Map)
	 */
	public void updateNode(Session session, String absPath, String nodeType, Map<String, String> props) throws Exception {
		
		Node oldNode = readNode(session, absPath, nodeType);
		oldNode.remove();
		
		createNode(session, absPath, nodeType, props);	
		
	}
	
	/* (non-Javadoc)
	 * @see pl.kwi.services.INodeService#deleteNode(javax.jcr.Session, java.lang.String, java.lang.String)
	 */
	public void deleteNode(Session session, String absPath, String nodeType) throws Exception {
		
		Node node = readNode(session, absPath, nodeType);
		node.remove();
		
	}
	
	/* (non-Javadoc)
	 * @see pl.kwi.services.INodeService#createOrUpdateNode(javax.jcr.Session, java.lang.String, java.lang.String, java.util.Map)
	 */
	public void createOrUpdateNode(Session session, String absPath, String nodeType, Map<String, String> props) throws Exception{
		
		Node node = readNode(session, absPath, nodeType);
		if(node == null) {
			createNode(session, absPath, nodeType, props);
		} else {
			updateNode(session, absPath, nodeType, props);
		}
		
	}

}
