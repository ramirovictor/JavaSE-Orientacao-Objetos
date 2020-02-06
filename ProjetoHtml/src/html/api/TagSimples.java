package html.api;

public abstract class TagSimples extends Tag {

    @Override
    public String toHtml() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toHtml());// <getName()
        builder.append(String.format("/>\n"));//  />
        return builder.toString();//             <getName()/>
    }   
}
