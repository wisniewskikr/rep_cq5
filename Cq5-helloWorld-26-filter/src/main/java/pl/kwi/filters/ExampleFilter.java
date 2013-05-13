package pl.kwi.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;

@Component
@Service
@Properties({
    // @Property(name="service.description", value="This is an example filter."),
    // @Property(name = "pattern", value = "/.*"),
    @Property(name = "sling.filter.scope", value = "REQUEST")
})
public class ExampleFilter implements Filter {

	public void destroy() {}
	
	public void init(FilterConfig arg0) throws ServletException {}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		System.out.println("--- Example filter");
		
		chain.doFilter(request, response);
		
	}
	

}
