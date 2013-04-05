Cq5 and component dialog:

-	in component folder create file dialog.xml with:
	jcr:primaryType="cq:Dialog"
    xtype="panel" (for instance)
    *	in file dialog.xml define elements with
    	jcr:primaryType="cq:Widget"
        xtype="textfield" (for instance)
        
-	in file *.jsp connect this file with dialog by:
	<cq:setContentBundle/>
	*	display value from dialog by:
	<fmt:message key="testComponentText"/> (for instance)
	
-	build and install example by Maven command:
	mvn clean install crx:install