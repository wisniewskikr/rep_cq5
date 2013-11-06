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

  Initialize this field.

--%><%@include file="/libs/foundation/global.jsp"%><%
%><%@page import="com.day.cq.wcm.foundation.forms.FieldDescription,
                  com.day.cq.wcm.foundation.forms.FieldHelper"%><%
    final FieldDescription desc = FieldHelper.createDefaultDescription(slingRequest, resource);
    desc.setMultiValue(properties.get("multivalue", false));
%>
