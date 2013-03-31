<%@include file="/libs/foundation/global.jsp" %>
<%@ page import="pl.kwi.ITestService"%>


<% ITestService service =   sling.getService(pl.kwi.ITestService.class); %> 


<div><%= service.getHelloWorldMessage() %></div>

