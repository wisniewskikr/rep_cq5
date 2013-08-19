CQ5 AND HELLO WORLD EXAMPLE (WITH VALIDATION)





DESCRIPTION
===========


This is Hello World project for CQ. This project consists of two pages:
- input page: user types here his name;
- output page: text "Hello World <user_name>" is displayed here.

This project shows additionally:
- validation: user can not send empty name;
- java script: hints/titles for buttons are handled by jquery





CONFIGURATION
=============


All flexible configuration of project (server`s urls, logins, passwords etc.) can be changed in file:
<project_home>/project.properties





DEPLOYMENT
==========


User can deploy project using maven commands:

- Deployment of components on author server:
mvn clean install crx:install -Pauthor,componens

- Deployment of components on publish server:
mvn clean install crx:install -Ppublish,componens

- Deployment of content on author server:
mvn clean install crx:install -Pauthor,content

- Deployment of content on publish server:
mvn clean install crx:install -Ppublish,content