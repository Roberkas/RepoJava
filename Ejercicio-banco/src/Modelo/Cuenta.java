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
public class Cuenta {
    protected String id;
    protected ArrayList<Movimiento> movimientos = new ArrayList();
    protected double saldo;

    public Cuenta() {
    }

    public Cuenta(String id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addMovimiento(Movimiento movimiento){
        this.movimientos.add(movimiento);
    }
    
    public void removeMovimiento(Movimiento movimiento){
        this.movimientos.remove(movimiento);
    }
    
    
    
}
