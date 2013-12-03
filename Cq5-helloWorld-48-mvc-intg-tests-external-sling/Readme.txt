CQ5 WITH MVC AND INTEGRATION TESTS WIHT EXTERNAL SLING



This tutorial is about CQ project basing on framework Mvc and 
testing this project by integration tests with external sling. 
It means that tests are deployed on CQ and then you can run them
by page "/system/sling/junit/" or by unit tests.

Deployment on author
====================
mvn clean install crx:install

Attention!!!
============
First time this project has to be run without tests because
package with tests must be installed on server before running
integration tests. Use command: 

mvn clean install crx:install -DskipTests=true



To use these tests you have to perform following steps:


1. Add to pom.xml dependencies with external sling

<dependency>
	<groupId>junit</groupId>
	<artifactId>junit</artifactId>
	<version>4.11</version>			
</dependency>		
<dependency>
	<groupId>org.apache.sling</groupId>
	<artifactId>org.apache.sling.junit.core</artifactId>
	<version>1.0.8</version>
</dependency>
<dependency>
	<groupId>org.junit</groupId>
	<artifactId>com.springsource.org.junit</artifactId>
	<version>4.8.2</version>
</dependency>
<dependency>
	<groupId>org.apache.sling</groupId>
	<artifactId>org.apache.sling.commons.testing</artifactId>
	<version>2.0.14</version>
</dependency>


2. Include dependencies to package

In assert file you have to add dependencies with JUnit which hat to be 
installed on CQ. You can check it when after deployment page "/system/sling/junit/"
is not empty.

<include>org.junit</include>
<include>org.apache.sling</include>	


3. Create test class

Test class has to have:
- annotation @RunWith(SlingAnnotationsTestRunner.class)
- it has to be placed in common folder, not test folder. This is necessary
because this test has to be deployed on CQ server.


4. Add element in pom.xml

In pom.xml file in maven-bundle-plugin has to be added element
<Sling-Test-Regexp>.*Test</Sling-Test-Regexp>

   
5. Add to pom.xml dependencies with remote runner

<dependency>
	<groupId>com.googlecode.json-simple</groupId>
	<artifactId>json-simple</artifactId>
	<version>1.1</version>
	<scope>test</scope>
</dependency> 
<dependency>
	<groupId>org.apache.sling</groupId>
	<artifactId>org.apache.sling.junit.remote</artifactId>
	<version>1.0.8</version>
	<scope>test</scope>
</dependency> 


6. Create class with remote runner

This class will simulate click button "Execute these tests" on 
page "system/sling/junit/". This class has to have:
- annotation @RunWith(SlingRemoteTestRunner.class)
- it has to be placed in test folder. In this way this simulation
will take place during tests
 