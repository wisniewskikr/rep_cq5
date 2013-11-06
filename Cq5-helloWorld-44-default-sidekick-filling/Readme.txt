CQ5 AND DEFAULT SIDEKICK FILLING


This tutorial is about filling sidekick with default components on specified template. 
In other way it shows how to create such situation: after adding template to project 
sidekick with specified components should appear.


To do it developer has to perform following steps:
- for template in file ".content.xml" he has to add cq:designPath="/etc/designs/webapp";
- in file "jcr_root/etc/designs/webapp/.content.xml" he has to connect template
with sidekick  


Attention!!!
Property cq:designPath="/etc/designs/webapp" is added by adding template to project.
If template already exists then content manager has to add it manually in ctx.