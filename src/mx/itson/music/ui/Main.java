/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.music.ui;

import java.util.ArrayList;
import java.util.Scanner;
import mx.itson.music.entidades.Artista;
import mx.itson.music.entidades.Cancion;
import mx.itson.music.entidades.Album;
import mx.itson.music.enums.Genero;

/**
 *
 * @author rosales
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Datos del artista
            Artista artista = new Artista();
            
            System.out.println("Escribe el nombre del artista: ");
            String nombreArtista = scanner.nextLine();
            artista.setNombre(nombreArtista);
            
            System.out.println("Escribe el sitio web: ");
            String sitioWeb = scanner.nextLine();
            artista.setSitioweb(sitioWeb);
            
            System.out.println("Escribe la descripcion: ");
            String descripcion = scanner.nextLine();
            artista.setDescripcion(descripcion);
            
            // Datos del album
            System.out.println("Escribe el nombre del album: ");
            String nombreAlbum = scanner.nextLine();
            
            System.out.println("Escribe el ano de lanzamiento: ");
            int anioLanzamiento = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            
            Album a = new Album();
            a.setNombre(nombreAlbum);
            a.setLanzamiento(anioLanzamiento);
            a.setArtista(artista);
            a.setGenero(Genero.OTRO);
            
            // Solicitar al usuario la cantidad de canciones y sus datos
            System.out.println("¿Cuantas canciones deseas agregar? ");
            int numeroCanciones = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            
            // Crea un ArrayList para almacenar las canciones ingresadas por el usuario
            ArrayList<Cancion> canciones = new ArrayList<>();
            
            // Este bucle itera segun la cantidad de canciones que el usuario desea agregar
            for (int i = 0; i < numeroCanciones; i++) {
                
                // Imprime el numero de la cancion (i + 1) para indicar al usuario cual cancion esta ingresando
                System.out.println("Datos de la cancion " + (i + 1) + ":");
                
                // Crea un nuevo objeto Cancion para almacenar los datos de cada cancion ingresada
                Cancion c = new Cancion();
                System.out.println("Escribe el nombre de la cancion: ");
                String nombreCancion = scanner.nextLine();
                c.setNombre(nombreCancion);
                
                System.out.println("Escribe la duracion en segundos: ");
                int duracion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                c.setDuracion(duracion);
                
                canciones.add(c);
            }
            
            // Pasamos el ArrayList al album
            a.setCancion(canciones);
            
            // Mostrar resultado usando numeroCanciones como contador
            System.out.println("PotroMusic presenta el album " + a.getNombre() 
                + " del artista " + a.getArtista().getNombre() 
                + " lanzado en " + a.getLanzamiento() 
                + " contiene " + numeroCanciones + " canciones:");
            
            // Bucle para mostrar todas las canciones ingresadas usando numeroCanciones
            // Este bucle recorre cada cancion ingresada por el usuario desde 0 hasta numeroCanciones - 1
            for (int i = 0; i < numeroCanciones; i++) {
                
                // Imprime el numero de la cancion (i + 1) seguido de su nombre y duracion
                // a.getCanciones().get(i) accede a la cancion en la posicion i del ArrayList
                System.out.println((i + 1) + ". " + a.getCanciones().get(i).getNombre() 
                    + " - " + a.getCanciones().get(i).getDuracion() + " segundos");
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error en PotroMusic: " + e.getMessage());
        }
    }
}