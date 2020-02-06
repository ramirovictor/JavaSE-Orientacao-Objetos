package html.api.tags;

import html.api.TagDupla;

/**
 *
 * @author Ramiro Victor
 */
public class Div extends TagDupla {

    private String with;
    private String style;
    private String id;

    public String getAlign() {
        return align;
    }

    public void setAlign(String align) {
        this.align = align;
    }
   private String align;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getWith() {
        return with;
    }

    public void setWith(String with) {
        this.with = with;
    }

    @Override
    public String getName() {
        return "div";
    }
}
