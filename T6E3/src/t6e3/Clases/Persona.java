/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6e3.Clases;

import java.time.LocalDate;

/**
 *
 * @author 1gdaw06
 */
public class Persona {
    private String nombre;
    private int dnacimiento;
    private int mnacimiento;
    private int anacimiento;
    private String direccion;
    private String cp;
    private String ciudad;
    private LocalDate fnacimiento;

    public Persona(String nombre, LocalDate fnacimiento,  int dnacimiento, int mnacimiento, int anacimiento, String direccion, String cp, String ciudad) {
        this.nombre = nombre;
        this.fnacimiento = fnacimiento;
        this.dnacimiento = dnacimiento;
        this.mnacimiento = mnacimiento;
        this.anacimiento = anacimiento;
        this.direccion = direccion;
        this.cp = cp;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDnacimiento() {
        return dnacimiento;
    }

    public void setDnacimiento(int dnacimiento) {
        this.dnacimiento = dnacimiento;
    }

    public int getMnacimiento() {
        return mnacimiento;
    }

    public void setMnacimiento(int mnacimiento) {
        this.mnacimiento = mnacimiento;
    }

    public int getAnacimiento() {
        return anacimiento;
    }

    public void setAnacimiento(int anacimiento) {
        this.anacimiento = anacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public LocalDate getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(LocalDate fnacimiento) {
        this.fnacimiento = fnacimiento;
    }
    
    
}

