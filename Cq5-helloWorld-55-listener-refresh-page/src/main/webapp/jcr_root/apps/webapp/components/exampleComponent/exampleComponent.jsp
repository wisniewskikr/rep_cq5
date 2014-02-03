<%@include file="/libs/foundation/global.jsp" %>

<c:set var="text" value="<%= currentNode.getProperty("text").getString() %>"/>

Text to display: <b>${text}</b> 

