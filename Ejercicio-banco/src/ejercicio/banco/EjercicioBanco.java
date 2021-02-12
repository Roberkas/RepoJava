/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.banco;

import Modelo.Cuenta;
import Modelo.Persona;
import Modelo.Movimiento;
import Vista.Autenticacion;
import Vista.Consultas;
import Vista.Movimientos;
import Vista.PanelControl;
import Vista.V1;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author 1gdaw06
 */
public class EjercicioBanco {

    
    public static V1 v1;
    public static Autenticacion VAutenticacion;
    public static PanelControl VPanelcontrol;
    public static Consultas VConsultas;
    public static Movimientos VMovimientos;
    
    
    public static ArrayList<Persona> usuarios = new ArrayList();
    
    
    public static void main(String[] args) {
        v1 = new V1();
        v1.setLocationRelativeTo(null);
        v1.setVisible(true); 
        
        Persona p1 = new Persona("58007738J", 123456);
        Persona p2 = new Persona("00000000J", 000000);
        Cuenta c1 = new Cuenta("000001");
        c1.setSaldo(10000);
        Cuenta c2 = new Cuenta("000002");
        Cuenta c3 = new Cuenta("000003");
        p1.addCuenta(c1);
        p1.addCuenta(c2);
        p2.addCuenta(c3);
        usuarios.add(p1);
        usuarios.add(p2);
    }
    
    
    public static void AbrirAutenticacion(){
        VAutenticacion = new Autenticacion(v1, true);
        VAutenticacion.setLocationRelativeTo(null);
        VAutenticacion.setVisible(true);
        
    }
    
    public static void AbrirPanelControl(Persona usuario){
        VPanelcontrol = new PanelControl(usuario);
        VPanelcontrol.setLocationRelativeTo(null);
        VPanelcontrol.setVisible(true);
    }
    
    public static void AbrirConsultas(Persona usuario){
        VConsultas = new Consultas(usuario);
        VConsultas.setLocationRelativeTo(null);
        VConsultas.setVisible(true);
    }
    
    public static void AbrirMovimientos(Persona usuario){
        VMovimientos = new Movimientos(usuario);
        VMovimientos.setLocationRelativeTo(null);
        VMovimientos.setVisible(true);
    }
    
    public static void Salir(JFrame ventana){
        if(ventana.getName().equals("v1")){
            ventana.dispose();
            System.exit(0); 
        }
        else{
            ventana.dispose();
        }
    }
    
    public static void Salir(JDialog ventana){
        if(ventana.getName().equals("v1")){
            ventana.dispose();
            System.exit(0); 
        }
        else{
            ventana.dispose();
        }
    }
    
    public static Persona Login(String usuario, int contrasena){
        for(Persona elemento : usuarios){
            if(elemento.getDni().equalsIgnoreCase(usuario)){
                if(elemento.getPassword()==contrasena){
                    return elemento;
                }
            }
        }
        return null;
        
    }
    
    public static void GenerarMovimiento(String tipo, double importe, Cuenta cuenta){
        Movimiento movimiento = new Movimiento(LocalDate.now(), tipo, importe);
        cuenta.addMovimiento(movimiento);
    }
    

    public static Cuenta ValidarCuenta(String c1){
        for(Persona usuario : usuarios){
            for(Cuenta cuenta : usuario.getCuentas()){
                if(c1.equals(cuenta.getId())){
                    return cuenta;
                }
            }
        }
        return null;
    }
}
        
    
