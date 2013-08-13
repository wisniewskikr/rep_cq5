<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@page import="pl.kwi.utils.ResourceUtil" %>


<c:set var="name" value="<%= request.getParameter("name") %>"/>

<c:set var="inputPagePath" value="<%= ResourceUtil.getResourceProperty(resource, "inputPagePath") %>"/>
<c:set var="pageTitle" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "pageTitle", "Title") %>"/>
<c:set var="pageName" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "pageName", "Page Name") %>"/>
<c:set var="fieldHelloWorldText" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "fieldHelloWorldText", "Field Hello World Text") %>"/>
<c:set var="buttonText" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "buttonText", "Button Text") %>"/>


<input type="hidden" id="redirectPath" name="redirectPath" value="${inputPagePath}"/>


<div class="title"><h2>${pageTitle}</h2></div>
<div class="subtitle"><h3>Page: <b>${pageName}</b></h3></div>
<div class="content">
	<div class="contentElement">
		<div>&nbsp;</div>
		<div class="text"> ${fieldHelloWorldText} <b>${name}</b> </div>
		<div>&nbsp;</div>
	</div>
	
</div>
<div class="buttons">
	<input type="submit" id="back" name="back" value="${buttonText}" title="Go back to previous page"/>
</div>