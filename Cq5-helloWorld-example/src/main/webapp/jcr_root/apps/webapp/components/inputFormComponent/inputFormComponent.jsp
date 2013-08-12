<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@page import="pl.kwi.utils.ResourceUtil" %>


<c:set var="outputPagePath" value="<%= ResourceUtil.getResourceProperty(resource, "outputPagePath") %>"/>
<c:set var="errorField" value="<%= request.getParameter("errorField") %>"/>
<c:set var="errorMessage" value="<%= request.getParameter("errorMessage") %>"/>



<input type="hidden" id="redirectPath" name="redirectPath" value="${outputPagePath}"/>


<div class="title"><h2>Hello World</h2></div>
<div class="subtitle"><h3>Page: <b>Input</b></h3></div>
<div class="content">
	<div class="contentElement">
		<div class="text">
			Name * 
			<c:if test="${errorField == 'name'}"><span class="error">${errorMessage}</span></c:if>
		</div>
		<div class="input"><input type="text" id="name" name="name"/></div>
		<div class="description">Type your name here</div>
	</div>
	
</div>
<div class="buttons">
	<input type="submit" id="ok" name="ok" value="OK" title="Go to next page"/>
</div>