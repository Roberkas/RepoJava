/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author 1gdaw06
 */
public class Movimiento {
    protected LocalDate fecha;
    protected String tipo;
    protected double importe;

    public Movimiento() {
    }

    public Movimiento(LocalDate fecha, String tipo, double importe) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.importe = importe;
    }

    
    
    
    
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Movimiento: " + fecha + "//" + tipo + "//  Importe: " + importe;
    }
    
    
    
    
    
}
