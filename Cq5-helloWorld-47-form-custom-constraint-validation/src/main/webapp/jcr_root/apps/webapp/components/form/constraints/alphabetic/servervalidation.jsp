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

  Form 'element' component

  Generate the client javascript code to validate this field.

--%><%@page session="false" %><%
%><%@page import="java.util.regex.Matcher,
                java.util.regex.Pattern,
                com.day.cq.wcm.foundation.forms.FieldDescription,
                com.day.cq.wcm.foundation.forms.FieldHelper,
                com.day.cq.wcm.foundation.forms.FormsHelper,
                com.day.cq.wcm.foundation.forms.ValidationInfo"%><%
%><%@taglib prefix="sling" uri="http://sling.apache.org/taglibs/sling/1.0" %><%
%><sling:defineObjects/><%
    final Pattern p = Pattern.compile("([A-Za-z])+");

    final FieldDescription desc = FieldHelper.getConstraintFieldDescription(slingRequest);
    final String[] values = request.getParameterValues(desc.getName());
    if ( values != null ) {
        for(int i=0; i<values.length; i++) {
            final Matcher m = p.matcher(values[i]);
            if ( !m.matches() ) {
                if ( desc.isMultiValue() ) {
                    ValidationInfo.addConstraintError(slingRequest, desc, i);
                } else {
                    ValidationInfo.addConstraintError(slingRequest, desc);                    
                }
            }            
        }
    }
%>
