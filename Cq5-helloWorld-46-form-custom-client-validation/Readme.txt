CQ5 AND FORM CUSTOM CLIENT VALIDATION


This tutorial is about creating custom client validation for form action. In this example action has name "Custom Action"
and redirect user to specified page with parameter "text". This example shows how to use custom client validation - by file
"clientvalidation.xml" in form`s component. This file takes care about validation on client side. Component "form/text"
is validated.


This tutorial contains also example content. It consists of two pages:
- example/form: page with form with field "text". Also server side validation takes place here.
- example/result: page with component which displays text and link which redirects to form page.