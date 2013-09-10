<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@page import="pl.kwi.utils.pl.kwi.services.ResourceService" %>


<c:set var="name" value="<%=request.getParameter("name")%>"/>

<c:set var="inputPagePath" value="<%=ResourceService.getResourceProperty(resource, "inputPagePath")%>"/>
<c:set var="pageTitle" value="<%=ResourceService.getResPropWithDefaultValue(resource, "pageTitle", "Title")%>"/>
<c:set var="textPage" value="<%=ResourceService.getResPropWithDefaultValue(resource, "textPage", "Page Text")%>"/>
<c:set var="pageName" value="<%=ResourceService.getResPropWithDefaultValue(resource, "pageName", "Page Name")%>"/>
<c:set var="textHelloWorld" value="<%=ResourceService.getResPropWithDefaultValue(resource, "textHelloWorld", "Field Hello World Text")%>"/>
<c:set var="buttonText" value="<%=ResourceService.getResPropWithDefaultValue(resource, "buttonText", "Button Text")%>"/>
<c:set var="buttonHint" value="<%=ResourceService.getResPropWithDefaultValue(resource, "buttonHint", "Hint")%>"/>


<input type="hidden" id="redirectPath" name="redirectPath" value="${inputPagePath}"/>


<div class="title"><h2>${pageTitle}</h2></div>
<div class="subtitle"><h3>${textPage}: <b>${pageName}</b></h3></div>
<div class="content">
	<div class="contentElement">
		<div>&nbsp;</div>
		<div class="text"> ${textHelloWorld} <b>${name}</b> </div>
		<div>&nbsp;</div>
	</div>
	
</div>
<div class="buttons">
	<input type="submit" id="back" name="back" value="${buttonText}" title="${buttonHint}"/>
</div>