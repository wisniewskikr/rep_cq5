package pl.kwi.workflow.processes;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;
import org.osgi.framework.Constants;

import com.day.cq.workflow.WorkflowException;
import com.day.cq.workflow.WorkflowSession;
import com.day.cq.workflow.exec.WorkItem;
import com.day.cq.workflow.exec.WorkflowProcess;
import com.day.cq.workflow.metadata.MetaDataMap;

@Component
@Service
@Properties({
		@Property(name = Constants.SERVICE_DESCRIPTION, value = "Prints text on console - 'ExampleWorkflowProcess - executed'."),
		@Property(name = Constants.SERVICE_VENDOR, value = "Wk"),
		@Property(name = "process.label", value = "Example Workflow Process") })
public class ExampleWorkflowProcess implements WorkflowProcess{

	public void execute(WorkItem workItem, WorkflowSession workflowSession, MetaDataMap metaDataMap)
			throws WorkflowException {
		
		System.out.println("ExampleWorkflowProcess - executed");
		
	}

}
