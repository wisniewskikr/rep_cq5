<%@include file="/libs/foundation/global.jsp" %>

<c:set var="path" value="<%= currentNode.getProperty("path").getString() + ".html" %>"/>
<c:set var="text" value="<%= currentNode.getProperty("text").getString() %>"/>

<a href="${path}">${text}</a>

