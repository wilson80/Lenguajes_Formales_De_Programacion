

package com.ipc2.alsimple;

import AL.TokenEnum;
import Tokens.Token;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jonwil
 */
public class ControlAnalizadorLexico {
    private int linea = 1;
    private int columna = 0;
    private int iterador = 0;
    private int cadenaAperturai = 0;
    private String buffer = "";
    private String textoIngresado = "\"cadena de textoo\" def 1numero numero numero("; //Entrada
    private String identificador = "identificador";
    char [] caracteresIngresados;
    private boolean dentroDeComentario = false;
    private boolean dentroDeCadena = false;
    private boolean reconocerIdentificador = false;
    private List<Token> listTokens;
    private Map<String, TokenEnum> alfabeto;
            
    private String [] alfabetoIdSinNumero = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p",
                                                  "q","r","s","t","u","v","w","x","y","z", "_"}; 
    private String [] alfabetoIdSinNumeroMasyusculas = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
                                                    "N","O","P","Q","R","S","T","U","V","W","X","Y","Z", "_"}; 
    private String [] alfabetoId_ConstantesNumericas = {"0","1","2","3","4","5","6","7","8","9"}; 

    public ControlAnalizadorLexico() {
        listTokens = new ArrayList<>();
        alfabeto = new HashMap();
        caracteresIngresados = textoIngresado.toCharArray();
        crearAlfabetoEnum alfabeto = new crearAlfabetoEnum();
        this.alfabeto = alfabeto.getAlfabeto();
    }
    
    public void analizador() {
        System.out.println("Entrada: " +textoIngresado);
        for (int i = 0; iterador < caracteresIngresados.length; iterador++) {
            System.out.println("Buffer>>>>>>>>>>>: " + buffer);
            char valor = caracteresIngresados[iterador];
            
            if(!dentroDeCadena){
                verificarComentario(valor);
            }
            if(!dentroDeComentario){
                    buscarCadena(valor);
            }
            
            
            if(dentroDeComentario==false && dentroDeCadena==false){      //Si esta reconociendo un comentario no entra en el switch
                switchGeneral(valor);
            }
            
            if(!dentroDeCadena){
                reconocerComentario(valor);         //Clasifica los comentarios y hace false el atributo dentroDeComentario 
            }
            if(!dentroDeComentario){
                reconocerCadena(valor);             //identifica el cierre de la cadena de caracteres y agrega la cadena
            }
            
            
            if(iterador==(caracteresIngresados.length-1)) {        //Para reconocer el ultimo Token 
                    comparar(buffer, linea, columna);
                    buffer = "";
            }
        }
            System.out.println("Tokens Encontrados");
            imprimirTokens();
        
    }
    
    public void buscarCadena(char valor){
        if(!dentroDeCadena){
                if(valor=='"'){
                dentroDeCadena = true;
                cadenaAperturai=iterador;
                buffer+= "\"";
            }
        }
    }
    
    public void reconocerCadena(char valor){
        
        if(cadenaAperturai!=iterador){
            if(dentroDeCadena == true){ 
                buffer+=valor;
                System.out.println("reconociendo una cadenaaaaaaaaaaaaaaaaaaa>>>>>>>>>>> " + buffer);
                if(valor=='"'  || iterador==caracteresIngresados.length-1){
                    if(valor == '"'){           // verificando las " comillas de cierre de la cadena
                    Token token = new Token(buffer, TokenEnum.CADENA_DE_CARACTERES, linea, columna);
                    listTokens.add(token);
                    buffer="";
                    columna++;
                    dentroDeCadena = false;
                    System.out.println("CADENA COMPLETADA>>>>>>>>>>>>>>>>>>> ");
                    }else {
                        if(iterador==caracteresIngresados.length-1){ //si llega al ultimo caracter ingresado 
                                                                    //  y no recnonoce unas " comillas de cierre entonces califica como error
                            Token token = new Token(buffer, TokenEnum.ERROR, linea, columna);
                            listTokens.add(token);
                            System.out.println("Error de ciere de CADENA>>>>>>>");
                            dentroDeCadena = false;
                            columna++;
                            buffer="";
                        }
                    }
                    
//                    crearNuevoToken("#", linea, columna);               //pendiente de crear aqui el token y tener la descripcion del comentario
//                    if(valor=='\n'){                  pendiente
//                        linea++;              
//                    }
                    
                }
            }
        }
        
        
    }
    
    
    private void switchGeneral(char valor) {
        switch (valor) {
                case ' ':
                    System.out.println("Espacio En blanco");
                    comparar(buffer, linea, columna);
                    this.buffer = "";
                    columna++;
                    break;
                case  '\n':
                    System.out.println("Salto de linea");
                    comparar(buffer, linea, columna);
                    this.buffer = "";
                    columna = 1;
                    linea++;
                    break;
                case  '+':
                    comparar(buffer, linea, columna);
                    comparar("+", linea, columna);
                    this.buffer = "";  
                    columna++;
                    break;
                case '.' :
                    comparar(buffer, linea, columna);
                    comparar(".", linea, columna);
                    this.buffer = "";
                    columna++;
                    break;
                case '*':
                    comparar(buffer, linea, columna);
                    comparar("*", linea, columna);
                    this.buffer = "";
                    columna++;
                    break;
                case '/':
                    comparar(buffer, linea, columna);
                    comparar("/", linea, columna);
                    this.buffer = "";
                    columna++;
                    break;
                case '(':
                    comparar(buffer, linea, columna);
                    comparar("(", linea, columna);
                    this.buffer = "";
                    columna++;
                    break;
                case ')':
                    comparar(buffer, linea, columna);
                    comparar(")", linea, columna);
                    this.buffer = "";
                    columna++;
                    break;
                
                default:
                    buffer +=valor;
                    columna++;
        }
    }
    
    public void reconocerIdentificador(){
        System.out.println("Reconociendo Identificador: " +buffer);
        char [] caracteres = buffer.toCharArray();
        
        String primerCaracter = "";
        primerCaracter += caracteres[0];
        
        System.out.println("areglo posicion 0: " + primerCaracter);
        
        
        for (int i = 0; i < alfabetoIdSinNumero.length; i++) {      //comprobando que el primer caracter del buffer no sea un Numero o un signo no permitido para Id
            if(primerCaracter.equals(alfabetoIdSinNumero[i]) || primerCaracter.equals(alfabetoIdSinNumeroMasyusculas[i])){
                reconocerIdentificador = true;
            }                                           //Si no encaja en alguna categoria es un Error
        }
        
        if(reconocerIdentificador){                 //Creando un Nuevo Token ID
                Token token = new Token(buffer, TokenEnum.ID, linea, columna);
                listTokens.add(token);
                System.out.println("IDENTIFICADOR CREADO");
                reconocerIdentificador=false;
        } else if(reconocerIdentificador==false){   //Al no reconocer un Id ni encajar en otra categoria Califica como error       
                Token token = new Token(buffer, TokenEnum.ERROR, linea, columna);
                listTokens.add(token);
        }
    }
    
    
    public void verificarComentario(char valor){    //Cuando encuentre el primer Caracter igual a # empieza a reconocer un comentario
            if(valor=='#'){
                System.out.println("INICIO COMENTARIO");
                dentroDeComentario = true;
            }
    }
    
    public void reconocerComentario(char valor){
            if(dentroDeComentario==true){
                columna++;
                buffer+=valor;
                System.out.println("reconociendo un comentario>>>>>>>>>>> " + buffer);
                if(valor=='\n' || iterador==caracteresIngresados.length-1){
                    System.out.println("iterador: " +iterador);
                    Token token = new Token(buffer, TokenEnum.COMENTARIO, linea, columna);
                    listTokens.add(token);
//                    crearNuevoToken("#", linea, columna);               //pendiente de crear aqui el token y tener la descrpcion del comentario
                    if(valor=='\n'){
                        linea++;
                    }
                    System.out.println("CERRANDO COMENTARIO");
                    dentroDeComentario = false;
                    buffer="";
                }
            }
    }
    
    
    public void comparar(String buffer, int lineas, int columnas){
        if(alfabeto.containsKey(buffer)) {
            System.out.println("creando nuevo Token");
            crearNuevoToken(buffer, lineas, columnas);
            
        }else if(buffer!="" && dentroDeComentario==false){
            reconocerIdentificador();        
        }
    }
    
    public void crearNuevoToken(String buffer, int lineas, int columnas){
        TokenEnum enumToken = alfabeto.get(buffer);
        Token tokenEncontrado = new Token(buffer, enumToken, linea, columna);
        listTokens.add(tokenEncontrado);    //Agregando el token a una lista 
        
    }
      
    public void imprimirTokens(){
        for (Token listToken : listTokens) {
            System.out.println(listToken.toString());
            
        }
    }

    
}
