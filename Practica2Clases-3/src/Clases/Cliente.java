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
public class Cliente extends Persona{
    
    protected int TelefonoDeContacto;

    public Cliente(String nombre, int edad, int TelefonoDeContacto) {
        super(nombre, edad);
        this.TelefonoDeContacto = TelefonoDeContacto;
    }
    
    

    public int getTelefonoDeContacto() {
        return TelefonoDeContacto;
    }

    public void setTelefonoDeContacto(int TelefonoDeContacto) {
        this.TelefonoDeContacto = TelefonoDeContacto;
    }

    @Override
    public String Mostrar() {
        return super.Mostrar() + ", Cliente-->" + "TelefonoDeContacto:" + TelefonoDeContacto;
    }
    
    
    
    
    
    
}
