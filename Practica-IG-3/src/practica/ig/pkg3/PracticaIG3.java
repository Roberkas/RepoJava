/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.ig.pkg3;

import Modelo.Curso;
import Modelo.Persona;
import Vista.VIN;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class PracticaIG3 {
    
    private static VIN vin;
    
    static public ArrayList<Persona> personas = new ArrayList();
    static public ArrayList<Curso> cursos = new ArrayList();
    
    
    public static void main(String[] args) {
       vin = new VIN();
       vin.setVisible(true);
       
       
        
        
        
        
        
        
    }
    
    
    public static void GenerarPersona(String nombre, String apellidos, String dni, Curso curso){
        if(!DniRepetido(dni)){
            Persona p1= new Persona(nombre, apellidos, dni, curso);
            personas.add(p1);
        }       
    }
    
    public static Curso GenerarCurso(String curso){
        Curso c1 = new Curso(curso);
        cursos.add(c1);
        return c1;
    }
    
    public static boolean DniRepetido(String dni){
        Persona p = new Persona();
        for(Persona elemento : personas){
                    if(dni.equals(elemento.getDni())){
                        p = elemento;
                        return true;
                    }
        
        }
        return false;
    }
    
    public static void BorrarPersona(Persona p){
        personas.remove(p);
    }
    
    public static void BorrarPersonaDni(String dni){
        for(Persona elemento : personas){
                    if(dni.equals(elemento.getDni())){
                        personas.remove(elemento);
                    }
            }
    }
    
    public static void EditarCurso(String dni, Curso curso){
        for(Persona elemento : personas){
                    if(dni.equals(elemento.getDni())){
                        elemento.setCurso(curso);
                    }
        }
    }

    
    public static void VINSalir(){
        vin.dispose();
        System.exit(0);
    }
    
    
}
        
    
    

