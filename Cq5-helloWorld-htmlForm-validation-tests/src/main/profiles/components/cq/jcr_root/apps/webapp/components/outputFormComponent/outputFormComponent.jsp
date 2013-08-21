<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@page import="pl.kwi.utils.ResourceUtil" %>


<c:set var="name" value="<%= request.getParameter("name") %>"/>

<c:set var="inputPagePath" value="<%= ResourceUtil.getResourceProperty(resource, "inputPagePath") %>"/>
<c:set var="pageTitle" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "pageTitle", "Title") %>"/>
<c:set var="textPage" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "textPage", "Page Text") %>"/>
<c:set var="pageName" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "pageName", "Page Name") %>"/>
<c:set var="textHelloWorld" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "textHelloWorld", "Field Hello World Text") %>"/>
<c:set var="buttonText" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "buttonText", "Button Text") %>"/>
<c:set var="buttonHint" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "buttonHint", "Hint") %>"/>


<input type="hidden" id="redirectPath" name="redirectPath" value="${inputPagePath}"/>


<div class="title"><h2 id="title">${pageTitle}</h2></div>
<div class="subtitle"><h3 id="subtitle">${textPage}: <b>${pageName}</b></h3></div>
<div class="content">
	<div class="contentElement">
		<div>&nbsp;</div>
		<div class="text" id="textHelloWorld"> ${textHelloWorld} <b id="nameHelloWorld">${name}</b> </div>
		<div>&nbsp;</div>
	</div>
	
</div>
<div class="buttons">
	<input type="submit" id="back" name="back" value="${buttonText}" title="${buttonHint}"/>
</div>