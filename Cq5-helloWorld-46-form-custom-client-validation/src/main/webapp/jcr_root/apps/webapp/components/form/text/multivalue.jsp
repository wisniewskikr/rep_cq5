<%
/**
 * Copyright 1997-2010 Day Management AG
 * Barfuesserplatz 6, 4001 Basel, Switzerland
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * Day Management AG, ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Day.
 */
%><script type="text/javascript">
    function CQ_form_addMultivalue(name, rows, width) {
        var wrapper = document.getElementById(name + "_rightcol");
        var fieldWrapper = document.createElement("div");
        var index = new Date().getTime();
        fieldWrapper.id = name + "_" + index + "_wrapper";


        var field;
        if (rows == 1) {
            field = document.createElement("input");
            field.className = "form_field form_field_text form_field_multivalued";
        }
        else {
            field = document.createElement("textarea");
            field.className = "form_field form_field_textarea";
            field.rows = rows;
        }
        field.name = name;
        if (width) {
            if (width.indexOf("px")< width.length-2) width +="px";
            field.style.width = width;
        }

        var icon = document.createElement("span");
        icon.className = "form_mv_remove";
        icon.onclick = function() {
            CQ_form_removeMultivalue(name, index);
        };
        icon.innerHTML = "&nbsp;[&ndash;]";

        fieldWrapper.appendChild(field);
        fieldWrapper.appendChild(icon);
        wrapper.appendChild(fieldWrapper);
    }

    /**
     * Remove a field from a multivalue text field
     * @param index
     */
    function CQ_form_removeMultivalue(name, index) {
        var wrapper = document.getElementById(name + "_rightcol");
        var fieldWrapper = document.getElementById(name + "_" + index + "_wrapper");
        wrapper.removeChild(fieldWrapper);
    }
</script>