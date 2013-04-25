<%@page import="com.roche.components.link.LinkPresenter"%>
<% %>
<%@include file="/libs/foundation/global.jsp" %>
<% %>
<c:set var="model" value="<%= new LinkPresenter().getModelFromRequest(slingRequest) %>"/>

<cog:checkErrors model="${model}">
	
	<c:choose>
		<c:when test="${not empty model.text}">			
			<a class="link" href="${model.url}" title="${model.title}" onmouseover="linkMouseOver(this, '${model.bigFlagFileReference}')" onmouseout="linkMouseOut(this, '${model.smallFlagFileReference}')">
				<span><img src="${model.smallFlagFileReference}"/></span>
				${model.text}
			</a>			
		</c:when>
		<c:otherwise>
			<img src="/libs/cq/ui/widgets/themes/default/placeholders/img.png"/>
		</c:otherwise>
	</c:choose>	
		
</cog:checkErrors>
