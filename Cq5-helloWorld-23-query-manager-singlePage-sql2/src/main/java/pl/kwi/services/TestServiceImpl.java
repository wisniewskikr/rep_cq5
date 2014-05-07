package pl.kwi.services;

import javax.jcr.NodeIterator;
import javax.jcr.Session;
import javax.jcr.query.Query;
import javax.jcr.query.QueryManager;
import javax.jcr.query.QueryResult;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;

@Service
@Component(immediate = true)
public class TestServiceImpl implements TestService {
	
	
	private static final String TEXTCOMPONENT_COUNT_QUERY = "SELECT * FROM [nt:base] AS s "
			+ "WHERE ISDESCENDANTNODE([/content])"
			+ "AND [sling:resourceType] = 'webapp/components/textComponent'";
	
	private static final String IMAGECOMPONENT_COUNT_QUERY = "SELECT * FROM [nt:base] AS s "
			+ "WHERE ISDESCENDANTNODE([/content])"
			+ "AND [sling:resourceType] = 'webapp/components/imageComponent'";
	
	
	@Reference
	private ResourceResolverFactory resolverFactory;
	

	public String getTagsCount() {
		
		String result = "";
				
		StringBuilder sb = new StringBuilder();
		sb.append("Text Component count: " + getTextComponentCount());
		sb.append(", ");
		sb.append("Image Component count: " + getImageComponentCount());
		result = sb.toString();
		
		return result;
		
	}
	
	private int getTextComponentCount() {
		
		int textComponentCount = 0;
		
		try {
			
			ResourceResolver resourceResolver = resolverFactory.getAdministrativeResourceResolver(null);
			Session session = resourceResolver.adaptTo(Session.class);
			QueryManager manager = session.getWorkspace().getQueryManager();
			QueryResult queryResult = manager.createQuery(TEXTCOMPONENT_COUNT_QUERY, Query.JCR_SQL2).execute();
			NodeIterator nodes = queryResult.getNodes();
			while (nodes.hasNext()) {
				String name = nodes.nextNode().getName();
				textComponentCount++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return textComponentCount;
		
	}
	
	private int getImageComponentCount() {
		
		int imageComponentCount = 0;
		
		try {
			
			ResourceResolver resourceResolver = resolverFactory.getAdministrativeResourceResolver(null);
			Session session = resourceResolver.adaptTo(Session.class);
			QueryManager manager = session.getWorkspace().getQueryManager();
			QueryResult queryResult = manager.createQuery(IMAGECOMPONENT_COUNT_QUERY, Query.JCR_SQL2).execute();
			NodeIterator nodes = queryResult.getNodes();
			while (nodes.hasNext()) {
				String name = nodes.nextNode().getName();
				imageComponentCount++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return imageComponentCount;
		
	}


}
