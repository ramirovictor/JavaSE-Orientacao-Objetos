package html.api.tabela;

import html.api.TagDupla;
import html.api.annotation.DetailAttribute;
import html.api.iinterface.HtmlComponent;
import html.api.texto.TextoHtml;
import java.util.ArrayList;
import java.util.Arrays;

//linhas <tr> da tabela
public class Tr extends TagDupla {

    @DetailAttribute(value = false)
    private ArrayList<Td> colunas = new ArrayList<>();

    public ArrayList<Td> getColunas() {
        return colunas;
    }

    public void setColunas(ArrayList<Td> colunas) {
        this.colunas = colunas;
    }

    public Tr() {
    }

    public Tr(Td... colunas) {
        for (Td td : colunas) {
            //  this.colunas.add(td);
            addColuna(td);
        }
    }

    public void addColuna(Td... coluna) {
        colunas.addAll(Arrays.asList(coluna));
    }

    @Override
    public String toHtml() {
        for (Td c : colunas) {
            super.addComponentes(c);
        }
        return super.toHtml();
    }

    public void addComponentes(String... text) {
        for (String txt : text) {
            this.addComponentes(new TextoHtml(txt));
        }
    }

    @Override
    public void addComponentes(HtmlComponent... componente) {
        for (HtmlComponent c : componente) {
            Td td = tdVazia();
            if (td != null) {
                td.addComponentes(c);
            }
        }
    }

    public Td tdVazia() {
        for (Td t : colunas) {
            if (t.estaVazia()) {
                return t;
            }
        }
        return null;
    }

    @Override
    public String getName() {
        return "tr";
    }
}
