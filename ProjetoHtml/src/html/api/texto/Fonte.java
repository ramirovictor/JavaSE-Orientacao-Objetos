package html.api.texto;

import html.api.TagDupla;

public class Fonte extends TagDupla {

    private String color;
    private String size;//escolher o tamanho da letra do texto 
//<font size=*> </font>:

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    /*
     EXEMPLO
     <font color="blue">
     */

    @Override
    public String getName() {
        return "fonte";
    }

}
