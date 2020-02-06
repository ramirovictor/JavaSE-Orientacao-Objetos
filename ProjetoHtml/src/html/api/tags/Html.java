package html.api.tags;
//vamos fazer um array de meta

import html.api.annotation.DetailAttribute;
import html.api.iinterface.HtmlComponent;
import html.api.TagDupla;

public class Html extends TagDupla {
    @DetailAttribute(value = false)
    Body body = new Body();
    @DetailAttribute(value = false)
    Head head = new Head();
    

    @Override
    public void addComponentes(HtmlComponent... componentesTag) {
        this.body.addComponentes(componentesTag);//quando chamar html, add dentro do body
    }

//VERIFICAR UMA JEITO MELHOR
    public void addComponent(HtmlComponent... componentesTag) {
        this.head.addComponentes(componentesTag);//quando chamar html, add dentro do head
    }   
    //addMeta

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toHtml() {
        super.addComponentes(head);
        super.addComponentes(body);
        
        return super.toHtml();
    }

    @Override
    public String getName() {
        return "html";
    }
}
