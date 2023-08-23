
package Vista;

import AL.TokenEnum;
import Tokens.Token;
import java.util.List;
import javax.swing.JTextArea;

/**
 *
 * @author Jonwil
 */
public class MostraErrores {
    private List<Token> listTokens;
    private String errores = "";
    private VistaGeneral vistaGeneral;
    private JTextArea areaImpresion;

    public MostraErrores(List<Token> listTokens, VistaGeneral vista) {
        this.vistaGeneral = vista;
        this.listTokens = listTokens;
        this.areaImpresion = vista.getAreaErrores();
        
    }
    
    
    public void clasificarerrores(){
        for (Token listToken : listTokens) {
            if(listToken.getToken()==TokenEnum.ERROR){
                errores += listToken.getLexema() + ",  ";
                errores += listToken.getToken()+ ",  ";
                errores += listToken.getLinea()+ ",  ";
                errores += listToken.getColumna()+ ",  ";
                errores += "\n";
            }
        }
        vistaGeneral.setAreaErrores(errores);
    }

    
    public String getErrores() {
        return errores;
    }
    
    
}
