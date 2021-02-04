/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Validaciones {
    
    
    public static boolean ValidacionNumerica(String num){
        try{
            Integer.parseInt(num);
            return true;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error-->El campo a de ser solo numerico");
            return false;
        }
        
    }
    
    
    
    
    
}
