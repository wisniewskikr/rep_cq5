<%@page import="pl.kwi.components.link.LinkPresenter"%>
<% %>
<%@include file="/libs/foundation/global.jsp" %>
<% %>
<c:set var="model" value="<%= new LinkPresenter().getModelFromRequest(slingRequest) %>"/>

<cog:checkErrors model="${model}">
		
	<a class="link" href="${model.url}" title="${model.title}" onmouseover="test1(this, '/content/dam/webapp/BR_.png')" onmouseout="test2(this, '/content/dam/webapp/BR.png')">
		<span><img src="/content/dam/webapp/BR.png"/></span>
		${model.text}
	</a>
		
</cog:checkErrors>
