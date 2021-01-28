/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.ig4;

import Vista.v1;
import Vista.vcompras;
import Vista.vventas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class PracticaIG4 { //Tremendo fallo meter los prductos y sus atributos en ArrayList.....

    public static ArrayList<String> productos = new ArrayList();
    public static ArrayList<Integer> precio_productos = new ArrayList();
    public static ArrayList<Integer> cantidad_productos = new ArrayList();
    
    public static String ventas =  "*****************Productos vendidos******************\n";
    public static String compras = "*****************Productos comprados*****************\n";
    
    public static v1 v1 = new v1();
    public static vventas vventas = new vventas();
    public static vcompras vcompras = new vcompras();
    
    public static void main(String[] args) {
        GenerarInventario();
        v1.setVisible(true);
    }
    
    
    public static void GenerarInventario(){
        productos.add("Caramelo");
        precio_productos.add(1);
        cantidad_productos.add(5);
        
        productos.add("Arroz");
        precio_productos.add(2);
        cantidad_productos.add(3);
        
        productos.add("Silla");        
        precio_productos.add(23);
        cantidad_productos.add(6);
        
        productos.add("Mesa");
        precio_productos.add(43);        
        cantidad_productos.add(2);
        
        
        productos.add("Cubiertos");
        precio_productos.add(5);
        cantidad_productos.add(3);
        
        productos.add("Galletas");
        precio_productos.add(1);
        cantidad_productos.add(25);
    }
    
    
    public static int AñadirVenta(String producto, Integer cantidad){
        int posicion;
        int precio = 0;
        for(String elemento : productos){
            if(elemento.equalsIgnoreCase(producto)){
                posicion = productos.lastIndexOf(elemento);
                precio = precio_productos.get(posicion);
                cantidad_productos.add(posicion, (cantidad_productos.get(posicion) - cantidad));
                ventas += elemento + "  : " + cantidad + "\n";
            }
        }
        return cantidad*precio;
        
    }
    
    
    
    
    
    
    public static void AñadirCompra(String producto, int cantidad, int precio){
        int posicion;
        for(String elemento : productos){
            if(elemento.equalsIgnoreCase(producto)){
                posicion = productos.lastIndexOf(elemento);
                precio_productos.remove(posicion);
                precio_productos.add(posicion, precio);
                cantidad_productos.add(posicion, (cantidad_productos.get(posicion) + cantidad));
                compras += elemento + "  : " + cantidad + " Precio Unidad: " + precio + "\n" ;
                JOptionPane.showMessageDialog(null, "La compra ha sido efectuada");
            }
        }
        
    }
    
    public static void MostrarOperaciones(){
        JOptionPane.showMessageDialog(v1, ventas + "\n \n" + compras);
    }
    
    
    public static void AbrirVentas(){
        vventas.setVisible(true);
    }
    
    public static void AbrirCompras(){
        vcompras.setVisible(true);
    }
    
    public static void SalirVentas(){
        vventas.dispose();
    }
    
    public static void SalirCompras(){
        vcompras.dispose();
    }
    public static void Salir(){
        MostrarOperaciones();
        v1.dispose();
        System.exit(0);
    }
    
}
