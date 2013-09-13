CQ5 AND CONTENT PACKAGE MAVEN PLUGIN





Content package maven plugin is a Maven plugin which enables deploying
zip package in CQ server. This zip package can contain components and
any jar from Maven repository. 

Attention!!!
User can not use this plugin together with bundle because jar has to
be already installed in Maven repository.





Usage
=====

To use this plugin user has to:


* define all additional jars in dependencies
For instance:

<dependency>
  		<groupId>pl.kwi</groupId>
 		<artifactId>Cq5-helloWorld-42-deployment-without-crx-bundle</artifactId>
  		<version>1.0</version>
  	</dependency>
  	
 
 * define plugin
 For instance: 	

 <plugin>
                <groupId>com.day.jcr.vault</groupId>
                <artifactId>content-package-maven-plugin</artifactId>
                <extensions>true</extensions>
                <configuration>
                    <group>My Company</group>                    
                    <builtContentDirectory>src/main/content/jcr_root</builtContentDirectory>
                    <filterSource>src/main/content/META-INF/vault/filter.xml</filterSource>
                    <targetURL>${crx.url}/crx/packmgr/service.jsp</targetURL>
                    <embeddeds>
                        <embedded>
                            <groupId>pl.kwi</groupId>
                            <artifactId>Cq5-helloWorld-42-deployment-without-crx-bundle</artifactId>
                            <target>/apps/Cq5-helloWorld-42-deployment-without-crx/install</target>
                        </embedded>
                 	</embeddeds> 
                </configuration>                      
                <executions>                
                    <execution>
                        <phase>install</phase>
                        <goals>
                        	<goal>package</goal>
                            <goal>install</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>  


* run maven command to deploy on server

mvn clean install              