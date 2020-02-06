package html.api;

import html.api.iinterface.HtmlComponent;
import html.api.texto.TextoHtml;
import java.util.ArrayList;

public abstract class TagDupla extends Tag {

    
    private ArrayList<HtmlComponent> componentes = new ArrayList<>();

    public void addComponentes(HtmlComponent... componentesTag) {
        for (HtmlComponent j : componentesTag) {
            this.getComponentes().add(j);
        }
    }

    public boolean estaVazia() {
        return this.componentes.size() == 0;
    }

    public void addComponentes(String... textos) {
        for (String text : textos) {
            this.getComponentes().add(new TextoHtml(text));

        }
    }

    @Override
   public String toHtml() {
        String builder = super.toHtml() + ">\n\t";
        for (HtmlComponent elemento : getComponentes()) {
            builder += elemento.toHtml();
            System.out.println(" ");
        }
        builder += "</" + getName() + ">\n"; //  </ getName()>
        return builder; //      <getName()>    </getName()>
    }

    public ArrayList<HtmlComponent> getComponentes() {
        return componentes;
    }
}
