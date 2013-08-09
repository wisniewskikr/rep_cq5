<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@page import="pl.kwi.utils.ResourceUtil" %>


<c:set var="inputPagePath" value="<%= ResourceUtil.getResourceProperty(resource, "inputPagePath") %>"/>


<input type="hidden" id="redirectPath" name="redirectPath" value="${inputPagePath}"/>


<div class="title"><h2>Hello World</h2></div>
<div class="subtitle"><h3>Page: <b>Output</b></h3></div>
<div class="content">
	<div class="contentElement">
		<div>&nbsp;</div>
		<div class="text"> Hello World <b>NAME</b> </div>
		<div>&nbsp;</div>
	</div>
	
</div>
<div class="buttons">
	<input type="submit" id="back" name="back" value="Back" title="Go back to previous page"/>
</div>