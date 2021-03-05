/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author 1gdaw06
 */
public class Persona {
    
    private String dni;
    private String nombre;
    private int edad;
    private String oficio;
    private String telefono;

    public Persona() {
    } 

    public Persona(String dni, String nombre, int edad, String oficio, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.oficio = oficio;
        this.telefono = telefono;
    }
    
    

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    

    @Override
    public String toString() {
        return "Persona con dni " + dni + " y nombre " + nombre;
    }
    
    
    
    
    
}
