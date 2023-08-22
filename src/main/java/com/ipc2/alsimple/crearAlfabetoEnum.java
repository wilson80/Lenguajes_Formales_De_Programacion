
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
        
    }

    public Map<String, TokenEnum> getAlfabeto() {
        return alfabeto;
    }
    
    
    
    
    
}
