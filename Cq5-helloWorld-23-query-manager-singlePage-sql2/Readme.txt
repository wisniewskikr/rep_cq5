CQ5 AND QUERY MANAGER


This project shows how query manager basing on SQL2 works. Query Manager is connected with count component which 
counts image and text components on single page.

So in this project exist three components from group "Text Group":
- image component: component with image;
- text component: component with text;
- count component: component which counts image and text components on single page.


If you want to use query manager (this id data base of cq5) then
you have to:
- add jcr dependency in POM file;
- inject ResourceResolverFactory in Service (for instance TestServiceImpl);
- get ResourceResolverFactory -> ResourceResolver -> Session -> Workspace -> QueryManager;
- create and run query.