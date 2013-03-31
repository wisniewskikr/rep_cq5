<%@include file="/libs/foundation/global.jsp" %><%%>
<%@ page import="pl.kwi.MessageService"%>
<%
	MessageService service =   sling.getService(pl.kwi.MessageService.class);
%> 


<%= service.getHelloWorldMessage() %>

