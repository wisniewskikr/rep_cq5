<%@page import="pl.kwi.components.textComponent.pl.kwi.components.textComponent.TextComponentPresenter"%>
<%
	
%>
<%@include file="/libs/foundation/global.jsp" %>
<%
	
%>
<c:set var="model" value="<%=new CountComponentPresenter().getModelFromRequest(slingRequest)%>"/>

<cog:checkErrors model="${model}">
	<div>${model.text}</div>
</cog:checkErrors>

