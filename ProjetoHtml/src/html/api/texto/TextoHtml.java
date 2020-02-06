package html.api.texto;

import html.api.iinterface.HtmlComponent;

public class TextoHtml implements HtmlComponent {

    private String texto;

    public TextoHtml(String texto) {
        this.texto = texto;
    }

  
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override//interface
    public String toHtml() {
        return texto;
    }

}
