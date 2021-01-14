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
public class Empresa {
    
    public String nombre;

    ArrayList<Cliente> clientes = new ArrayList();
    ArrayList<Empleado> empleados = new ArrayList();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public void setCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }
    
    
    
    
}
