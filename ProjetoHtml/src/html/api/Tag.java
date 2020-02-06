package html.api;
    
import html.api.annotation.DetailAttribute;
import html.api.iinterface.HtmlComponent;
import java.lang.reflect.Field;

public abstract class Tag implements HtmlComponent {

    public abstract String getName();//método abstrato que caiu na prova

    @Override
    public String toHtml() {//sobreescrita do método interface
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("<%s", getName()));//iniciando tag
        Field fields[] = this.getClass().getDeclaredFields();//varrendo os atributos das tags

        try {
            for (Field campos : fields) {//percorra cada campo do tipo Field dentro do meu array de fields
                campos.setAccessible(true);//setando acessibilidade
                if (campos.get(this) != null
                        && (!campos.isAnnotationPresent(DetailAttribute.class) || (campos
                        .isAnnotationPresent(DetailAttribute.class) && campos
                        .getAnnotation(DetailAttribute.class).value()))) {
                    /*
                     se o valor do atributo != de null ( e não for annatation ou 
                     se campos for annotation e valor for true) é jogado dentro da String builder
                    
                     ESTRUTURA DE UMA ATRIBUTO - EXEMPLO: <body atributo="valor">
                     */
                    builder.append(String.format(" %s=\"%s\"", campos.getName(), campos.get(this)));
                }
            }
        } catch (Exception e) {
        }
        return builder.toString();// é retornado a String builder < getName() atributo="valor"
    }
}
