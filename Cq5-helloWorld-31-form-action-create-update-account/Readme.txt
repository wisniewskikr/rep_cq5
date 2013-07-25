CQ5 FORM WITH ACTION TYPE "CREATE AND UPDATE ACCOUNT"


This tutorial is about using form and action type "Create and Update Account". 
This action type is about creating and updating account from page.

Example content:
http://localhost:4502/cf#/content/webapp.html


Steps:

To use it you have to:
- add form to template;
- set action "Create and Update Account" in form;
- set "administrators" in Action Configuration -> Initial Group;
- add following elements to the form:
* password and confirm: 		component "Password reset" and name rep:password;
* user id: 						component "Account Name" and name rep:userId;
* first name: 					component "Text Field" and name givenName;
* last name: 					component "Text Field" and name familyName;
* email: 						component "Email" and name email;
  