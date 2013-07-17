CQ5 AND LANDING PAGE

Project "Landing Page" is an example project of Cq5. This little project consists only of two elements:
- "Landing Page" Template: 		this is a template of page where you can add redirected links;
- Link Component: 				this is a link which can redirect you to other country page. It contains small and 
								big flag of country where you will be redirected


 
USAGE
To use "Landing Page" project you have to do following steps: 

1. Run cq server
Run it in author mode with default values (port=4502, login=admin, password=admin).


2. Run install maven command
Run following maven command on project "Cq5-landing-page":
mvn clean install crx:install


3. Display "Landing Page" content
Type in brower:
http://localhost:4502/cf#/content/landingpage.html


4. Add "Link Component" to sidekick
- On sidekick (small cq dialog) choose mode: Design
- On "Design of par" choose: Edit -> Landing Page Group -> Ok
- On sidekick choose mode: Edit
You should see now on sidekick element "Landing Page Group" with one
component "Link Component".


5. Add "Link Component" to template
 To add "Link Component" to template you have to just drag and drop
 it from sidekick to template. 
 	Then right mouse click on this element and choose "Edit". You should
 see dialog with three tabs: 
 - Small flag;
 - Big flag;
 - Data.	 