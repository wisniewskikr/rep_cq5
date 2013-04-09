Cq5 and css:

- 	.content.xml of template has to have path to resources: 
	cq:designPath="/etc/designs/webapp"

-	in path "/etc/designs/webapp" create folder "clientlib" with .content.xml:
	jcr:primaryType="cq:ClientLibraryFolder" (mark this folder as folder with libraries)
    categories="myproject.all" (mark this folder as "myproject.all)
    
-	in folder "clientlib" create file css.txt, where all css files are listed

-	in template *.jsp file in head section include libs marked by categories 
	<cq:includeClientLib css="myproject.all" />
	
-	for static.css in path "/etc/designs/webapp" create .content.xml with
	jcr:primaryType="cq:Page"
	 
-	for static.css in path "/etc/designs/webapp" create file
	static.css with css	  
	
-	build and install example by Maven command:
	mvn clean install crx:install  
	 