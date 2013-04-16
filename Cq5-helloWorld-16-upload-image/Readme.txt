Cq5 and tab with image

If you want to upload image you have to add in dialogo.xml:
	* jcr:primaryType="cq:Widget"
    * ddGroups="[media]"
    * fileReferenceParameter="./fileReference"
    * name="./fileName"
    * xtype="smartimage"