CQ5 AND HELLO WORLD (HTML TAG "FORM" WITH VALIDATION AND ALL KIND OF TESTS)





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


User can deploy project using maven commands. Template of maven command looks like:

mvn clean install crx:install -P<location_profile>,<action_profile>
-------------------------------------------------------------------


Location profiles:
- author				: indicates author server as location
- publish				: indicates publish server as location


Action profiles:
- components			: deploys components
- content				: deploys content
- tests-accept-content	: deploys content for acceptance tests
- tests-intg-content	: deploys content for integration tests


Example maven commands:
mvn clean install crx:install -Pauthor,components
mvn clean install crx:install -Ppublish,tests-accept-content
etc.





TESTS
=====

User can run tests:

- Integration Tests (Repository):
mvn clean install -Ptests-intg-repository

- Integration Tests (Services):
mvn clean install -Ptests-intg-services

- Acceptance Tests:
mvn clean install -Ptests-accept





USAGE
=====


User can work with this project after deployment using following links:

- Author Server:
http://localhost:4502/cf#/content/webapp.html
http://localhost:4502/cf#/content/webapp/input.html
http://localhost:4502/cf#/content/webapp/output.html

- Publish Server:
http://localhost:4503/content/webapp.html