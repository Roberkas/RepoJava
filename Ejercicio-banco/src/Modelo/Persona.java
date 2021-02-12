/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw06
 */
public class Persona {
    protected String dni;
    protected int password;
    protected ArrayList<Cuenta> cuentas= new ArrayList();

    
    
    public Persona(String dni, int password) {
        this.dni = dni;
        this.password = password;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    public void addCuenta(Cuenta cuenta) {
        this.cuentas.add(cuenta);
    }
    
    public void removeCuenta(Cuenta cuenta) {
        this.cuentas.remove(cuenta);
    }
    
    
   
    
}
