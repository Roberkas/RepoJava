/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2clases;

import clases.Peliculas;
import clases.Estudio;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author 1gdaw06
 */
public class Practica2Clases {

    static ArrayList<Estudio> estudios;
    static ArrayList<Peliculas> peliculas;
    
    
    public static void main(String[] args) {
        LocalDate f= LocalDate.now();
        List<Integer> tel = new ArrayList();
        tel.add(654324352);
        Estudio e1 = new Estudio("Maxstar", "Los angeles", "valle piruleta", "www.patata.com", f, "turquia", (ArrayList) tel);
        Estudio e2 = new Estudio("Pixar", "marruecos", "valle piruleta", "www.patata.com", f, "turquia", (ArrayList) tel);

        estudios = new ArrayList();
        estudios.add(e1);
        estudios.add(e2);
        
        Peliculas p1 = new Peliculas("Hola", 1995, 83, "miedo", estudios);
        Peliculas p2 = new Peliculas("Adios", 2004, 45, "miedo", e2);
        Peliculas p3 = new Peliculas("UN  NUEVO DIA", 2012, 59, "miedo", e2);
        
        
        peliculas = new ArrayList();
        peliculas.add(p1);
        peliculas.add(p2);
        peliculas.add(p3);
        
        e1.AñadirPelicula(p1);
        e2.AñadirPelicula(p2);
        e2.AñadirPelicula(p3);
        
        Estudio_peli_larga();
        Estudio_mas_pelis();
        
        
    }
    public static void Estudio_peli_larga(){
        float duracion = 0;
        String nombre = "";
        for(Peliculas elemento : peliculas ){
            if(elemento.getDuracion()>duracion){
                duracion = elemento.getDuracion();
                for(int i = 0; i <  elemento.getEstudios().size(); i++)
                nombre +="/" + elemento.getEstudios().get(i).getNombre();
            }        
        }
        System.out.println("El estudio que produjo la peli mas larga es " + nombre);
    }
    
    public static void Estudio_mas_pelis(){
        int a=0;
        int index = 0;
        //int[] n_pelis= new int[estudios.size()]; //sera concurrente a los estudios
        //Arrays.fill(n_pelis, 0);
        int n_pelis = 0;
        String estudio_mas_pelis = "";
        
        for(Estudio elemento : estudios){
            if(elemento.getPeliculas().size()>n_pelis){
                n_pelis = elemento.getPeliculas().size();
                estudio_mas_pelis = elemento.getNombre();
            }
        }
        System.out.println("El estudio con mas pelis es " + estudio_mas_pelis);
        
    }
    
}
