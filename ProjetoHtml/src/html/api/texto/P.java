package html.api.texto;

import html.api.TagDupla;


/**
 * paragrafo
 */
public class P extends TagDupla {

    private String align;

    public String getAlign() {
        return align;
    }

    public void setAlign(String align) {
        this.align = align;
    }
    /*
     alinhar o paragrafo 
     EXEMPLO     
     <p align="left">   alinha do lado esquerdo
     <p align="center">  alinha ao centro
     <p align="rigth">   alinha a direita   
     */

    @Override
    public String getName() {
        return "p";
    }
   
}
