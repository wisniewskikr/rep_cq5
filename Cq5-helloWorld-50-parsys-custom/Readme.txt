CQ5 AND CUSTOM PARSYS



This tutorial is about creatign custom parsys in CQ5 project.
Parsys means "paragraph system' and it`s a place on template 
where user can place components. Using parsys you can manage such things like:
- allowed components in this parsys;
- empty text massage;
- etc.



To create custom parsys user have to:
- add component with 'sling:resourceSuperType="foundation/components/parsys"';
- to change empty text user has to in <parsys>/new/_cq_editConfig.xml add 'cq:emptyText="Some empty text"';
- to restrict components in custom parsys user has to go to "etc/designs/webapp/.content.xml" and use
element "component".