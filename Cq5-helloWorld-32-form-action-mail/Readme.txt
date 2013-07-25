CQ5 FORM WITH ACTION TYPE MAIL


This tutorial is about using form and action type "Mail". 
This action type is about sending all data from form to e-mail.

Example content:
http://localhost:4502/cf#/content/webapp.html


Steps:


1. Setup mail service
Go to:
http://localhost:4502/system/console/configMgr/com.day.cq.mailer.DefaultMailService
Setup smtp service:
- SMTP server host name			: smtp.gmail.com
- SMTP server port				: 465
- SMTP user						: wisniewskikr@gmail.com
- SMTP password					: password
- "From" address				: wisniewskikr@gmail.com
- SMTP use SSL					: true


2. Create form
Add form
Add fields to form
Edit form:
- Action Type					: Mail
- Action Configuration/From		: wisniewskikr@gmail.com
- Action Configuration/Mailto	: wisniewskikr@gmail.com
- Action Configuration/Subject	: Test mail   