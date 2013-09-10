<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@page import="pl.kwi.utils.pl.kwi.services.ResourceService" %>


<c:set var="currentPagePath" value="<%=currentPage.getPath()%>"/>
<c:set var="errorField" value="<%=request.getParameter("errorField")%>"/>

<c:set var="outputPagePath" value="<%=ResourceService.getResourceProperty(resource, "outputPagePath")%>"/>
<c:set var="pageTitle" value="<%=ResourceService.getResPropWithDefaultValue(resource, "pageTitle", "Title")%>"/>
<c:set var="textPage" value="<%=ResourceService.getResPropWithDefaultValue(resource, "textPage", "Text Page")%>"/>
<c:set var="pageName" value="<%=ResourceService.getResPropWithDefaultValue(resource, "pageName", "Page Name")%>"/>
<c:set var="textName" value="<%=ResourceService.getResPropWithDefaultValue(resource, "textName", "Text Name")%>"/>
<c:set var="fieldNameDescription" value="<%=ResourceService.getResPropWithDefaultValue(resource, "fieldNameDescription", "Description")%>"/>
<c:set var="fieldNameErrorMessage" value="<%=ResourceService.getResPropWithDefaultValue(resource, "fieldNameErrorMessage", "Error Message")%>"/>
<c:set var="buttonText" value="<%=ResourceService.getResPropWithDefaultValue(resource, "buttonText", "Button Text")%>"/>
<c:set var="buttonHint" value="<%=ResourceService.getResPropWithDefaultValue(resource, "buttonHint", "Hint")%>"/>


<input type="hidden" id="redirectPath" name="redirectPath" value="${outputPagePath}"/>
<input type="hidden" id="currentPagePath" name="currentPagePath" value="${currentPagePath}"/>


<div class="title"><h2 id="title">${pageTitle}</h2></div>
<div class="subtitle"><h3 id="subtitle">${textPage}: <b>${pageName}</b></h3></div>
<div class="content">
	<div class="contentElement">
		<div class="text">
			${textName} * 
			<c:if test="${errorField == 'name'}"><span class="error" id="errorName">${fieldNameErrorMessage}</span></c:if>
		</div>
		<div class="input"><input type="text" id="name" name="name"/></div>
		<div class="description" id="descriptionName">${fieldNameDescription}</div>
	</div>
	
</div>
<div class="buttons">
	<input type="submit" id="ok" name="ok" value="${buttonText}" title="${buttonHint}"/>
</div>