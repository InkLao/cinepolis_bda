/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dtos.RegistroPeliculasDTO;
import entidad.Pelicula;
import persistencia.IPeliculaDAO;
import persistencia.PeliculaDAO;

/**
 *
 * @author eduar
 */
public class PeliculaNegocio implements IPeliculaNegocio{
    private IPeliculaDAO peliculaDAO;

    public PeliculaNegocio() {
        this.peliculaDAO = new PeliculaDAO();
    }

    @Override
    public void registrarPelicula(Pelicula pelicula) {
        peliculaDAO.guardar(pelicula);
    }

    @Override
    public Pelicula buscarPeliculaPorId(int id) {
        return peliculaDAO.obtenerPorId(id);
    }

    @Override
    public void registrarPelicula(RegistroPeliculasDTO peliculaDTO) {
        Pelicula pelicula = new Pelicula(
                peliculaDTO.getTitulo(),
                peliculaDTO.getClasificacion(),
                peliculaDTO.getDuracion(),
                peliculaDTO.getPais(),
                peliculaDTO.getSinopsis(),
                peliculaDTO.getTrailer()
        );
        peliculaDAO.guardar(pelicula);
    }
    }

