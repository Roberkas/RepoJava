/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import clases.Estudio;
import java.util.ArrayList;


public class Peliculas {
    private String titulo;
    private int ano;
    private float duracion;
    private String tipo;
    ArrayList<Estudio> Estudios;
    

    public Peliculas(String titulo, int ano, float duracion, String tipo, ArrayList<Estudio> Estudios) {
        this.titulo = titulo;
        this.ano = ano;
        this.duracion = duracion;
        this.tipo = tipo;
        this.Estudios = new ArrayList();
        this.Estudios = Estudios;
    }
    
    public Peliculas(String titulo, int ano, float duracion, String tipo, Estudio Estudios) {
        this.titulo = titulo;
        this.ano = ano;
        this.duracion = duracion;
        this.tipo = tipo;
        this.Estudios = new ArrayList();
        this.Estudios.add(Estudios);
    }

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Estudio> getEstudios() {
        return Estudios;
    }

    public void setEstudios(ArrayList<Estudio> Estudios) {
        this.Estudios = Estudios;
    }
    
    public void setEstudio(Estudio estudio) {
        this.Estudios.add(estudio);
    }
    
    
    
    
}
