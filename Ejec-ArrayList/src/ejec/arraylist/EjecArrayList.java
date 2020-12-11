/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejec.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class EjecArrayList {

    static ArrayList<Double> Lista = new ArrayList();
    
    
    
    public static void main(String[] args) {
        try{
            boolean continuar = true;
                   do{
                       int seleccion = JOptionPane.showOptionDialog(
                           null,
                           "Seleccione opcion", 
                           "Selector de opciones",
                           JOptionPane.YES_NO_CANCEL_OPTION,
                           JOptionPane.QUESTION_MESSAGE,
                           null,    // null para icono por defecto.
                           new Object[] { "CrearArray", "MostrarElementos", "BuscarNumero", "MaxMinLista", "BorrarValor", "ConvertirArray", "AnadirElemento",
                               "AnadirElementoPosicion", "BorrarElementoPosicion", "SumaMedia",  "Salir" },   // null para YES, NO y CANCEL
                           "Salir");
                       switch(seleccion){
                           case 0: CrearArray();
                           break;

                           case 1: MostrarElementos();
                           break;

                           case 2: BuscarNumero();
                           break;

                           case 3: MaxMinLista();
                           break;

                           case 4: BorrarValor();
                           break;

                           case 5: ConvertirArray();
                           break;

                           case 6: AnadirElemento();
                           break;

                           case 7: AnadirElementoPosicion();
                           break;

                           case 8: BorrarElementoPosicion();
                           break;

                           case 9: SumaMedia();
                           break;

                           case 10: continuar = false;//salir;
                           break;
                       }
                   }while(continuar);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado: " + e.getMessage());
        }
    }
    
    
    
    static public void CrearArray() throws Exception{
        int continuar;
        do{
            Double valor = PedirNumero();
            Lista.add(valor);
            continuar = JOptionPane.showOptionDialog(
                        null,
                        "Continuar?", 
                        "Deseas continuar ingresando valores?",
                        JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,    // null para icono por defecto.
                        new Object[] { "Continuar", "Salir" },   // null para YES, NO y CANCEL
                        "Salir");    
        }
        while(continuar == 0);        
    }
    
    static public void MaxMinLista(){
        if(!ListIsEmpty()){
            Collections.sort(Lista);
            JOptionPane.showMessageDialog(null,"El valor mas pequeño: " + Lista.get(0) + " y el mayor valor: " + Lista.get(Lista.size()-1));
        }
        else{
            System.out.println("La lista esta vacia...");
        }
    }
    
    static public void BorrarValor() throws Exception{
        if(!ListIsEmpty()){
            Double valor = PedirNumero();
            if(Lista.remove(valor)){
                JOptionPane.showMessageDialog(null, "Se ha borrado el valor");
            }
            else{
                JOptionPane.showMessageDialog(null, "No se ha encontado el numero a eliminar");
            }
                
        }
        else{
            System.out.println("La lista esta vacia...");
        }
    }
    
    static public void ConvertirArray()throws Exception{
        if(!ListIsEmpty()){
            Double [] array = new Double[Lista.size()];
            //array = Lista.toArray(new Double[Lista.size()]);
            int contador = 0;
            for(Double elemento: Lista){
                    array[contador]= elemento;
                    contador++;
                }
            JOptionPane.showMessageDialog(null,"Se ha generado una copia del array");
        }
        else{
            System.out.println("La lista esta vacia...");
        }
    }
    
    static public void MostrarElementos(){
        if(!Lista.isEmpty()){
            String lista_elementos = "LISTA DE ELEMENTOS \n";
            System.out.println("La lista tiene " + Lista.size() + " elementos");
            for(Double elemento: Lista){
                lista_elementos +=elemento + ", ";
            }
            JOptionPane.showMessageDialog(null, lista_elementos);
        }
        else{
            System.out.println("La lista esta vacia...");
        }
    }
    
    static public void AnadirElemento() throws Exception{ 
        Double valor = PedirNumero();
        Lista.add(valor);        
    }
    
    static public void AnadirElementoPosicion() throws Exception{
        Double valor = PedirNumero();
        int index = PedirPosicion();
        Lista.add(index, valor);
    }
    
    static public void BorrarElementoPosicion() throws Exception{
        int index = PedirPosicion();
        Lista.remove(index);
    }
    
    static public void SumaMedia() throws Exception{
        if(!ListIsEmpty()){
            double suma = 0.0;
            double contador = 0;
            //suma = Lista.stream().forEach((elemento)->  Double.valueOf(elemento));
            for(Double elemento: Lista){
                suma +=elemento;
                contador ++;
            }
            JOptionPane.showMessageDialog(null, "La suma de los valores es " + suma + " y la media es " + (suma/contador));
        }
        else{
            System.out.println("La lista esta vacia...");
        }
    }
    
    static public void BuscarNumero(){
        if(!ListIsEmpty()){
            Double num = PedirNumero();
            Integer index =Lista.indexOf(num);
            if(index == -1){
                JOptionPane.showMessageDialog(null, "No se ha encontado ese valor");
            }
            else{
                JOptionPane.showMessageDialog(null, "La primera aparcicion de ese valor es en la posicion " + index);
            }
        }
        else{
            System.out.println("La lista esta vacia...");
        }
    }
    
    static public double PedirNumero(){
        Double num= 0.0;
        try{
            num = Double.valueOf(JOptionPane.showInputDialog(null, "Introduce los valores a alamacenar:"));
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Solo se admiten numeros...");
        }
        return num;
    }
    
    static public int PedirPosicion(){
        int num = 0;
        boolean ok = false;
        do{
            try{
                num = Integer.valueOf(JOptionPane.showInputDialog(null, "Introduce la posicion:"));
                if(num  >= Lista.size()){
                    throw new ArrayIndexOutOfBoundsException();
                }
                else{
                    ok = true;
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "Esa posicion no existe");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error inesperado");
            }
        }while(!ok);
        return num;
    }
    
    static public boolean ListIsEmpty(){
        if(!Lista.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }
    
    
    
}
