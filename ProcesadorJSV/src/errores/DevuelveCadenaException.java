/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errores;

/**
 *
 * @author Rodrigo Rosado Gonz�lez
 */
public class DevuelveCadenaException extends Exception{
    public DevuelveCadenaException(){
        
    }
    
    public DevuelveCadenaException(String message){
        super(message);
    }
}
