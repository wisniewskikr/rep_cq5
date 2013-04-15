Cq5 and two panels

In file dialog.xml use:

- For root:
	* jcr:primaryType="cq:Dialog"
	* xtype="tabpanel"
	* <items jcr:primaryType="cq:WidgetCollection">

- For every tab:
	 * jcr:primaryType="cq:Widget"
     * title="Text Panel"
     * xtype="panel"
     * <items jcr:primaryType="cq:WidgetCollection">