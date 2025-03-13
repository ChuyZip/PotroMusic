/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.music.entidades;

/**
 *
 * @author rosales
 */
public class Artista {

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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the sitioweb
     */
    public String getSitioweb() {
        return sitioweb;
    }

    /**
     * @param sitioweb the sitioweb to set
     */
    public void setSitioweb(String sitioweb) {
        this.sitioweb = sitioweb;
    }
    
    private String nombre;
    
    private String descripcion;
    
    private String sitioweb;
}
