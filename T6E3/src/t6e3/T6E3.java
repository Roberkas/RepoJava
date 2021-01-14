/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6e3;

import Excepciones.CampoVacio;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import t6e3.Clases.Persona;


public class T6E3 {

    static ArrayList<Persona> personas = new ArrayList();

            
    public static void main(String[] args) {
        boolean continuar = true;
        try{
            do{
                int opcion = JOptionPane.showOptionDialog(null,"Elige una opcion", "Elige una opcion",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,  new Object[]{"Añadir alumno", "Mostrar persona mas vieja", "Mostrar quien vive en ELCHE", "Mostrar numero personas mayores de edad",  "Salir"}, "Salir");
                switch(opcion){
                    case 0:AñadirPersona();
                    break;
                    case 1:if(personas.size()>0){
                        MostrarMasViejo();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Introduce alguna personas para sacar datos");
                    }
                    break;
                    case 2:if(personas.size()>0){
                        MostrarPersonasElche();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Introduce alguna personas para sacar datos");
                    }
                    break;
                    case 3:if(personas.size()>0){
                        MostrarPersonasMayores();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Introduce alguna personas para sacar datos");
                    }
                    break;
                    case 4: continuar = false;
                }
            }while(continuar);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Se ha producido un error inesperado..." + e.getMessage());
        }
    
    
    
    }
    
    public static void MostrarMasViejo(){
        int contador = 0;
        int posicion = 0;
        LocalDate fn1 = LocalDate.of(2099, 12, 30);
        for(Persona elemento: personas){
                LocalDate fn = elemento.getFnacimiento();
                if(fn.isBefore(fn1)){
                    posicion = contador;
                }
                fn1 = fn;
                contador++;
        }
        JOptionPane.showMessageDialog(null, "La persona mas vieja: " + personas.get(posicion).getNombre());
    }
    
    public static void MostrarPersonasElche(){
        int contador = 0;
        String nombres = "";
        for(Persona elemento: personas){
                String ciudad = elemento.getCiudad();
                if(ciudad.equalsIgnoreCase("ELCHE")){
                    nombres += elemento.getNombre() + " ";
                }
                contador++;
        }
        JOptionPane.showMessageDialog(null, "La personas que viven en Elche: " + nombres);
    }
    
    public static void MostrarPersonasMayores(){
        int contador = 0;
        for(Persona elemento: personas){
                LocalDate fn = elemento.getFnacimiento();
    
                if(ChronoUnit.YEARS.between(fn, LocalDate.now()) > 18){
                    contador++;
                }
        }
        JOptionPane.showMessageDialog(null, contador + " personas son mayores de edad");
    }
    
    public static void AñadirPersona(){
        int continuar = 0;
        do{
            LocalDate cumple = PedirCumple();
            personas.add(new Persona(PedirNombre(), cumple, cumple.getDayOfMonth(), cumple.getMonthValue(), 
            cumple.getYear(), PedirDir(), PedirCP(), PedirCiudad()));
            continuar = JOptionPane.showOptionDialog(null, "Continuar introduciendo datos?", "Continuar?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Si", "No"}, "Si");
        }while(continuar!=1);
    }
    
    
    public static LocalDate PedirCumple(){
        boolean ok = false;
        LocalDate cumple = null;
        do{
            try{
                String fecha = JOptionPane.showInputDialog(null, "Introduce la fecha con este formato: dd/mm/YYYY");
                DateTimeFormatter f =DateTimeFormatter.ofPattern("dd/MM/yyyy");
                cumple = LocalDate.parse(fecha, f);
                ok = true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e.getMessage());
            }
            
        }while(!ok);
        return cumple;
    }
    
    public static String PedirNombre(){
        boolean ok = false;
        String nombre = "";
        do{
            try{
                nombre = JOptionPane.showInputDialog(null, "Introduce el nombre:");
                if(nombre.isEmpty()){
                    throw new CampoVacio();
                }
                ok = true;   
            }
            catch(CampoVacio e0){
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e0.getMessage());
                ok = false;
            }catch(Exception e1){
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e1.getMessage());
                ok = false;
            }
        }
        while(!ok);
        return nombre;
    }
    
    public static String PedirDir(){
        boolean ok = false;
        String dir = "";
        do{
            try{
                dir = JOptionPane.showInputDialog(null, "Introduce la direccion:");
                if(dir.isEmpty()){
                    throw new CampoVacio();
                }
                ok = true;   
            }
            catch(CampoVacio e0){
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e0.getMessage());
                ok = false;
            }catch(Exception e1){
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e1.getMessage());
                ok = false;
            }
        }
        while(!ok);
        return dir;
    }
    
    public static String PedirCP(){
        boolean ok = false;
        String cp = "";
        do{
            try{
                cp = JOptionPane.showInputDialog(null, "Introduce el codigo postal:");
                if(cp.isEmpty()){
                    throw new CampoVacio();
                }
                ok = true;   
            }
            catch(CampoVacio e0){
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e0.getMessage());
                ok = false;
            }catch(Exception e1){
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e1.getMessage());
                ok = false;
            }
        }
        while(!ok);
        return cp;
    }
    
    public static String PedirCiudad(){
        boolean ok = false;
        String ciudad = "";
        do{
            try{
                ciudad = JOptionPane.showInputDialog(null, "Introduce la ciudad:");
                if(ciudad.isEmpty()){
                    throw new CampoVacio();
                }
                ok = true;   
            }
            catch(CampoVacio e0){
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e0.getMessage());
                ok = false;
            }catch(Exception e1){
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e1.getMessage());
                ok = false;
            }
        }
        while(!ok);
        return ciudad;
    }
    
    
    
}
