<%@page import="pl.kwi.components.link.LinkPresenter"%>
<% %>
<%@include file="/libs/foundation/global.jsp" %>
<% %>
<c:set var="model" value="<%= new LinkPresenter().getModelFromRequest(slingRequest) %>"/>

<cog:checkErrors model="${model}">
		
	<a class="link" href="${model.url}" title="${model.title}" onmouseover="changeImgSrc(this, '${model.bigFlagFileReference}')" onmouseout="changeImgSrc(this, '${model.smallFlagFileReference}')">
		<span><img src="${model.smallFlagFileReference}"/></span>
		${model.text}
	</a>
		
</cog:checkErrors>
