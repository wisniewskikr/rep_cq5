<%@page import="pl.kwi.components.countComponent.CountComponentPresenter"%>
<%
	
%>
<%@include file="/libs/foundation/global.jsp" %>
<%
	
%>
<c:set var="model" value="<%=new CountComponentPresenter().getModelFromRequest(slingRequest)%>"/>

<cog:checkErrors model="${model}">	
	<div>${model.text}</div>	
</cog:checkErrors>

