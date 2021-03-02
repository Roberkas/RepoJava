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
    private String dni;
    private ArrayList<Usuario> usuarios;

    public Persona() {
    }

    public Persona(String dni) {
        this.dni = dni;
    }

    public Persona(String dni, ArrayList<Usuario> usuarios) {
        this.dni = dni;
        this.usuarios = usuarios;
    }
    
    public Persona(String dni, Usuario usuario) {
        this.dni = dni;
        this.usuarios.add(usuario);
    }
    
    
    
}
