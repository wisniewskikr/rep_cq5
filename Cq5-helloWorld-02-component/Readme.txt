Cq5 and component:

-	in template *.jsp file you have to just include your component using cq tag:
	<cq:include path="par"resourceType="webapp/components/testComponent"/>
	
-	file .content.xml has to have:
	jcr:primaryType="cq:Component"
    sling:resourceSuperType="foundation/components/text" (for instance)
	
-	build and install example by Maven command:
	mvn clean install crx:install