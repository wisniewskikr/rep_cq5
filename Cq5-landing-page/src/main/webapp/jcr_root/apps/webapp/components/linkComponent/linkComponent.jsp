<%@page import="com.roche.components.link.LinkPresenter"%>
<% %>
<%@include file="/libs/foundation/global.jsp" %>
<% %>
<c:set var="model" value="<%= new LinkPresenter().getModelFromRequest(slingRequest) %>"/>

<cog:checkErrors model="${model}">
		
	<a class="link" href="${model.url}" title="${model.title}" onmouseover="test1(this, '${model.bigFlagFileReference}')" onmouseout="test2(this, '${model.smallFlagFileReference}')">
		<span><img src="${model.smallFlagFileReference}"/></span>
		${model.text}
	</a>
		
</cog:checkErrors>
