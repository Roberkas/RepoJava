/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2clases3;

import Clases.Cliente;
import Clases.Directivo;
import Clases.Empleado;
import Clases.Persona;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw06
 */
public class Practica2Clases3 {

    
    static public ArrayList<Persona> personal = new ArrayList();
    
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("Manolo", 23, 634342312);
        Cliente c2 = new Cliente("Iker", 59, 945345432);
        personal.add(c1);
        personal.add(c2);
        
        Empleado e1 = new Empleado("Javi", 44, 2200);
        Empleado e2 = new Empleado("Alvaro", 45, 2400);
        Empleado e3 = new Empleado("Miguel", 25, 1400);
        Empleado e4 = new Empleado("Luis", 29, 1900);
        Empleado e5 = new Empleado("Monica", 32, 2400);
        personal.add(e1);
        personal.add(e2);
        personal.add(e3);
        personal.add(e4);
        personal.add(e5);

        Directivo d1 = new Directivo("Iñaki", 44, 4500, "Produccion");
        ArrayList<Empleado> subordinados = new ArrayList();
        subordinados.add(e1); 
        subordinados.add(e2); 
        subordinados.add(e3); 
        d1.setSubordinados(subordinados);
        subordinados.clear();
        subordinados.add(e4); 
        subordinados.add(e5); 
        Directivo d2 = new Directivo("Markel", 55, 4800, "Mantenimiento");
        d2.setSubordinados(subordinados);
        personal.add(d1);
        personal.add(d2);
        
        MostrarDirectivoMasSubordinados();
        
        /*
        GENERAR LOS DIRECTIVOS COMO EMPLEADOS Y LUEGO PASARLE ESE OBJETO EMPLEADO AL CONSTRUCTOR DIRECTIVO
        MAS LOS NUEVOS VALORES HUBIERA SIDO MAS EFICIENTE
        */
        
    }
    
    
    static public void MostrarDirectivoMasSubordinados(){
        int n_subordinados=0;
        Directivo directivo_mas_subordinados = null;
        for(Persona persona : personal){
            if(persona instanceof Directivo){
                if(((Directivo) persona).getSubordinados().size()>n_subordinados){
                    n_subordinados = ((Directivo) persona).getSubordinados().size();
                    directivo_mas_subordinados=(Directivo) persona;
                }
            }
        }
        System.out.println("El directivo con mas empleados se llama " + directivo_mas_subordinados.getNombre());
        
    }
    
}
