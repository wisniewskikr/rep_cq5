<%@include file="/libs/foundation/global.jsp"%>
<%%>

<body>

	<div class="title">CQ5 Sample Application</div>
	
	<div class="subtitle"><cq:include path="title" resourceType="webapp/components/helloWorldTitleComponent"/></div>
		
	<table>
		<tr>
			<td><cq:include path="message" resourceType="webapp/components/helloWorldMessageComponent"/></td>
			<td> </td>
			<td><b><cq:include path="name" resourceType="webapp/components/helloWorldNameComponent"/></b></td>
		</tr>
	</table>
	
	<cq:include path="par" resourceType="foundation/components/parsys"/>

</body>