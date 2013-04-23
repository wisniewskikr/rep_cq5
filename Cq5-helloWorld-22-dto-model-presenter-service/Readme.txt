CQ5 AND D-M-P AND SERVICE


If you want to use service in Dto-Model-Presenter then
you have to use method from Presenter: getSling(SlingHttpServletRequest),
and then use method: getService(TestService.class) to get service. 