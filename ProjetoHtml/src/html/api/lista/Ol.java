
package html.api.lista;

import html.api.TagDupla;
import html.api.annotation.DetailAttribute;
import html.api.texto.TextoHtml;
import java.util.ArrayList;
/*para inserir uma lista numerada 
 utilizamos a tag ul
 a diferença do ol para o ul é simplesmente que no ol a lista fica númerada
 */
public class Ol extends TagDupla {

   @DetailAttribute(value = false)
    private ArrayList<Li> lista = new ArrayList<>();
    @Override
    public String getName() {
        return "ol";
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
  
    
}
