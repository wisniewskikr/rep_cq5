<%@page import="pl.kwi.components.link.LinkPresenter"%>
<% %>
<%@include file="/libs/foundation/global.jsp" %>
<% %>
<c:set var="model" value="<%= new LinkPresenter().getModelFromRequest(slingRequest) %>"/>

<cog:checkErrors model="${model}">
	<p class="linkComponent">		 
		<img src="/content/dam/webapp/BR.png" class="flag" onmouseover="test1(this, '/content/dam/webapp/BR_.png')" onmouseout="test2(this, '/content/dam/webapp/BR.png')"/> 
		<a href="${model.url}" title="${model.title}">${model.text}</a>
	</p>
</cog:checkErrors>
