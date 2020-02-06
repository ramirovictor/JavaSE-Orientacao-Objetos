package html.api.tags;

import html.api.annotation.DetailAttribute;
import html.api.TagDupla;
import html.api.TagSimples;
import html.api.iinterface.HtmlComponent;
import java.util.ArrayList;

public class Head extends TagDupla {

    //anotação
    @DetailAttribute(value = false)
    Title title = new Title();
    @DetailAttribute(value = false)
    FavIcon favicon = new FavIcon();
    @DetailAttribute(value = false)
    Meta meta = new Meta();

    /**
     * Metodos get e set
     */
    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public FavIcon getFavicon() {
        return favicon;
    }

    public void setFavicon(FavIcon favicon) {
        this.favicon = favicon;
    }
    /**
     * Array para receber os metas, visto que pode existir vários
     */
    @DetailAttribute(value = false)
    private ArrayList<Meta> componentes = new ArrayList<>();

    /**
     * metodo para add os metas no array
     */
    public void addMeta(Meta... metaTag) {
        for (Meta j : metaTag) {
            this.getComponentes().add(j);
        }
    }

    /**
     * getMetas se for preciso em outra classe
     */
    public ArrayList<Meta> getMetas() {
        return componentes;
    }

    @Override
    public String getName() {
        return "head";
    }
   
  
    
    @Override
    public String toHtml() {
        this.addMeta();//chama o array de metas, se não tiver não adiciona...
        super.addComponentes(title);
        return super.toHtml(); // chamada ao to string da classe superior
    }
}