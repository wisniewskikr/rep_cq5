<%@include file="/libs/foundation/global.jsp" %>
<%@page import="pl.kwi.TestService"%>


<div><%= new TestService().getHelloWorldMessage(slingRequest) %></div>

