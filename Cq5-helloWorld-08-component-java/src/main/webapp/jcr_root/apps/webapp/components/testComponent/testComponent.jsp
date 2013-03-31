<%@include file="/libs/foundation/global.jsp" %>
<%@page import="pl.kwi.MessageServiceImpl"%>

<div><%=new MessageServiceImpl().getHelloWord()%></div>

