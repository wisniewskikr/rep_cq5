<%@include file="/libs/foundation/global.jsp"%>
<%%>
<%@page session="false" contentType="text/html; charset=utf-8" %>
<%%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>


<head>
	<title>Hello World</title>
	<cq:includeClientLib js="myproject.all" />
	<cq:includeClientLib css="myproject.all" />
</head>
<cq:include script="head.jsp"/>


<body>
	<form method="POST" action="webapp.OUTPUT.html">
		<div class="page">
			<cq:include path="outputFormComponent" resourceType="webapp/components/outputFormComponent"/>
		</div>		
	</form>
</body>


</html>



