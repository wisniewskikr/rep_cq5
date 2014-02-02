CQ5 AND FORM VALIDATION REQUIRED COMPONENT


This tutorial is about creating validation for form with required
component. It shows how to display message that choosing component
is reqiured inside form.


It has to be done at the end of "form -> start -> start.jsp" file
<%@ page import="pl.kwi.form.utils.FormUtil,
                 pl.kwi.form.utils.Model"%>
<c:set var="model" value="<%=new FormUtil().getModelWithResultComponentExist(resource, "text")%>"/>                 
<c:if test="${!model.componentExists}">
	<div style="background-color: red">Component does not exist</div>
</c:if>


Also every comoponent of for (like "text") has to have implemented listener which refresh page:
    <cq:listeners
        jcr:primaryType="cq:EditListenersConfig"
        aftercopy="REFRESH_PAGE"
        afterdelete="REFRESH_PAGE"
        afterinsert="REFRESH_PAGE"/> 