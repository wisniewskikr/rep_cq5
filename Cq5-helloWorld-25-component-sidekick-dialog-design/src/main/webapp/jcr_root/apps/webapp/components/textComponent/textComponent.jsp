<%@page import="pl.kwi.components.textComponent.TextComponentPresenter"%>
<%
	
%>
<%@include file="/libs/foundation/global.jsp" %>
<%
	
%>
<c:set var="model" value="<%=new TextComponentPresenter().getModelFromRequest(slingRequest)%>"/>

<cog:checkErrors model="${model}">
	
	<c:choose>
		<c:when test="${not empty model.text}">
			<div>${model.text}</div>			
		</c:when>
		<c:when test="${not empty currentStyle['defaultText']}">
			<div>${currentStyle['defaultText']}</div>			
		</c:when>
		<c:otherwise>
			<img src="/libs/cq/ui/widgets/themes/default/placeholders/img.png"/>
		</c:otherwise>
	</c:choose>	
	
</cog:checkErrors>

