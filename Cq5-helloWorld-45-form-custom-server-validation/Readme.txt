CQ5 AND FORM CUSTOM SERVER VALIDATION


This tutorial is about creating custom server validation for form action. In this example action has name "Custom Action"
and redirect user to specified page with parameter "text". This example shows how to use custom server validation - by file
"servervalidation.xml" in form`s component. This file takes care about validation on server side. Component "form/text"
is validated.


This tutorial contains also example content. It consists of two pages:
- example/form: page with form with field "text". Also server side validation takes place here.
- example/result: page with component which displays text and link which redirects to form page.