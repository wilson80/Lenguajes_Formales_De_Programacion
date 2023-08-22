
package Tokens;

import AL.TokenEnum;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jonwil
 */
public class Token {
    
    private int linea;
    private int columna;
    private String lexema;
    private String patron;
    private TokenEnum token;
    private Map<TokenEnum, String> alfabetoPatron; 
    
     public Token() {
     }

    
    public Token(String lexema, TokenEnum token, int linea, int columna){
        this.alfabetoPatron = new HashMap<>(); 
        alfabetoPatron.put(TokenEnum.ARITMETICOS, "*");
        alfabetoPatron.put(TokenEnum.ARITMETICOS, "/");
        alfabetoPatron.put(TokenEnum.PUNTO_COMA, ",");
        alfabetoPatron.put(TokenEnum.ARITMETICOS, "-");
        alfabetoPatron.put(TokenEnum.ARITMETICOS, "+");
        this.patron = this.alfabetoPatron.get(token);
        
        this.lexema=lexema;
        this.token = token;
        this.linea = linea;  
        this.columna = columna;
        
    }
    
    
    public void nada(){
        
    }
    
    
    @Override
    public String toString() {
        
        return "TOKEN<"+lexema+ ", "
                       +token + ","
                       +" Patron: " + patron + "," 
                       + " linea: "+linea + ","
                       + " columna: "+columna+">";
    }    
    
    
    
    
}
