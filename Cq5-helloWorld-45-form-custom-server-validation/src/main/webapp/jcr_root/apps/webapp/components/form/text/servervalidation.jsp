<%@page import="pl.kwi.utils.ServerValidationUtil"%>
<%@page session="false"%>
<%%>
<%@include file="/libs/foundation/global.jsp"%>
<%@taglib prefix="sling" uri="http://sling.apache.org/taglibs/sling/1.0" %>
<%%>

<sling:defineObjects/><%	
	ServerValidationUtil.validateTextFieldRequired(slingRequest, resource);
%>
