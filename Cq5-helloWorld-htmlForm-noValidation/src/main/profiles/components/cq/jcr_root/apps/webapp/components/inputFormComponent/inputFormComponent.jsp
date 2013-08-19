<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@page import="pl.kwi.utils.ResourceUtil" %>


<c:set var="pageTitle" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "pageTitle", "Title") %>"/>
<c:set var="textPage" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "textPage", "Text Page") %>"/>
<c:set var="pageName" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "pageName", "Page Name") %>"/>
<c:set var="textName" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "textName", "Text Name") %>"/>
<c:set var="fieldNameDescription" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "fieldNameDescription", "Description") %>"/>
<c:set var="buttonText" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "buttonText", "Button Text") %>"/>
<c:set var="buttonHint" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "buttonHint", "Hint") %>"/>


<div class="title"><h2>${pageTitle}</h2></div>
<div class="subtitle"><h3>${textPage}: <b>${pageName}</b></h3></div>
<div class="content">
	<div class="contentElement">
		<div class="text">
			${textName} 
		</div>
		<div class="input"><input type="text" id="name" name="name"/></div>
		<div class="description">${fieldNameDescription}</div>
	</div>
	
</div>
<div class="buttons">
	<input type="submit" id="ok" name="ok" value="${buttonText}" title="${buttonHint}"/>
</div>