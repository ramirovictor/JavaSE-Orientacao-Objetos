package html.api;

import html.api.tags.Div;
import html.api.tags.Meta;
import html.api.tags.FavIcon;
import html.api.tags.Html;
import html.api.lista.*;
import html.api.tabela.*;
import html.api.texto.*;
import html.api.texto.cabecario.*;

public class Pagina {

    public static void main(String[] args) {

        Html html = new Html();

        // title da página
        html.getHead().getTitle().addComponentes("Programa&ccedil;&atilde;o III :D");
        //------------------------------------------------------------------------------
        // meta
        Meta keywords = new Meta();
        keywords.setName("keywords");
        keywords.setContent("sites,web");//; charset=utf-8

        Meta autor = new Meta();
        autor.setName("author");
        autor.setContent("VICTOR, Ramiro");
        html.getHead().addMeta(keywords, autor);
        //html.getHead().addMeta(html.getHead().getMeta());
//------------------------------------------------------------------------------------------
        //FavIcon da pagina
        FavIcon favicon = new FavIcon();
        favicon.setRel("shortcut icon");
        favicon.setType("image/jpg");
        favicon.setHref("ddr.jpg");
        html.addComponent(favicon);
//---------------------------------------------------------------------------------------------
        //Adicionando atributos para Body   
        html.getBody().setText("black");
        html.getBody().setBackground("tec.jpg");
        html.getBody().setAlink("red");
//-------------------------------------------------------------------------------------------------
        //div 
        Div div = new Div();
        div.setAlign("center");
        div.setId("100");
        div.setStyle("89");
        div.addComponentes("Testando a Tag Div!!!");
        //deixar em negrito
        B negrito = new B();
        P paragrafo = new P();
        negrito.addComponentes("TEM HORAS QUE A GENTE TEM QUE IMPOR RESPEITO, E LIGAR O CAPS LOCK!");
        paragrafo.addComponentes(negrito);
        div.addComponentes(paragrafo);
        html.addComponentes(div);
//---------------------------------------------------------------------------------------------
        //tabela
        Table table = new Table("Programadores");
        table.adicionarLinhasColunas(2, 2);
        table.setBgcollor("white");
        table.setBoder("7");
        table.setAlign("right");//d
        //table.setBackground("fox.jpg");
        table.addComponentes("xxxxxx");
        table.addComponentes("xxxxx");
        table.addComponentes("xxxx");
        I italico = new I();//deixar o nome do mais bonito itálico
        italico.addComponentes("Ramiro Victor");
        table.addComponentes(italico);
        html.addComponentes(table);
//------------------------------------------------------------------------------------------------------------
        //cabeçalho do texto da pagina 
        Fonte corFonte = new Fonte();
        corFonte.setColor("blue");
        U sublinhado = new U();
        H1 h1 = new H1();
        corFonte.addComponentes("Se Deus disse, que eu posso ent&atilde;o eu posso!!!");
        sublinhado.addComponentes(corFonte);
        h1.addComponentes(sublinhado);//deixar o texto do cabeçario sublinhado
        h1.addComponentes(new Br());//pular uma linha
        H3 h3 = new H3();
        h3.addComponentes("Projeto de HTML");
        // corFonte.addComponentes(h1, h3);
        html.addComponentes(h1, h3);
//----------------------------------------------------------------------------------------
        //paragrafo e quebra de linha
        P paragrafo2 = new P();
        paragrafo2.addComponentes("Pra ter mais de Deus voc&ecirc; tem que diminuir");
        paragrafo2.addComponentes(new Br());//quebra de linha
        paragrafo2.addComponentes("Jo&atilde;o 3:30");
        html.addComponentes(paragrafo2);
        //-------------------------------------------------------------------------------------
        //Lista e lista numerada
        Ul lista = new Ul();
        Ol listaNumerada = new Ol();
        lista.addComponentes("Jesus", "Maria", "Jos&eacute;", "Minha fam&iacute;lia vossa &eacute;");
        listaNumerada.addComponentes("Arcanjo Miguel", "Arcanjo Gabriel", "Arcanjo Rafael");
        html.addComponentes(lista, listaNumerada);
        System.out.println(html.toHtml());

    }
}
