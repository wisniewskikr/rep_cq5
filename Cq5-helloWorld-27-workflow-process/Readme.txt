CQ5 AND WORKFLOW PROCESS


CQ Workflow is specified set of tasks which are done in some order. CQ Workflow can be launched:
- manually: by user. He just has to select Workflow and press "Start";
- on event: for instance Workflow can be launched on creating file in specified location.
 
There are some default CQ tasks but it is also possible to create your own task in IDE. There are two types of tasks:
- with user action: user has to do some action to complete task. For instance confirming or rejecting blog`s comment etc.
- without user action: task is done automatically by system without user action. For instance sending mail etc.



RUN WORKFLOW PROCESS

In CQ go to section "Workflows" to tab "Models". Choose model, click right mouse button and press "Start". It should run
process so text "ExampleWorkflowProcess - executed" should be displayed on console. You can also go to tab "Archive" 
and see that this process has status "Completed".



CONFIGURE WORKFLOW PROCESS

Steps for running workflow process:


1. Update pom

Add following dependencies:

		<!-- Dependencies with workflow -->
		<dependency>
			<groupId>com.day.cq.workflow</groupId>
			<artifactId>cq-workflow-api</artifactId>
			<version>5.4.2</version>
			<scope>provided</scope>
		</dependency>
		
		<!-- Dependencies with osgi core - 
		for instance with constants -->
		<dependency>
			<groupId>org.osgi</groupId>
			<artifactId>org.osgi.core</artifactId>
			<version>4.2.0</version>
			<scope>provided</scope>
		</dependency>
		

2. Create class implementing interface WorkflowProcess

For instance ExampleWorkflowProcess.


3. Create new Model

In CQ go to section "Workflows" to tab "Models" and crate there new model. For instance "Example Model".


4. Add "Process Step" to model

To add "Process Step" to model you have to:
- double click on created model;
- remove everything between "Flow Start" and "Flow End";
- add element "Process Step" from Sidekick. This is group "Workflow"


5. Configure "Process Step"

To configure "Process Step" you have to:
- double click on "Process Step"
- in tab "Common" you can add some title. For instnce "Example Workflow Process"
- in tab "Process" you have to add some process. Choose "Example Workflow Process"
- check "Handle Advance". This calls next step after this.


6. Run process

 In CQ go to section "Workflows" to tab "Models". Choose model, click right mouse button and press "Start". It should run
 process so text "ExampleWorkflowProcess - executed" should be displayed on console. You can also go to tab "Archive" 
 and see that this process has status "Completed".
 		