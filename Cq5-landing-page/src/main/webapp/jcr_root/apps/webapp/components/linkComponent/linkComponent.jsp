<%@page import="pl.kwi.components.link.LinkPresenter"%>
<% %>
<%@include file="/libs/foundation/global.jsp" %>
<% %>
<c:set var="model" value="<%= new LinkPresenter().getModelFromRequest(slingRequest) %>"/>

<cog:checkErrors model="${model}">
	<p class="linkComponent"> <img src="/content/dam/webapp/BR.png" class="flag"/> <a href="${model.url}" title="${model.title}">${model.text}</a></p>
</cog:checkErrors>
