CQ5 AND HELLO WORLD (HTML TAG "FORM" WITH VALIDATION AND TESTS)





DESCRIPTION
===========


This is Hello World project for CQ. This project consists of two pages:
- input page: user types here his name;
- output page: text "Hello World <user_name>" is displayed here.

This project shows additionally:
- html tag "form": just html tag "form" is here used;
- validation: user can not send empty name;
- java script: hints/titles for buttons are handled by jquery
- tests: junit tests





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





TESTS
=====

User can run tests:

- Unit Tests:
mvn clean test -Punit

- Integration Tests:
mvn clean install -Pintg

- Acceptance Tests:
mvn clean install -Paccept





USAGE
=====


User can work with this project after deployment using following links:

- Author Server:
http://localhost:4502/cf#/content/webapp.html
http://localhost:4502/cf#/content/webapp/input.html
http://localhost:4502/cf#/content/webapp/output.html

- Publish Server:
http://localhost:4503/content/webapp.html