CQ5 AND MAPPING



In CQ all resources/pages with content have to be located in folder "content". That`s why by default user
has to use long path in url to get some page. For instance: http://localhost:4503/content/init.html. To remove
all unnecessary elements from path (hide them from user) developer has to use resolving and mapping. In this
way user can use improved url like: http://localhost:4503/init.html. 

In CQ url handling consists of two elements:
- resolving: 	resolving is mapping: url -> resource. Resolving informs CQ that if it gets some url then 
				it should desplay such resource. For instance if it gets url 
				http://localhost:4503/init.html then it should display resource: /content/init.
- mapping: 		Mapping is mapping: resource -> url. Mapping informs CQ with which url connect all links/redirections 
				on following resource. You can check mapping when you move mouse over some link on some page.  

In CQ all nodes/resources with mapping are by default located in location "etc/map/http". They have to hava at least
property "sling:Mapping". You can choose another folder for these nodes/resources (for instance etc/map.publish/http) in location: 
/system/console/components -> org.apache.sling.jcr.resource.internal.JcrResourceResolverFactoryImpl (property: resource.resolver.map.location)

You can check current resolving/mapping and test new solutions in location: system/console -> Sling Resource Resolver ->
Configuration Test. There is field "Test" where you can put:
- url: it should start from "http://" and after pressing button "Resolve" this url is changed into content;
- content: it should start from "/content" and after pressign button "Map" this mapping is changed into url.
Testing should work in this way that when you put url in field and press "Resolve" then you get some content.
And then when you put this content in firld and press "Map" then you should get original url.


Resolving and mapping in CQ Crx
===============================

Crx enables management of mapping resources. You can add them here, read, update and delete. 
Nodes/resources in Crx can have following properties:
- property "sling:Mapping": 		this property is obligatory for all resources with mapping;
- property "sling:match": 			this property indicates which url is handled here. It has following features:
									* it is not mandatory. If there is no such property then name of node 
									  is taken as "sling:match". But this property is stronger;
									* you have to use regexp here;
									* this property is herited. It means that final "sling:match" contains also 
									  "sling:match" from parent nodes; 
- property "sling:internalRedirect": value of this property replaces everything from url what fits to property
									"sling:match". And then this modified url is used in CQ. In most cases internalRedirect 
									begins from "/content". For instance: url is "http://www.domain.com/cc/dd". The match is 
									"http://www.domain.com". The internalRedirect is "/content/aa/bb". Final url will be then 
									in CQ: /content/aa/bb/cc/dd;
- property "sling:redirect": 		value of this property redirects to external page like "http://www.google.com". Default
									status is 302. With this property is connected property "sling:status";
- property "sling:status": 			this property is connected with "sling:redirect". Type of this property is Long. 
									It changes default status 302 for:
									* 301 - moved permanently;
									* 307 - temporary redirect;
									* etc.
- property "sling:alias": 			pozwala na symulacjê, ¿e dany resource jest równie¿ innym resourcem. Definiuje siê to w
									"page properties" lub w "jcr:content". Na przyk³ad je¿eli w resource "/content/visitors"
									damy "sling:alias - besucher" wtedy ten resource udaje równie¿ resoruce "/content/besucher".

	
Resolving and mapping in CQ Console
===================================

CQ Console (system/console -> Sling Resource Resolver) contains detailed informations about:
- location of folder with maps (Mapping Location);
- testing resolving and mapping (section Configuration Test);
- current resolving entries: 	this is definied in section "Resolver Map Entries". This section in connected with
								resolving, it means mapping: url -> resource. You have here two columns: 
								"Pattern" and "Replacement". CQ looks for whole "Pattern" in every url and when finds 	
								it then this "Pattern" is replaced with vaule from "Replacement". For instance: url is 
								"http://www.domain.com/cc/dd". "Pattern" is "http://www.domain.com". "Replacement"
								is "/content/aa/bb". Final url will be then in CQ: /content/aa/bb/cc/dd.
- current map entries: 			this is definiend in section "Mapping Map Entries". This section in connected with
								mapping, it means mapping: resource -> url. You have here two colums: 
								"Pattern" and "Replacement". Entries here are SORTED BY PATTERN: from the
								longest to the shortest. And CQ goes from up to down, takes first fit and replace by
								"Replacement". 

								
 Example regexp for mapping
===========================

The most useful regexp for mapping are: 
* [^/]/		: anything beteween two "/";
* $			: end of pattern. There is nothing more. Node with this mark on the end
			  should not have any childs;
* /(.*)		: take everything after "/" and remember as variable "$1" (next (.*) creates $2 etc.)


Example urls and mapping
========================

Url												Pattern								Replacement					Result
 http://localhost:4503/cc/dd					localhost.4503						/content/aa/bb				/content/aa/bb/cc/dd
 http://localhost:4503/cc/dd					localhost.4503/(.*)					/content/aa/bb/$1			/content/aa/bb/cc/dd
 http://localhost:4503/aa/bb/cc/dd				localhost.4503/(.*)/cc/dd			/content/$1/cc/dd			/content/aa/bb/cc/dd
 http://localhost:4503/dd/cc/aa/bb				localhost.4503/(.*)/(.*)/aa/bb		/content/aa/bb/$2/$1		/content/aa/bb/cc/dd
 http://localhost:4503/landingpage.html			[^/]/landingpage.html				/content/landingpage.html	/content/landingpage.html 			
 http://localhost:4503/test/landingpage.html	[^/]+/[^/]+/landingpage.html 		/content/landingpage.html	/content/landingpage.html
 http://localhost:4503/landingpage				localhost.4503/landingpage$			/content/landingpage/en		/content/landingpage/en
 http://localhost:4503/landingpage/				localhost.4503/landingpage			/content/landingpage/en		/content/landingpage/en/
 http://www.domain.com/test						www.domain.com/test 				/content/test				/content/test				

 It works in following way:
 - Cq looks for Pattern in Url and if it finds whole Pattern then replaces it with Replacement;
 - When you use regexp in Replacement then only Resolving will work but not Mapping;
 - When you use $ in Pattern then everything else in Url is ignored; 