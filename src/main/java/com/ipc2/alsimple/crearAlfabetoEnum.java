
package com.ipc2.alsimple;

import AL.TokenEnum;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jonwil
 */
public class crearAlfabetoEnum {
    private Map<String, TokenEnum> alfabeto;

    
    public crearAlfabetoEnum() {
        alfabeto = new HashMap();
        alfabeto.put(".", TokenEnum.OTROS);
        alfabeto.put(",", TokenEnum.OTROS);
        alfabeto.put(";", TokenEnum.OTROS);
        alfabeto.put(":", TokenEnum.OTROS);
        alfabeto.put("(", TokenEnum.OTROS);
        alfabeto.put(")", TokenEnum.OTROS);
        alfabeto.put("{", TokenEnum.OTROS);
        alfabeto.put("}", TokenEnum.OTROS);
        alfabeto.put("[", TokenEnum.OTROS);
        alfabeto.put("]", TokenEnum.OTROS);
        alfabeto.put("+", TokenEnum.ARITMETICOS);
        alfabeto.put("-", TokenEnum.ARITMETICOS);
        alfabeto.put("*", TokenEnum.ARITMETICOS);
        alfabeto.put("/", TokenEnum.ARITMETICOS);
        alfabeto.put("%", TokenEnum.ARITMETICOS);
        alfabeto.put("**", TokenEnum.ARITMETICOS);
        alfabeto.put("def", TokenEnum.RESERVADA);
        alfabeto.put("if", TokenEnum.RESERVADA);
        alfabeto.put("and", TokenEnum.LOGICOS_AND);
        alfabeto.put("or", TokenEnum.LOGICOS_OR);
        alfabeto.put("not", TokenEnum.LOGICOS_NOT);
        alfabeto.put("=", TokenEnum.ASIGNACION);
        alfabeto.put("true", TokenEnum.CONSTANTES_TRUE);
        alfabeto.put("false", TokenEnum.CONSTANTES_FALSE);
        alfabeto.put("#", TokenEnum.COMENTARIO);
        alfabeto.put("0", TokenEnum.CONSTANTES_NUMERICAS);
        alfabeto.put("1", TokenEnum.CONSTANTES_NUMERICAS);
        alfabeto.put("2", TokenEnum.CONSTANTES_NUMERICAS);
        alfabeto.put("3", TokenEnum.CONSTANTES_NUMERICAS);
        alfabeto.put("4", TokenEnum.CONSTANTES_NUMERICAS);
        alfabeto.put("5", TokenEnum.CONSTANTES_NUMERICAS);
        alfabeto.put("6", TokenEnum.CONSTANTES_NUMERICAS);
        alfabeto.put("7", TokenEnum.CONSTANTES_NUMERICAS);
        alfabeto.put("8", TokenEnum.CONSTANTES_NUMERICAS);
        alfabeto.put("9", TokenEnum.CONSTANTES_NUMERICAS);
        
    }

    public Map<String, TokenEnum> getAlfabeto() {
        return alfabeto;
    }
    
    
    
    
    
}
