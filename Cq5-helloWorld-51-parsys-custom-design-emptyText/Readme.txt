CQ5 AND CUSTOM PARSYS WITH EMPTY TEXT FROM ETC/DESIGH



This tutorial is about creating custom parsys with empty text taken from etc/design
(not from '<parsys>/new/_cq_editConfig.xml' as usual). To do it developer has to 
use class ParsysUtil. For instance:

<%
    	ParsysUtil.applyEmptyText(slingRequest, editContext);
 %>