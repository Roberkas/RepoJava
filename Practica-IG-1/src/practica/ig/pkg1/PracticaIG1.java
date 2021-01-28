/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.ig.pkg1;

import Vista.V1.*;

/**
 *
 * @author 1gdaw06
 */
public class PracticaIG1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    static public int Aleatorio(){
        return (int) (Math.random()*1000);
    }
    
    static public boolean ComprobarSuma(int num1, int num2, int resultado){
        if(resultado==(num1+num2)){
            return true;
        }   
        return false;
    }
}
