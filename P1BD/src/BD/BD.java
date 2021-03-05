/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;


import java.sql.*;

public class BD {
    
    private Connection con;

    public BD() {
    }
    
    public void conectar(){
        try{
            //Identificar el driver
            Class.forName("com.mysql.jdbc.Driver");
            String bd = "BD";
            String url = "jdbc:mysql://localhost:3306/"+bd;
            String usuario = "root";
            String pass = "usbw";
            
            con = DriverManager.getConnection(url, usuario, pass);                   
            
            if (con==null){
                       throw new Exception("Problemas con la conexión");
                 }
          }
        catch(Exception e){
            System.out.println(e.getMessage());          
        }
    }
    
    public void desconectar(){
       try
       {
            con.close();
       }
       catch(Exception e)
       {
           System.out.println("Problemas cerrando la conexión");
       }
   }
   
   public Connection getCon()
   {
       return con;
   }
    
}
    
    
    

