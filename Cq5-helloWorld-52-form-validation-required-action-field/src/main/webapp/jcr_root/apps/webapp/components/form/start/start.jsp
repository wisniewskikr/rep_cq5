<%--
  Copyright 1997-2009 Day Management AG
  Barfuesserplatz 6, 4001 Basel, Switzerland
  All Rights Reserved.

  This software is the confidential and proprietary information of
  Day Management AG, ("Confidential Information"). You shall not
  disclose such Confidential Information and shall use it only in
  accordance with the terms of the license agreement you entered into
  with Day.

  ==============================================================================

  Form 'start' component

  Draws the start of a form

--%><%@include file="/libs/foundation/global.jsp"%><%
%><%@ page import="com.day.cq.wcm.foundation.forms.ValidationInfo,
                 com.day.cq.wcm.foundation.forms.FormsConstants,
                 com.day.cq.wcm.foundation.forms.FormsHelper,
                 org.apache.sling.api.resource.Resource,
                 org.apache.sling.api.resource.ResourceUtil,
                 org.apache.sling.api.resource.ValueMap,
                 org.apache.sling.scripting.jsp.util.JspSlingHttpServletResponseWrapper"%>

<c:set var="pageAfterAction" value="<%= properties.get("pageAfterAction") %>"/>

<%
%><cq:setContentBundle/><%
%><%
    FormsHelper.startForm(slingRequest, new JspSlingHttpServletResponseWrapper(pageContext));

    // we create the form div our selfs, and turn decoration on again.
    %><div class="form"><%
    componentContext.setDecorate(true);
    // check if we have validation erros
    final ValidationInfo info = ValidationInfo.getValidationInfo(request);
    if ( info != null ) {
        %><p class="form_error"><fmt:message key="Please correct the errors and send your information again."/></p><%
        final String[] msgs = info.getErrorMessages(null);
        if ( msgs != null ) {
            for(int i=0;i<msgs.length;i++) {
                %><p class="form_error"><%=msgs[i]%></p><%
            }
        }
    }
%>


<c:if test="${empty pageAfterAction}">
	<div style="background-color: red">Please fill field with page after action</div>
</c:if>