<%@include file="/libs/foundation/global.jsp" %>

<%@page import="pl.kwi.utils.ResourceUtil" %>

<c:set var="linkText" value="<%= ResourceUtil.getResourceProperty(resource, "linkText") %>"/>
<c:set var="redirectPath" value="<%= ResourceUtil.getResourceProperty(resource, "redirectPath") %>"/>

<c:choose>
	<c:when test="${not empty linkText and not empty redirectPath}">
		<a href=".REDIRECT.html?redirectPath=${redirectPath}">${linkText}</a>
	</c:when>
	<c:otherwise>
		<a href="#">Redirect template</a>
	</c:otherwise>
</c:choose>  