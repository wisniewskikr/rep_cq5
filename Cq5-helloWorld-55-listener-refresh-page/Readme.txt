CQ5 LISTENER REFRESH PAGE


This tutorial is about adding listener with refresh page to component. It means
that when you insert or delete some component then whole page should be refreshed.


To do it you have to add in file _cq_editConfig.xml of component following code:

    <cq:listeners
        jcr:primaryType="cq:EditListenersConfig"
        aftercopy="REFRESH_PAGE"
        afterdelete="REFRESH_PAGE"
        afterinsert="REFRESH_PAGE"/>   