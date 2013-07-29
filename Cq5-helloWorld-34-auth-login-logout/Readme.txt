CQ5, LOGIN AND LOGOUT


!Attention
Log out does not work properly - CQ and custom solutions.


This project is connected with authentication and login to restrict page. It shows how log out works basing on example content. 
Example content consists of:
- restricted page: /content/webapp/en/pages/page.html
- login page: /content/webapp/en/login.html
To use it you have to log in to restricted page (page.html). Then you can log out. You will be automatically redirected
to log in page.


To log out you can use:
- a and href: /system/sling/logout.html
- form and action: /system/sling/logout.html


You can also indicate page where you want to be redirected after log out. For this you should use parameter "resource".
For instance:

- a and href: 
	<a href="/system/sling/logout?resource=/content/webapp/en/login.html">Logout</a>
	
- form and action:
	<form action="/system/sling/logout">
		<input type="hidden" id="resource" name="resource" value="/content/webapp/en/login.html"/>	
		<input type="submit" value="Logout"/>
	</form> 