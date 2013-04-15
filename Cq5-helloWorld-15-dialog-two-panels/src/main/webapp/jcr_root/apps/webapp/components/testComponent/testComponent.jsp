<%@page import="pl.kwi.components.testComponent.TestComponentPresenter"%>
<% %>
<%@include file="/libs/foundation/global.jsp" %>
<% %>
<c:set var="model" value="<%= new TestComponentPresenter().getModelFromRequest(slingRequest) %>"/>

<cog:checkErrors model="${model}">
	<div>${model.text} ${model.name}</div>
</cog:checkErrors>

