    package html.api.tags;
import html.api.TagSimples;

/**
 * FavIcon = Inseri uma (imagem) na barra de endereço do site
 */
public class FavIcon extends TagSimples {

    // Exemplos: <link rel="icon" type="image/gif" href="animated_favicon1.gif">
    private String rel; // icon
    private String type;// tipo da imagem
    private String href;// informar o caminho da imagem

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String getName() {
        return "link";
    }
}