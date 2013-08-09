CQ5 AND FORM WITH SERVLETS


This tutorial is about using form and servlets in CQ5. In other words it is about how to send 
data from form to servlet.

To use form in CQ you have to:
- in *.jsp file:	add selector to action in form. Selector has to begin with "." and end with suffix.
					For instance in action "webapp.SELECTORNAME.html" selector is "SELECTORNAME";
- in servlet:		extend SlingAllMethodsServlet;
- in servlet:		create service with specified properties. For instance "sling.servlet.selectors"
					has to have "SELECTORNAME" from action;

Example properties:

@Component(immediate=true, metatype=false, label="EXAMPLE SERVLET")
@Service
@Properties(value = {
    @org.apache.felix.scr.annotations.Property(name="sling.servlet.methods", value={"POST"}),
    @org.apache.felix.scr.annotations.Property(name="sling.servlet.resourceTypes", value={"sling/servlet/default"}),
    @org.apache.felix.scr.annotations.Property(name="sling.servlet.selectors", value={"SELECTORNAME"}),
    @org.apache.felix.scr.annotations.Property(name="sling.servlet.extensions", value={"html"})
})