/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.music.entidades;

import java.util.ArrayList;
import java.util.List;
import mx.itson.music.enums.Genero;

/**
 *
 * @author rosales
 */
public class Album {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the artista
     */
    public Artista getArtista() {
        return artista;
    }

    /**
     * @param artista the artista to set
     */
    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    /**
     * @return the lanzamiento
     */
    public int getLanzamiento() {
        return lanzamiento;
    }

    /**
     * @param lanzamiento the lanzamiento to set
     */
    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    /**
     * @return the canciones
     */
    public List<Cancion> getCanciones() {
        // Asegurarse de que canciones nunca sea null
        if (canciones == null) {
            canciones = new ArrayList<>();
        }
        return canciones;
    }

    /**
     * @param canciones the canciones to set
     */
    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    /**
     * @return the genero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    private String nombre;
    
    private Artista artista;
    
    private int lanzamiento;
    
    private List<Cancion> canciones;
    
    private Genero genero;

    // Constructor para inicializar la lista canciones
    public Album() {
        this.canciones = new ArrayList<>();
    }

    // Método para asignar el ArrayList de canciones al atributo canciones
    public void setCancion(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
}