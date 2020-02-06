package html.api.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)//especifica como a anotação deve ser usado .
public @interface DetailAttribute {//O @ em frente da interface de marca-o como uma anotação .

    boolean value();//valor do tipo booleano
}
/*
 @ Retention (RetentionPolicy.RUNTIME) 
 significa que a anotação pode ser acessado através do reflection em tempo de execução.
 Se você não definir, a anotação não serão preservadas durante a execução
 */
