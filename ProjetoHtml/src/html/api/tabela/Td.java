package html.api.tabela;

import html.api.TagDupla;

public class Td extends TagDupla {

//colunas <td> da tabela
    /*
     temos atributos nas celulas
     <tr>
     <td bgcolor="silver">
     </tr>
     */
    private String bgcolor;//colocar cor de fundo da celula
    private String align;//alinhar a celula
    private String colspan;//expandir a celula, de acordo com a quantidade de colunas
    private String rowspan;//expandir a celula, de acordo com a quantidade de linhas

    public String getBgcolor() {
        return bgcolor;
    }

    public String getAlign() {
        return align;
    }

    public String getColspan() {
        return colspan;
    }

    public String getRowspan() {
        return rowspan;
    }

    public void setColspan(String colspan) {
        this.colspan = colspan;
    }

    public void setRowspan(String rowspan) {
        this.rowspan = rowspan;
    }

    public void setAlign(String align) {
        this.align = align;
    }

    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor;
    }

    @Override
    public String getName() {
        return "td";
    }
    /*
     EXEMPLO
    
     <table>
     <tr>
     <td> Tabela de clientes </td>
     </tr>
    
     <tr> 
     <td> Nome:</td> <td> idade:</td>  <td> sexo:</td>  <td> telefone:</td> 
     </tr>
     </table>
    
     //no exemplo acima, temos uma linha com uma coluna, depois 
     uma linha com 4 colunas.
     */
}
