package html.api.tags;

import html.api.TagDupla;

public class Body extends TagDupla {
    private String text;
    private String bgcolor; // EXEMPL   <body bgcollor="read">
    private String Link;
    private String Alink;
    private String vlink;
    private String background;

    public String getLink() {
        return Link;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }

    public String getAlink() {
        return Alink;
    }

    public void setAlink(String Alink) {
        this.Alink = Alink;
    }

    public String getVlink() {
        return vlink;
    }

    public void setVlink(String vlink) {
        this.vlink = vlink;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getBgcolor() {
        return bgcolor;
    }

    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getName() {
        return "body";
    }
}
