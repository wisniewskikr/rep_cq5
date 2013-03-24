Cq5 and js:

- 	.content.xml of template has to have path to resources: 
	cq:designPath="/etc/designs/webapp"

-	in path "/etc/designs/webapp" create folder "clientlib" with .content.txt:
	jcr:primaryType="cq:ClientLibraryFolder" (mark this folder as folder with libraries)
    categories="myproject.all" (mark this folder as "myproject.all)
    
-	in folder "clientlib" create file js.txt, where all js files are listed

-	in template *.jsp file in head section include libs marked by categories 
	<cq:includeClientLib js="myproject.all" />  
	
-	build and install example by Maven command:
	mvn clean install crx:install  
	 