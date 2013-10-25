<%@page import="pl.kwi.actions.CustomAction"%>
<%@page session="false"%>
<%%>
<%@include file="/libs/foundation/global.jsp"%>
<%@taglib prefix="sling" uri="http://sling.apache.org/taglibs/sling/1.0" %>
<%%>

<sling:defineObjects/><%	
	new CustomAction().handleAction(slingRequest, slingResponse, resource);
%>
