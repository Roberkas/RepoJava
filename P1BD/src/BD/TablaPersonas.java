/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Modelo.Persona;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw06
 */
public class TablaPersonas {
    
    private Connection con;

    public TablaPersonas() {
    }

    public TablaPersonas(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public void insertarPersona(Persona p) throws Exception{
        
        String plantilla = "INSERT INTO PERSONAS VALUES (?, ?)";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, p.getDni());
        ps.setString(2, p.getNombre());
        
        int n = ps.executeUpdate();
        
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        ps.close();
        
        
    }
    
    public String consultarDatosPersona(String dni) throws SQLException{
        try{
            String plantilla = "SELECT * FROM PERSONAS WHERE UPPER(DNI)='?'";
            PreparedStatement ps = con.prepareStatement(plantilla);
            
            ps.setString(1, dni);
            ResultSet resultado = ps.executeQuery();
            
            Persona p = new Persona();
            if(resultado.next()){
                p.setDni(resultado.getString("dni"));
                p.setNombre(resultado.getString("nombre"));
                p.setEdad(resultado.getInt("edad"));
                p.setOficio(resultado.getString("oficio"));
                p.setTelefono(resultado.getString("telefono"));
            }
            else{
                throw new Exception("No se ha encotrado ninguna persona registrada con ese nombre");
            }
            return p.toString(); 
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    
    public ArrayList<Persona> consultarPersonas() throws SQLException{
        try{
            ArrayList<Persona> personas = new ArrayList();
            String plantilla = "SELECT * FROM PERSONAS";
            PreparedStatement ps = con.prepareStatement(plantilla);
            
            ResultSet resultado = ps.executeQuery();
            
            
            if(resultado.next()){
                Persona p = new Persona();
                p.setDni(resultado.getString("dni"));
                p.setNombre(resultado.getString("nombre"));
                p.setEdad(resultado.getInt("edad"));
                p.setOficio(resultado.getString("oficio"));
                p.setTelefono(resultado.getString("telefono"));
                
                personas.add(p);
            }
            else{
                throw new Exception("No se ha encotrado ninguna persona registrada con ese nombre");
            }
            return personas; 
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    
    
    
    
}
