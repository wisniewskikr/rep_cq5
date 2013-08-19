<%@include file="/libs/foundation/global.jsp"%>
<%%>
<%@page session="false" contentType="text/html; charset=utf-8" %>
<%%>
<%@page import="pl.kwi.utils.ResourceUtil" %>


<c:set var="outputPagePath" value="<%= ResourceUtil.getResourceProperty(resource, "outputPagePath") %>"/>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>


<head>
	<title>Hello World</title>
	<cq:includeClientLib js="myproject.all" />
	<cq:includeClientLib css="myproject.all" />
</head>
<cq:include script="head.jsp"/>


<body>

	<form method="GET" action="/content/webapp/output.html">
		<div class="page">
			<cq:include path="inputFormComponent" resourceType="webapp/components/inputFormComponent"/>
		</div>		
	</form>
	
</body>


</html>



