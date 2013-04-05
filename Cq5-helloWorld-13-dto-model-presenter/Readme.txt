Cq5 and dto-model-presenter

Dto, Model and Presenter are three classes created by cognifide company
to manage cq components. Class of Presenter is central point. Class of Dto
receives data from dialog. Class of Model returns data to compnent.

-	in *.pom file add dependencies with group com.cognifide.cq and artifact framework-54

-	in *.pom file add id and version to maven-assembly-plugin

-	in assembly *.xml file add dependency set with cognifide dependencies

-	create Dto, Model and Presenter classes

-	improve component *.jsp file. Add Presenter class import and usage 
	
-	build and install example by Maven command:
	mvn clean install crx:install