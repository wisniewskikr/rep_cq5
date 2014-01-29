package pl.kwi.parsys.utils;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import com.day.cq.wcm.api.components.ComponentContext;
import com.day.cq.wcm.api.components.EditContext;
import com.day.cq.wcm.api.designer.Design;
import com.day.cq.wcm.api.designer.Designer;
import com.day.cq.wcm.api.designer.Style;


public class ParsysUtil {

    private static final String CQ_EMPTY_TEXT = "cq:emptyText";

    private static final String DEFAULT_EMPTY_TEXT = "Drag components or assets here";
    
    
    private ParsysUtil() {}

    /**
     * Method should be used in parsys/new component.
     * 
     * @param editContext edit context of 'parsys/new' component.
     * @param request request object for 'parsys/new' component.
     */
    public static void applyEmptyText(SlingHttpServletRequest request, EditContext editContext) {
    	
        if (editContext != null) {
            Resource resource = request.getResource();
            if (resource == null) {
                return;
            }
            Resource parsysResource = resource.getParent();
            if (parsysResource == null) {
                parsysResource = request.getResource();
            }
            if (parsysResource == null) {
                return;
            }
            String emptyText = DEFAULT_EMPTY_TEXT;
            Style style = getStyle(parsysResource, editContext);
            if (style != null) {
                emptyText = style.get(CQ_EMPTY_TEXT, DEFAULT_EMPTY_TEXT);
            }
            editContext.getEditConfig().setEmpty(true);
            editContext.getEditConfig().setEmptyText(emptyText);
        }
    }

    /**
     * Gets design Style of parsys.
     * 
     * @param res Resource of parsys.
     * @param editContext Context of 'parsys/new' component.
     * @return design Style of parsys.
     */
    private static Style getStyle(Resource res, EditContext editContext) {
        ComponentContext ctx = editContext.getParent().getComponentContext();
        Designer d = (Designer) res.getResourceResolver().adaptTo(Designer.class);
        Design design;

        Page page = (ctx == null) ? null : ctx.getPage();
        if (page == null) {
            PageManager pMgr = (PageManager) res.getResourceResolver().adaptTo(PageManager.class);
            page = pMgr.getContainingPage(res);
        }

        design = d.getDesign(page);

        if (design == null) {
            return null;
        }
        if (ctx == null) {
            return design.getStyle(res);
        }
        return design.getStyle(ctx.getCell());
    }

}