package org.pelicula.service.impl;

import org.pelicula.data.IAccesoDato;
import org.pelicula.data.impl.AccesoDato;
import org.pelicula.service.ICatalogoPelicula;

public class CatalogoPelicula implements ICatalogoPelicula {
    private final IAccesoDato dato;

    public CatalogoPelicula() {
        this.dato=new AccesoDato();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {

    }

    @Override
    public void listarPeliculas() {

    }

    @Override
    public void buscarPeliculas(String nombre) {

    }

    @Override
    public void iniciarCatalogoPeliculas() {

    }
}
