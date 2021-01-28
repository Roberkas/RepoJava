/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.ig.pkg2;

import java.util.ArrayList;
import Modelos.Persona;
import Vistas.VIN;
import Vistas.VOUT;

/**
 *
 * @author 1gdaw06
 */
public class PracticaIG2 {

    static ArrayList<Persona> personas = new ArrayList();
    
    private static VIN vin;
    private static VOUT vout;
    
    public static void main(String[] args) {
    
    vin = new VIN();
    vin.setVisible(true);
    
    



    }
    
    public static void GenerarPersona(String nombre, String apellidos, String dni){
        Persona p1= new Persona(nombre, apellidos, dni);
        personas.add(p1);
    }
    
    public static String AgruparDatos(){
        String datos = "";
        for(Persona elemento : personas){
            datos += elemento.toString();
        }
        return datos;
    }
    
    public static void salir(){
        vin.dispose();
        vout = new VOUT(AgruparDatos());
        vout.setVisible(true);
    }
    
}
