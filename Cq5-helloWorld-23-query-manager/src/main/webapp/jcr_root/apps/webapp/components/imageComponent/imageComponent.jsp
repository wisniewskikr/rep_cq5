<%@page import="pl.kwi.components.imageComponent.ImageComponentPresenter"%>
<%
	
%>
<%@include file="/libs/foundation/global.jsp" %>
<%
	
%>
<cq:setContentBundle/>
<c:set var="model" value="<%=new ImageComponentPresenter().getModelFromRequest(slingRequest)%>"/>

<cog:checkErrors model="${model}">
	<c:choose>
		<c:when test="${not empty model.fileReference}">
			<img src="${model.fileReference}" />
		</c:when>
		<c:otherwise>
			<img src="/libs/cq/ui/widgets/themes/default/placeholders/img.png"/>
		</c:otherwise>
	</c:choose>	
</cog:checkErrors>

