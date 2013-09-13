<!-- %@include file="/libs/foundation/global.jsp" % -->

<%@ page session="false" %>
<%@ page import="javax.jcr.*,
        org.apache.sling.api.resource.Resource, pl.kwi.ITestService"
%>
<%@ taglib prefix="sling" uri="http://sling.apache.org/taglibs/sling/1.0" %>

<sling:defineObjects />

<!-- % var service =   sling.getService(Packages.pl.kwi.ITestService); % --> 
<% ITestService service =   sling.getService(pl.kwi.ITestService.class); %> 


<div><%= service.getHelloWorldMessage() %></div>

