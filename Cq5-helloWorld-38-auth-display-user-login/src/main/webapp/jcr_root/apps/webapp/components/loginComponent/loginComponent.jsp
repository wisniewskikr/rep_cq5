<%@include file="/libs/foundation/global.jsp" %>

<%@page import="pl.kwi.utils.LoginUtil" %>

<c:set var="isUserLoggedIn" value="<%=LoginUtil.isUserLoggedIn(slingRequest)%>"/>
<c:set var="userId" value="<%=LoginUtil.getUserId(slingRequest)%>"/>

<c:choose>
	<c:when test="${isUserLoggedIn}">
		You are logged in as <b>${userId}</b>.
	</c:when>
	<c:otherwise>
		You are not logged in
	</c:otherwise>
</c:choose>  