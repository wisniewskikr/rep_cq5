<%@page import="pl.kwi.components.testComponent.TestComponentPresenter"%>
<% %>
<%@include file="/libs/foundation/global.jsp" %>
<% %>
<cq:setContentBundle/>
<c:set var="model" value="<%= new TestComponentPresenter().getModelFromRequest(slingRequest) %>"/>

<cog:checkErrors model="${model}">
	<c:choose>
		<c:when test="${not empty model.fileReference}">
			<img src="${model.fileReference}" />
		</c:when>
		<c:otherwise>
			<div>Click here in order to add image</div>
		</c:otherwise>
	</c:choose>	
</cog:checkErrors>

