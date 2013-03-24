Cq5 and component:

-	in file .content.xml of template you have to add:
	*	jcr:primaryType="cq:Template"
	*	element jcr:content with:
		*	jcr:primaryType="cq:PageContent"
		*	sling:resourceType="webapp/components/testTemplate" (where is component of template)
		
-	create file *.jsp with content of template and with .content.xml having:
	jcr:primaryType="cq:Component"
    sling:resourceSuperType="foundation/components/page"
    componentGroup=".hidden"

-	build and install example by Maven command:
	mvn clean install crx:install