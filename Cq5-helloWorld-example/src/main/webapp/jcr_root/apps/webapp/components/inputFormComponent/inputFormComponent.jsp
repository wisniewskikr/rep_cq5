<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@page import="pl.kwi.utils.ResourceUtil" %>


<c:set var="currentPagePath" value="<%= currentPage.getPath() %>"/>
<c:set var="errorField" value="<%= request.getParameter("errorField") %>"/>

<c:set var="outputPagePath" value="<%= ResourceUtil.getResourceProperty(resource, "outputPagePath") %>"/>
<c:set var="pageTitle" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "pageTitle", "Title") %>"/>
<c:set var="pageName" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "pageName", "Page Name") %>"/>
<c:set var="fieldNameText" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "fieldNameText", "Field Text") %>"/>
<c:set var="fieldNameDescription" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "fieldNameDescription", "Description") %>"/>
<c:set var="fieldNameErrorMessage" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "fieldNameErrorMessage", "Error Message") %>"/>
<c:set var="buttonText" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "buttonText", "Button Text") %>"/>


<input type="hidden" id="redirectPath" name="redirectPath" value="${outputPagePath}"/>
<input type="hidden" id="currentPagePath" name="currentPagePath" value="${currentPagePath}"/>


<div class="title"><h2>${pageTitle}</h2></div>
<div class="subtitle"><h3>Page: <b>${pageName}</b></h3></div>
<div class="content">
	<div class="contentElement">
		<div class="text">
			${fieldNameText} * 
			<c:if test="${errorField == 'name'}"><span class="error">${fieldNameErrorMessage}</span></c:if>
		</div>
		<div class="input"><input type="text" id="name" name="name"/></div>
		<div class="description">${fieldNameDescription}</div>
	</div>
	
</div>
<div class="buttons">
	<input type="submit" id="ok" name="ok" value="${buttonText}" title="Go to next page"/>
</div>