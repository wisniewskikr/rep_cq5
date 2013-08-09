<%@include file="/libs/foundation/global.jsp"%>
<%%>
<%@page session="false" contentType="text/html; charset=utf-8" %>
<%%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>


<head>
	<title>Hello World</title>
	<cq:includeClientLib js="myproject.all" />
	<cq:includeClientLib css="myproject.all" />
</head>
<cq:include script="head.jsp"/>


<body>
<form>

	<div class="page">
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
	</div>		

</form>
</body>


</html>



