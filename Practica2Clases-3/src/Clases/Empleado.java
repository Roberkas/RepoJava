/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 1gdaw06
 */
public class Empleado extends Persona{
    
    protected int sueldoBruto;  

    public Empleado(String nombre, int edad, int sueldoBruto) {
        super(nombre, edad);
    }

    public int getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public String Mostrar() {
        return super.Mostrar() + "sueldoBruto=" + sueldoBruto;
    }
    
    
    
    
    
}
