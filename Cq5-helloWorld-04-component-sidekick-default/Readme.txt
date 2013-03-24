Cq5 and component:
-	in template *.jsp file you have to just include sidekick component using cq tag:
	<cq:include path="par" resourceType="foundation/components/parsys"/>
	
-	if you want to add default sidekick component then:
	*	go to sidekick;
	*	choose design mode;
	*	choose edit;
	*	choose sidekick elements - for instance group General;
	
-	build and install example by Maven command:
	mvn clean install crx:install