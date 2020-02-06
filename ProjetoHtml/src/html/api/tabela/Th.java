
    /*
     Usamos a tag TH para criar uma célula cabeçalho. 
     Essa célula cabeçalho pode 
     identificar uma linha ou uma coluna. 
     */
package html.api.tabela;

import html.api.TagDupla;

public class Th extends TagDupla {
    /*
     Usamos a tag TH para criar uma célula cabeçalho. 
     Essa célula cabeçalho pode 
     identificar uma linha ou uma coluna. 
     */

    private String dir;     /*Define a direção em que os textos são apresentados pelo navegador
                            só pode ter dois valores:  ltr = da esquerda para a direita.
                            rtl = da direita para a esquerda.*/ 
    private String id;      /*Dá nome para a tag*/
    private String abbr;    /* Especifica uma versão abreviada do conteúdo da célula.
                            Este atributo é usado para agregar valor ao conteúdo.*/
    
    private String aligh;   /*Só pode ser: center = célula centralizada
                            char = texto alinhado pelo caracter especificado no atributo char
                            justify = justificado à direita ou esquerda
                            left = alinhado à esquerda
                            right  = alinahdo à direita*/
    private String bgcolor; /*Define a cor de fundo da célula*/
    //private String char;  /*Especifica o caracter que o alinhamento deve ocorrer*/
    private double charoff; /*Define o deslocamento em pixels em relação ao caracter especificado no atributo char*/
    private int coispan;    /*Especifica o número de colunas abrangida pela célula*/
    private String headers; /*Especifica uma lista de identificadores únicos associados às células do cabeçalho
                            permitindo que leitores de tela identifiquem a célula pelo identificador do cabeçalho.*/
    private double height;  /*Especifica a altura da célula*/
    private String nowrap;  /*Impede que o texto da célula seja quebrado em múltiplas linhas. OBS: deve ser usado somente seu nome "nowrap"*/
    private int rowspan;    /*Especifica o número de linhas abrangidas pela célula*/
    private String scope;   /*Só pode conter os seguintes valores: col = a célula serve de cabeçalho para todas as outras células da mesma coluna
                            colgroup = a célula serve de cabelhalo para todas as células que fazem parte do mesmo grupo de colunas
                            row = a célula serve de cabeçalho para todas as outras células da mesma linha
                            rowgroup = a célula serve de cabeçalho para todas as células que fazem parte do mesmo grupo de linhas.*/
    private String valign;  /*Especifica o alinhamento vertical da célula e só pede conter os valores:
                            baseline = texto alinhado de acordo com a primeira linha da primeira célula
                            bottom = em baixo
                            middle = no meio
                            top = em cima */
    private double width;  /*Define a largura da célula*/    
  
  @Override
    public String getName() {
        return "th";
    }
    
    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public String getAligh() {
        return aligh;
    }

    public void setAligh(String aligh) {
        this.aligh = aligh;
    }

    public String getBgcolor() {
        return bgcolor;
    }

    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor;
    }

    public double getCharoff() {
        return charoff;
    }

    public void setCharoff(double charoff) {
        this.charoff = charoff;
    }

    public int getCoispan() {
        return coispan;
    }

    public void setCoispan(int coispan) {
        this.coispan = coispan;
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getNowrap() {
        return nowrap;
    }

    public void setNowrap(String nowrap) {
        this.nowrap = nowrap;
    }

    public int getRowspan() {
        return rowspan;
    }

    public void setRowspan(int rowspan) {
        this.rowspan = rowspan;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getValign() {
        return valign;
    }

    public void setValign(String valign) {
        this.valign = valign;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

}