<%@include file="/libs/foundation/global.jsp"%>
<%%>

<%@ page import="pl.kwi.form.utils.FormUtil,
                 pl.kwi.form.utils.Model"%>
<c:set var="model" value="<%=new FormUtil().getModelWithResultComponentExist(resource, "jcr:content/par/examplecomponent")%>"/>                 


<body>

	<c:if test="${!model.componentExists}">
		<div style="background-color: red">Component not added to template</div>
	</c:if>
	
	<cq:include path="par" resourceType="foundation/components/parsys"/>

</body>