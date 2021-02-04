/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4.ig;

import Modelo.Producto;
import Modelo.Proveedor;
import Vista.V1;
import Vista.VCompra;
import Vista.VVenta;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw06
 */
public class Practica4IG {

    public static ArrayList<Proveedor> proveedores = new ArrayList();
    public static ArrayList<Producto> productos = new ArrayList();
    
    public static Producto p1 = new Producto("Mesa", 23, 34);
    public static Producto p2 = new Producto("Silla", 40, 15);
    
    public static Proveedor pr1 = new Proveedor("Megamax S.A");
    public static Proveedor pr2 = new Proveedor("SuperElectronica");
    public static Proveedor pr3 = new Proveedor("MediaMarkt");
    
    
    public static String compras = "Producto---Proveedor---Unidades---Precio---Total\n";
    public static String ventas = "Producto---Unidades---Precio---Total\n";
    
    static public V1 V1;
    static public VCompra vcompra;
    static public VVenta vventa;
    
    
    
    public static void main(String[] args) {
        V1 = new V1();
        V1.setVisible(true);
        
        productos.add(p1);
        productos.add(p2);
        
        proveedores.add(pr1);
        proveedores.add(pr2);
        proveedores.add(pr3);
        
        //AbrirVCompra(p1, "23");
        //AbrirVVenta(p1, "23");
        
    }
    public static void AbrirVCompra(Producto producto, String unidades){
        vcompra = new VCompra(producto, unidades);
        vcompra.setVisible(true);
    }
    
    public static void AbrirVVenta(Producto producto, String unidades){
        vventa = new VVenta(producto, unidades);
        vventa.setVisible(true);
    }
    
    
    public static double DeclararCompra(Producto producto, double unidades, double precio, Proveedor proveedor ){
        double total = unidades * precio;
        compras += producto.getNombre() + "--" + proveedor.getNombre() + "--" +  unidades + "--" + precio + "-->" + total;
        JOptionPane.showMessageDialog(vcompra, "Se ha registrado la compra");
        return total;
        
    }
    
    public static double DeclararVenta(Producto producto, int unidades, double precio, String cliente, boolean descuentovolumen, boolean descuentoprontopago ){
        int descuento=0;
        if(descuentovolumen){
            descuento=2;
        }
        if(descuentoprontopago){
            descuento+=3;
        }
        double total = (unidades * precio)*(100-descuento);
        ventas += producto.getNombre() + "--" + cliente + "--" +  unidades + "--" + precio + "-->" + total;
        JOptionPane.showMessageDialog(vcompra, "Se ha registrado la venta");
        return total;
    }
    
    public static void Salir(javax.swing.JFrame ventana){
        if(ventana.getClass().getSimpleName().equalsIgnoreCase("V1")){
            ventana.dispose();
            System.exit(0);
        }
        else{
            ventana.dispose();
        }
    }
    
    public static void AnadirItems(ArrayList<Proveedor> items, javax.swing.JComboBox<String> lista){
        try{
            for(Proveedor elemento: items){ 
                lista.addItem(elemento.getNombre());
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
    public  static Producto ComprobarProducto(String producto){
        Producto p = null;
        for(Producto elemento: productos){ 
           if(producto.equalsIgnoreCase(elemento.getNombre())){
               p = elemento;
               return p;
           }
        }
        return p;
    }

    
}
