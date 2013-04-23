CQ5 AND QUERY MANAGER


If you want to use query manager (this id data base of cq5) then
you have to:
- add jcr dependency in POM file;
- inject ResourceResolverFactory in Service (for instance TestServiceImpl);
- get ResourceResolverFactory -> ResourceResolver -> Session -> Workspace -> QueryManager;
- create and run query.