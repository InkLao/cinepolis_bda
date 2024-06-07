/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import entidad.Pelicula;
import persistencia.PeliculaDAO;

/**
 *
 * @author eduar
 */
public class PeliculaNegocio {
    private PeliculaDAO peliculaDAO;

    public PeliculaNegocio() {
        this.peliculaDAO = new PeliculaDAO();
    }

    public void registrarPelicula(Pelicula pelicula) {
        peliculaDAO.guardar(pelicula);
    }

    public Pelicula buscarPeliculaPorId(int id) {
        return peliculaDAO.obtenerPorId(id);
    }
}
