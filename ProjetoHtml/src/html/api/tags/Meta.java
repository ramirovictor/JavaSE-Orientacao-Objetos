
package html.api.tags;

import html.api.TagSimples;

public class Meta extends TagSimples {

    // FIZ ALTERAÇÃO PARA PRIVATE
    private String name;
    private String content;

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getName() {
        return "meta";
    }
}