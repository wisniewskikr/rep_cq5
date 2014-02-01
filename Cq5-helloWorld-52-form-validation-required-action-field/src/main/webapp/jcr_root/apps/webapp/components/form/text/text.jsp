<%--
  Copyright 1997-2011 Day Management AG
  Barfuesserplatz 6, 4001 Basel, Switzerland
  All Rights Reserved.

  This software is the confidential and proprietary information of
  Day Management AG, ("Confidential Information"). You shall not
  disclose such Confidential Information and shall use it only in
  accordance with the terms of the license agreement you entered into
  with Day.

  ==============================================================================

  Form 'element' component

  Draws an element of a form

--%><%@include file="/libs/foundation/global.jsp"%><%
%><%@ page import="com.day.cq.wcm.foundation.TextFormat,
                   com.day.cq.wcm.foundation.forms.FormsHelper,
                   com.day.cq.wcm.foundation.forms.LayoutHelper" %><%
    final String name = FormsHelper.getParameterName(resource);
    final String id = FormsHelper.getFieldId(slingRequest, resource);
    final boolean required = FormsHelper.isRequired(resource);
    final boolean readOnly = FormsHelper.isReadOnly(slingRequest, resource);
    final boolean multiValued = properties.get("multivalue", false);
    final boolean hideTitle = properties.get("hideTitle", false);
    final String width = properties.get("width", null);
    final String rows = properties.get("rows", "1");
    final String cols = properties.get("cols", "35");
    String[] values = FormsHelper.getValues(slingRequest, resource);
    if (values == null) {
        values = new String[]{""};
    }

    String title;
    if (rows.equals("1")) {
        title = FormsHelper.getTitle(resource, "Text");
    } else {
        title = FormsHelper.getTitle(resource, "Text");
    }
    if (multiValued && !readOnly) {
        %><%@include file="multivalue.jsp"%><%
    }

    %><div class="form_row">
        <% LayoutHelper.printTitle(id, title, required, hideTitle, out); %>
        <div class="form_rightcol" id="<%= name %>_rightcol"><%
            int i = 0;
            for (String value : values) {
                %><div id="<%= name %>_<%= i %>_wrapper" class="form_rightcol_wrapper"><%
                if (readOnly) {
                    if (value.length() == 0) {
                        // at least display a space otherwise layout may break
                        value = " ";
                    }
                    %><c:out value="<%= new TextFormat().format(value) %>" escapeXml="false"/><%
                } else {
                    String currentId = i == 0 ? id : id + "-" + i;
                    if (rows.equals("1")) {
                        %><input class="<%= FormsHelper.getCss(properties, "form_field form_field_text" + (multiValued ? " form_field_multivalued" : "" )) %>" id="<%= currentId %>" name="<%= name %>" value="<c:out value="<%= value %>"/>" size="<%= cols %>" <%= (width != null ? "style='width:" + width + "px;'" : "") %>><%
                    } else {
                        %><textarea class="<%= FormsHelper.getCss(properties, "form_field form_field_textarea") %>" id="<%= currentId %>" name="<%= name %>" rows="<%= rows %>" cols="<%= cols %>" <%= (width != null ? "style='width:" + width + "px;'" : "") %>><c:out value="<%= value %>"/></textarea><%
                    }
                    if (values.length > 1) {
                        %><span class="form_mv_remove" onclick="CQ_form_removeMultivalue('<%= name %>', <%= i %>);">&nbsp;[&ndash;]</span><%
                    }
                }
                i++;
                %></div><%
            }
        %></div><%
        if (multiValued && !readOnly) {
            %><span class="form_mv_add" onclick="CQ_form_addMultivalue('<%= name %>', <%= rows %>, <%= width == null ? "null" : "'" + width + "'" %>);">[+]</span><%
        }
    %></div><%

    LayoutHelper.printDescription(FormsHelper.getDescription(resource, ""), out);
    LayoutHelper.printErrors(slingRequest, name, hideTitle, out);
%>
