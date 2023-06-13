/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author 57314
 */
public class CadenaAlphaException extends Exception{
    
    public CadenaAlphaException() {
    }

    public CadenaAlphaException(String string) {
        super(string);
    }    
    public void validarCadena(String cadena) throws CadenaAlphaException
    {
        //Pattern p = Pattern.compile();
        String ALPHANUMERIC_PATTERN = "^[a-zA-Z\\s]+$";
        boolean match= cadena.matches(ALPHANUMERIC_PATTERN);
        if(!match)  throw new CadenaAlphaException("la cadena "+ cadena + " debe solo contener caracteres alfabeticos");
  
  }
}

    
    
    

