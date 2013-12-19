<%@include file="/libs/foundation/global.jsp" %>

<%@page import="com.day.cq.wcm.api.WCMMode,pl.kwi.utils.RedirectUtil" %>


<div>Redirect component</div>

<%
	final WCMMode wcmMode = WCMMode.fromRequest(request);
    final boolean isEditMode = (wcmMode == WCMMode.EDIT) || (wcmMode == WCMMode.DESIGN);    
    if(!isEditMode) {
    	RedirectUtil.redirect(slingRequest, slingResponse, resource);    	
    }
%>    