package org.pelicula.data;
import org.pelicula.domain.Pelicula;
import org.pelicula.exception.AccesoDatosEx;
import org.pelicula.exception.EscrituraDatosEx;
import org.pelicula.exception.LecturaDatosEx;

import java.util.List;

public interface IAccesoDato {
    boolean existe(String nombreRecurso)throws AccesoDatosEx;
    List<Pelicula>listar(String nombreRecurso)throws LecturaDatosEx;
    void escribir(Pelicula pelicula,String nombreRecurso, boolean anexar) throws EscrituraDatosEx;
    String buscar(String nombreRecurso,String buscar) throws LecturaDatosEx;
    void crear(String nombreRecurso) throws AccesoDatosEx;
    void borrar(String nombreRecurso)throws AccesoDatosEx;
}
