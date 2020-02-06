package html.api.lista;
/*
 para inserir uma lista não numerada utilizamos a tag ul
 <ul></ul>
 */

import html.api.TagDupla;
import html.api.annotation.DetailAttribute;
import html.api.texto.TextoHtml;
import java.util.ArrayList;
public class Ul extends TagDupla {
    @DetailAttribute(value = false)//anotação no li
    private ArrayList<Li> lista = new ArrayList<>();
    @Override
    public String getName() {
        return "ul";
    }
     @Override
    public String toHtml() {
        for (Li item : lista) {
            super.addComponentes(item);
        }
        return super.toHtml();
    }

    @Override
    public void addComponentes(String... textos) {
            for (String string : textos) {
            TextoHtml texto = new TextoHtml(string);
            Li li = new Li();
            li.addComponentes(texto);
            lista.add(li);
        }
       }
    
    /*
     SINTAXI
     <body>
     <ul>
     <li> leite </li>
     </ul>
     </body>
     */

}
