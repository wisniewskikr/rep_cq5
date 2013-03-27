Cq5 and component with java:

If you want to connect component with java you have to:

-	create java classes;

-	in pom file:
	*	select packing as "bundle"
	*	create sling manifest using maven-bundle-plugin
	
-	in assembly cq.xml file
	*	include *.jar with bundle to folder "install" of *.zip file	
	
-	build and install example by Maven command:
	mvn clean install crx:install