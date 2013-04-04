<%@include file="/libs/foundation/global.jsp" %>
<%@page import="pl.kwi.SampleServiceImpl"%>

<div><%=new SampleServiceImpl().getHelloWorldMessage()%></div>

