<%@include file="/libs/foundation/global.jsp" %>

<%@page import="com.day.cq.wcm.api.WCMMode, 
				pl.kwi.classes.RedirectClass" %>


<div>Redirect component</div>

<%
    final WCMMode wcmMode = WCMMode.fromRequest(request);
    final boolean isEditMode = (wcmMode == WCMMode.EDIT) || (wcmMode == WCMMode.DESIGN);    
    if(!isEditMode) {
    	new RedirectClass().redirect(slingRequest, slingResponse, resource);    	
    }     
%>    