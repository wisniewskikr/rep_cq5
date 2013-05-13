CQ5 AND FILTERS


Filters are java classes which are performed before and after request. In CQ class of filter
has to fulfill following conditions:
- implement javax.servlet.Filter;
- has annotation @Component
- has annotation @Service
- has annotation @Properties with at least "scope"