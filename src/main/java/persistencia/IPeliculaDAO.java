/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import entidad.Pelicula;

/**
 *
 * @author eduar
 */
public interface IPeliculaDAO {
    void guardar(Pelicula pelicula);
    Pelicula obtenerPorId(int id);
    Pelicula obtenerPorTitulo(String titulo);
}
