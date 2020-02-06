package html.api.tabela;

import html.api.TagDupla;
import html.api.annotation.DetailAttribute;
import html.api.iinterface.HtmlComponent;
import html.api.texto.TextoHtml;
import java.util.ArrayList;

public class Table extends TagDupla {

    @DetailAttribute(value = false)
    ArrayList<Tr> linhas = new ArrayList<>();//criado um array de linhas

    private String align;//para alinhas a tabela
    private String bgcolor;// para dar uma cor de fundo a tabela
    private String background;//para colocar uma foto como plano de fundo
    private String border;//para especificar a espessura da borda da tabela
    private String bordercolor;//para definir a cor da borda da tabela
    private String height;//altura
    private String width;//largura
    private String cellpadding;//espaçamento entre a borda e os textos
    private String cellspacing;//divide a largura entre as bordas

    public Table() {
    }

    /**
     * Construtor linhas e colunas
     */
    public Table(int numeroLinhas, int numeroColunas) {//construtor para passar n linhas e collunas
        for (int i = 0; i < numeroLinhas; i++) {
            addLinha(numeroColunas);
        }
    }

    /**
     * Construtor linhas, colunas e titulo
     */
    public Table(int numeroLinhas, int numeroColunas, String titulo) {//passar titulo
        this(numeroColunas, numeroColunas);//chama o construtor
        Caption caption = new Caption();
        caption.addComponentes(new TextoHtml(titulo));
        this.addComponentes(caption);
    }

    /**
     * Construtor caption da tabela
     */
    public Table(String titulo) {

        Caption caption = new Caption();
        caption.addComponentes(titulo);
        this.addComponentes(caption);
    }

    /**
     * Sobrescrita do metodo toHtml da classe TagDupla*
     */
    @Override
    public String toHtml() {
        for (Tr l : linhas) {
            super.addComponentes(l);
        }
        return super.toHtml();
    }

    public void addLinha(int numeroColunas) {
        Tr tr = new Tr();
        for (int i = 0; i < numeroColunas; i++) {
            tr.getColunas().add(new Td());
        }
        linhas.add(tr);
    }

    @Override
    public void addComponentes(String... txt) {
        for (String t : txt) {
            this.addComponentes(new TextoHtml(t));
        }
    }

    @Override
    public void addComponentes(HtmlComponent... componentesTag) {
        //ele disse que tem que ter mais um  laço aqui ...
        for (int i = 0; i < linhas.size(); i++) {
            Td td = linhas.get(i).tdVazia();
            if (td != null) {
                linhas.get(i).addComponentes(componentesTag);
                return;
            }

        }
        super.addComponentes(componentesTag);

    }

    public void adicionarLinhasColunas(int numeroLinhas, int numeroColunas) {
        for (int i = 0; i < numeroLinhas; i++) {
            addLinha(numeroColunas);
        }

    }

    @Override
    public String getName() {
        return "table";
    }

    //GETTERS AND SETTERS
    public void setHeight(String height) {
        this.height = height;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public void setCellspacing(String cellspacing) {
        this.cellspacing = cellspacing;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void setBordercolor(String bordercolor) {
        this.bordercolor = bordercolor;
    }

    public void setBoder(String border) {
        this.border = border;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public void setBgcollor(String bgcollor) {
        this.bgcolor = bgcollor;
    }

    public void setAlign(String align) {
        this.align = align;
    }

    public String getBgcolor() {
        return bgcolor;
    }

    public String getAlign() {
        return align;
    }

    public String getBackground() {
        return background;
    }

    public String getBorder() {
        return border;
    }

    public String getBordercolor() {
        return bordercolor;
    }

    public String getHeight() {
        return height;
    }

    public String getWidth() {
        return width;
    }

    public String getCellspacing() {
        return cellspacing;
    }

    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor;
    }

    public String getCellpadding() {
        return cellpadding;
    }

    public void setCellpadding(String cellpadding) {
        this.cellpadding = cellpadding;
    }

}
