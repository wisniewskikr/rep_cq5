CQ5 AND DEFAULT FILLING OF COMPONENT


This tutorial is about default filling of component with some text/value. This
text is stored in crx. It means that dialog is also filled with this text/value



To default filling of component you have to add in file _cq_editConfig.xml
following part: 

<cq:formParameters
    	jcr:primaryType="nt:unstructured"
        text="Default text"/>