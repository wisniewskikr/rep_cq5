<%@page import="pl.kwi.components.testComponent.TestComponentPresenter"%>
<% %>
<%@include file="/libs/foundation/global.jsp" %>
<% %>
<c:set var="model" value="<%= new TestComponentPresenter().getModelFromRequest(slingRequest) %>"/>

<cog:checkErrors model="${model}">
	
	<c:choose>
		<c:when test="${not empty model.text}">
			<div>${model.text}</div>
		</c:when>
		<c:otherwise>
			<img src="/libs/cq/ui/widgets/themes/default/placeholders/img.png"/>
		</c:otherwise>
	</c:choose>	
	
</cog:checkErrors>

