CQ5 AND LOGIN


This project is connected with authentication and login to restrict page. It shows how log in works basing on example content. 
Example content consists of:
- restricted page: /content/webapp/en/pages/page.html
- login page: /content/webapp/en/login.html
To use it you have to try get access to restricted page (page.html) without log in. You will be redirected
to log in page (login.html).

Stages of creating authentication:
1. Create login page
2. Restrict page


Ad 1\ Create login page
You have to add login and password in dialog:
General -> Login

 
 Ad 2\ Restrict page
 You have to add restriction to page. In sidekick choose: Page -> Page Properties... -> Advanced -> Closed User Group
 Here you have to choose:
 - Enabled
 - Login Page
 - Admitted Groups