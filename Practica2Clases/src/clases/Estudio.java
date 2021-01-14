package clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1gdaw06
 */
public class Estudio {
    private String nombre;
    private String ciudad;
    private String direccion;
    private String dirweb;
    private LocalDate fechafundacion;
    private String pais;
    private ArrayList telefonos;

    public Estudio(String nombre, String ciudad, String direccion, String dirweb, LocalDate fechafundacion, String pais, ArrayList telefonos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.dirweb = dirweb;
        this.fechafundacion = fechafundacion;
        this.pais = pais;
        this.telefonos = new ArrayList();
        this.telefonos = telefonos;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDirweb() {
        return dirweb;
    }

    public void setDirweb(String dirweb) {
        this.dirweb = dirweb;
    }

    public LocalDate getFechafundacion() {
        return fechafundacion;
    }

    public void setFechafundacion(LocalDate fechafundacion) {
        this.fechafundacion = fechafundacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList telefonos) {
        this.telefonos = telefonos;
    }

    
    
    
    
    
    
    
    
    
    
    
}
