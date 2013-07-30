<%@include file="/libs/foundation/global.jsp"%>
<%%>

<body>

	Hello World from Template
	
	</br>
	
	<a href="/system/sling/logout?resource=/content/webapp/en/login.html">Logout</a>
	
	</br>
	
	<form action="/system/sling/logout">
		<input type="hidden" id="resource" name="resource" value="/content/webapp/en/login.html"/>	
		<input type="submit" value="Logout"/>
	</form> 
	
	<cq:include path="par" resourceType="foundation/components/parsys"/>

</body>