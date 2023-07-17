package org.pelicula.service;

public interface ICatalogoPelicula {
    String NOMBRE_RECURSO="peliculas.txt";
    void agregarPelicula(String nombrePelicula);
    void listarPeliculas();
    void buscarPeliculas(String nombre);
    void iniciarCatalogoPeliculas();

}
