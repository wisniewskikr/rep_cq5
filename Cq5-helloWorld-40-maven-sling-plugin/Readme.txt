CQ5 AND MAVEN SLING PLUGIN





Maven Sling Plugin enables installing only bundle without any content.
It other words it enables installing only services. It can be used only
for project with packaging - bundle.

Attention!!!
User has to create destination folder by hand. Otherwise he gets exception.
For instance:
apps/cq5-helloWorld-40-maven-sling-plugin/install





Usage
=====

To use maven sling plugin user has to:

* add dependency with plugin
<dependency>
	<groupId>org.apache.sling</groupId>
	<artifactId>maven-sling-plugin</artifactId>
	<version>2.1.0</version>
</dependency>

* create destination folder in Cq by hand
For instance: cq5-helloWorld-40-maven-sling-plugin/install

* deploy bundle with maven command
For instance: mvn clean install