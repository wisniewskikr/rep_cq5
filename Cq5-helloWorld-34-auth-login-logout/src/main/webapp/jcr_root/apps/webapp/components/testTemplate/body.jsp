<%@include file="/libs/foundation/global.jsp"%>
<%%>

<body>

	Hello World from Template
	
	<form action="/system/sling/logout">
		<input type="hidden" id="resource" name="resource" value="/content/webapp/en/login.html"/>	
		<input type="submit" value="Logout"/>
	</form>
	
	<a href="/system/sling/logout?resource=/content/webapp/en/login.html">Logout</a>
	
	<cq:include path="par" resourceType="foundation/components/parsys"/>

</body>