/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1bd;

import BD.BD;
import BD.TablaPersonas;
import Modelo.Persona;
import Vista.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


/**
 *
 * @author 1gdaw06
 */
public class P1BD {

    static BD bd ;
    static TablaPersonas tp;
    
    static public V1 v1;
    static public VAlta valta;
    static public VMostrar vmostrar;
    
    static ArrayList<Persona>  personas;
    static int punteroPersonas;
    
    public static void main(String[] args) {
        bd = new BD();
        bd.conectar();
        
        tp = new TablaPersonas(bd.getCon());
        
        v1 = new V1();
        v1.setLocationRelativeTo(null);
        v1.setVisible(true);
        
        personas = new ArrayList();
        

    }
    
    
    
    
    
    public static Persona generarPersona(String dni, String nombre, int edad, String oficio, String telefono){
        try{
            //comprobar dni no repetido
            if(!comprobarPersona(dni)){
                Persona p = new Persona(dni, nombre, edad, oficio, telefono);
                return p;
            }
            else{
                throw new Exception("Ya hay una persona registrada con ese dni");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public static void insertar(Persona p) throws Exception{
        try {
            tp.insertarPersona(p);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    public static boolean comprobarPersona(String dni){
        try {
            if(tp.consultarDatosPersona(dni)!=null){
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    
    public static ArrayList<String> visualizarDatosPersonas(){
        try {
            personas = tp.consultarPersonas();
        } catch (SQLException ex) {
            Logger.getLogger(P1BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        Persona p = personas.get(0);
        
        ArrayList<String> datos = new ArrayList();
        datos.add(p.getDni());
        datos.add(p.getNombre());
        datos.add(String.valueOf(p.getEdad()));
        datos.add(p.getOficio());
        datos.add(p.getTelefono());
        
        return datos;
    }
    
    public static ArrayList<String> visualizarDatosPersonasNext(){
        if(personas.size()<punteroPersonas){
            punteroPersonas += 1;
            Persona p = personas.get(punteroPersonas);
            ArrayList<String> datos = new ArrayList();
            datos.add(p.getDni());
            datos.add(p.getNombre());
            datos.add(String.valueOf(p.getEdad()));
            datos.add(p.getOficio());
            datos.add(p.getTelefono());
            return datos;
        }
        else{
            try {
                throw new Exception("No hay mas personas");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                return null;
            }
            
        }
    }
    
    
    public static ArrayList<String> visualizarDatosPersonasPrevious(){
        if(0<punteroPersonas){
            punteroPersonas -= 1;
            Persona p = personas.get(punteroPersonas);
            ArrayList<String> datos = new ArrayList();
            datos.add(p.getDni());
            datos.add(p.getNombre());
            datos.add(String.valueOf(p.getEdad()));
            datos.add(p.getOficio());
            datos.add(p.getTelefono());
            return datos;
        }
        else{
            try {
                throw new Exception("No hay mas personas");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                return null;
            }
            
        }
    }
    
    
    public static void abrirVAlta(){
        valta = new VAlta();
        valta.setLocationRelativeTo(null);
        valta.setVisible(true);
    }
    
    public static void abrirVMostrar(){
        vmostrar = new VMostrar();
        vmostrar.setLocationRelativeTo(null);
        vmostrar.setVisible(true);
    }
    
    public static void cerrarVentana(JFrame v){
        v.dispose();
    }
    
    
    
    
}
        
    
 
    
    
    
    
    
    
    
    
    

    
    

