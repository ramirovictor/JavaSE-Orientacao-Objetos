package html.api;

import html.api.lista.Ol;
import html.api.lista.Ul;
import html.api.tabela.Table;
import html.api.tags.Div;
import html.api.tags.Meta;
import html.api.tags.FavIcon;

import html.api.tags.Html;
import html.api.texto.B;
import html.api.texto.Br;
import html.api.texto.Fonte;
import html.api.texto.P;
import html.api.texto.U;
import html.api.texto.cabecario.H1;
import html.api.texto.cabecario.H3;

public class Start {

    public static void main(String[] args) {

        Html html = new Html();

        // title da página
        html.getHead().getTitle().addComponentes("Minha página");
//-------------------------------------------------------------------------------------
        // meta
        Meta keywords = new Meta();
        keywords.setName("keywords");
        keywords.setContent("sites,web");

        Meta autor = new Meta();
        autor.setName("author");
        autor.setContent("Johnny Figueiredo");
        html.getHead().addMeta(keywords, autor);

//-------------------------------------------------------------------------------------
        //FavIcon da pagina
        FavIcon favicon = new FavIcon();
        favicon.setRel("shortcut icon");
        favicon.setType("image/jpg");
        favicon.setHref("ddr.jpg");
        html.addComponent(favicon);
//-------------------------------------------------------------------------------------
        //Adicionando atributos para Body   
        html.getBody().setText("black");
        html.getBody().setBackground("ddr.jpg");
        html.getBody().setAlink("red");

//-------------------------------------------------------------------------------------
        //div 
        Div div = new Div();
        div.setAlign("center");
        div.setId("100");
        div.setStyle("89");
        div.addComponentes("É necessario estudar hoje, "
                + "para ser matéria de estudo amanhã - ");
        html.addComponentes(div);

        // B = negrito e U = sublinhado
        B negrito = new B();
        U sublinhado = new U();
        negrito.addComponentes("Francisco Albernais");
        div.addComponentes(negrito);
        sublinhado.addComponentes("2013");
        negrito.addComponentes(sublinhado);

        //-------------------------------------------------------------------------------------
        //cabeçalho do texto da pagina 
        Fonte corFonte = new Fonte();
        corFonte.setColor("blue");
        H1 h1 = new H1();
        h1.addComponentes("ProgramaçãoIII");
        H3 h3 = new H3();
        h3.addComponentes("API de HTML");
        corFonte.addComponentes(h1, h3);
        html.addComponentes(corFonte);

        //-------------------------------------------------------------------------------------
        //Paragrafo e quebra de linha
        P paragrafo = new P();
        Br quebralinha = new Br();

        paragrafo.addComponentes("Johnny Evangelista Figueiredo");
        paragrafo.addComponentes(quebralinha);
        paragrafo.addComponentes("Francisco Albernais");
        html.addComponentes(paragrafo);
        //-------------------------------------------------------------------------------------

        //tabela
        Table table = new Table("Programadores");
        table.adicionarLinhasColunas(2, 2);
        table.setBoder("7");
        table.setBgcollor("white");
        table.setAlign("right");
        //table.setBackground("Universidade de Harvard.jpg");
        table.addComponentes("Johnny Figueiredo");
        table.addComponentes("Ramiro Victor");
        table.addComponentes("Leonardo Tassinari");
        table.addComponentes("Alisson Meireles");

        html.addComponentes(table);

        //-------------------------------------------------------------------------------------
        //Lista e lista numerada
        Ul lista = new Ul();
        Ol listaNumerada = new Ol();

        lista.addComponentes("Alexandre Pato", "Paolo Guerreiro", "Emerson sheick");
        listaNumerada.addComponentes("Donatelo", "Michelangelo", "Rafael");
        html.addComponentes(lista, listaNumerada);

        System.out.println(html.toHtml());

    }
}
