/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw06
 */
public class Directivo extends Empleado{
    
    protected String tipo;
    protected ArrayList<Empleado> subordinados = new ArrayList();

    public Directivo(String nombre, int edad, int sueldoBruto) {
        super(nombre, edad, sueldoBruto);
    }

    public Directivo(String nombre, int edad, int sueldoBruto, String tipo) {
        super(nombre, edad, sueldoBruto);
        this.tipo = tipo;
    }

    public Directivo(String nombre, int edad, int sueldoBruto, String tipo, ArrayList<Empleado> empleados) {
        super(nombre, edad, sueldoBruto);
        this.subordinados = empleados; 
        this.tipo = tipo;
    }

    public ArrayList<Empleado> getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(ArrayList<Empleado> subordinados) {
        this.subordinados = subordinados;
    }
    
    


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String Mostrar() {
        return super.Mostrar() + ", Tipo Directivo" + tipo;
    }

    
    
    
    
    
    
    
    
    
}
