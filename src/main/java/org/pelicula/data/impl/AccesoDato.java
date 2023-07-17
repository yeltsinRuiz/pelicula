package org.pelicula.data.impl;

import org.pelicula.data.IAccesoDato;
import org.pelicula.domain.Pelicula;
import org.pelicula.exception.AccesoDatosEx;
import org.pelicula.exception.EscrituraDatosEx;
import org.pelicula.exception.LecturaDatosEx;

import java.util.List;

public class AccesoDato implements IAccesoDato {
    @Override
    public boolean existe(String nombreRecurso) throws AccesoDatosEx {
        return false;
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
        return null;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {

    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
        return null;
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {

    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosEx {

    }
}
