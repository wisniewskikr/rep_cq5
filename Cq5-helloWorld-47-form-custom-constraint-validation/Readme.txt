CQ5 AND FORM CUSTOM CONSTRAINT VALIDATION


This tutorial is about creating custom constraint validation for form action. In this example action has name "Custom Action"
and redirect user to specified page with parameter "text". This example shows how to use custom constraint validation - 
in form field with text can contain only specific chars. There are some default cq constraints: email, numeric etc. 

Developer can create some custom constraint. To do it he has to:
- in component "form" add folder "constraint" with specific constraint. For instance "alphabetic" which checks if only
alphabetic chars are typed in field;
- in folder "alphabetic" he has to update:
* .content.xml: 				update "constraintMessage" and "hint";
* clientvalidation.xml: 		line - final String regexp = "/([A-Za-z])+/";
* servervalidation.xml: 		line - final Pattern p = Pattern.compile("([A-Za-z])+");


This tutorial contains also example content. It consists of two pages:
- example/form: page with form with field "text". Also server side validation takes place here.
- example/result: page with component which displays text and link which redirects to form page.