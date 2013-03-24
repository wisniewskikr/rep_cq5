Cq5 and component sidekick custom:
-	in template *.jsp file you have to just include sidekick component using cq tag:
	<cq:include path="par" resourceType="foundation/components/parsys"/>
	
-	if you want to add custom sidekick component then:
	*	in code
		*	in file .content of custom component add
			componentGroup="Test Group"
    		Group="TestGroup"
    	*	add file _cq_editConfig.xml which adds component to drag and drop sidekick	
	*	on page
		*	go to sidekick;
		*	choose design mode;
		*	choose edit;
		*	choose sidekick custom elements - for instance group Test Group;
		
-	build and install example by Maven command:
	mvn clean install crx:install