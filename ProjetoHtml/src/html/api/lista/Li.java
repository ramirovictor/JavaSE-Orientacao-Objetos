/*
 *em uma lista temos itens
 e para cada item de uma lista adicionarmos li
 */
package html.api.lista;

import html.api.TagDupla;

/**
 * EXEMPLO
 * <ul>
 * <li>Atletico Paranaense</li>
 * <li>Atletico Mineiro</li>
 * <li>Atletico Goianiense</li>
 * </ul>
 *
 * @author Victor
 */
public class Li extends TagDupla {

    @Override
    public String getName() {
        return "li";
    }

}
