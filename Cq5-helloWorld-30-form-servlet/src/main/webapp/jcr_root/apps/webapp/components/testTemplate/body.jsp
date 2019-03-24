<%@include file="/libs/foundation/global.jsp"%><%
%><body>

	Hello World from Template
<!-- 
This example redirects results to form commponent without the "container"
page. Another way to do this without replacing the user's page, 
<input type="hidden" 
	name=":redirect" 
	value="<%=request.getRequestURL().toString()%>"
to return to page containing component. Could be more web-friendly
-->
	<form method="POST" action="webapp.SELECTORNAME.html">
	   	<input type="hidden" name=":redirect" value="/content/webapp.html" />
	    <input type="text" name="variable" />
	   	<input type="Submit" />
	</form>

</body>
