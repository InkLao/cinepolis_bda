/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import dtos.RegistroPeliculasDTO;
import entidad.Pelicula;

/**
 *
 * @author eduar
 */
public interface IPeliculaNegocio {
    void registrarPelicula(Pelicula pelicula);
    void registrarPelicula(RegistroPeliculasDTO peliculaDTO);
}
