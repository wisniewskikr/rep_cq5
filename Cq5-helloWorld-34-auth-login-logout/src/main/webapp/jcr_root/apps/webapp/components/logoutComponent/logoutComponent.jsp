<%@include file="/libs/foundation/global.jsp" %>

<%@page import="pl.kwi.utils.ResourceUtil" %>

<c:set var="redirectPath" value="<%= ResourceUtil.getResourceProperty(resource, "redirectPath") %>"/>

<c:choose>
	<c:when test="${not empty redirectPath}">
		<a href=".LOGOUT.html?redirectPath=${redirectPath}">Logout</a>
	</c:when>
	<c:otherwise>
		<a href="#">Logout template</a>
	</c:otherwise>
</c:choose>  