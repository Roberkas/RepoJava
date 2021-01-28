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
    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected Curso curso;

    public Persona(String nombre, String apellidos, String dni, Curso curso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.curso = curso;
    }
    
    public Persona() {
    }
    
    
    
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona :" + nombre + " Apellidos=" + apellidos + "DNI:" + dni + '\n';
    }

    
    
    
    
    
    
    
}
