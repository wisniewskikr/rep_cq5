<%@page import="pl.kwi.components.textComponent.pl.kwi.components.textComponent.TextComponentPresenter"%>
<%
	
%>
<%@include file="/libs/foundation/global.jsp" %>
<%
	
%>
<cq:setContentBundle/>
<c:set var="model" value="<%=new CountComponentPresenter().getModelFromRequest(slingRequest)%>"/>

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

