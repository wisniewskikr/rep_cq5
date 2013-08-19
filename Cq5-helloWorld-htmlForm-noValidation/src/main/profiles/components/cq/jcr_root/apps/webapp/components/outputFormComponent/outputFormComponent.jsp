<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@page import="pl.kwi.utils.ResourceUtil" %>


<c:set var="name" value="<%= request.getParameter("name") %>"/>

<c:set var="pageTitle" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "pageTitle", "Title") %>"/>
<c:set var="textPage" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "textPage", "Page Text") %>"/>
<c:set var="pageName" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "pageName", "Page Name") %>"/>
<c:set var="textHelloWorld" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "textHelloWorld", "Field Hello World Text") %>"/>
<c:set var="buttonText" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "buttonText", "Button Text") %>"/>
<c:set var="buttonHint" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "buttonHint", "Hint") %>"/>


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