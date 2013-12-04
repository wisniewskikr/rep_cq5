<%@page import="pl.kwi.components.testComponent.intg.tests.TestComponentPresenter"%>
<% %>
<%@include file="/libs/foundation/global.jsp" %>
<% %>
<c:set var="model" value="<%= new TestComponentPresenter().getModelFromRequest(slingRequest) %>"/>

<cog:checkErrors model="${model}">
	<div>${model.text}</div>
</cog:checkErrors>

